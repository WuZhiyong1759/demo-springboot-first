package com.example.demospringbootfirst.soapService.impl;

import com.example.demospringbootfirst.model.BinaryFile;
import com.example.demospringbootfirst.soapService.CommonService;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.*;
/**
 * @ClassName CommonServiceImpl
 * @Author wuzhiyong
 * @Date 2019/3/9 19:11
 * @Version 1.0
 **/
@Service
public class CommonServiceImpl implements CommonService {
    @Override
    public String sayHello(String name) {
        return "Hello ," + name;
    }

    @Override
    public BinaryFile downloadFile(String fileName) {
        BinaryFile file = new BinaryFile();
        file.setTitle(fileName);
        DataSource source = new FileDataSource(new File("d:" + File.separator + fileName));
        file.setBinaryData(new DataHandler(source));
        return file;
    }

    @Override
    public boolean uploadFile(BinaryFile file) {
        DataHandler dataHandler = file.getBinaryData();
        String fileTitle = file.getTitle();

        try (
                InputStream is = dataHandler.getInputStream();
                OutputStream os = new FileOutputStream(new File("d:" + File.separator + fileTitle));
                BufferedOutputStream bos = new BufferedOutputStream(os))
        {

             byte[] buffer = new byte[100000];
             int bytesRead = 0;
             while ((bytesRead = is.read(buffer)) != -1) {
                  bos.write(buffer, 0, bytesRead);
              }

             bos.flush();
         } catch (IOException e) {
             e.printStackTrace();
             return false;
         }
        return true;
    }
}
