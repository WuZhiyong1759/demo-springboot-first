package com.example.demospringbootfirst.model;

import javax.activation.DataHandler;
/**
 * @ClassName BinaryFile
 * @Author wuzhiyong
 * @Date 2019/3/9 19:19
 * @Version 1.0
 **/
public class BinaryFile {
    String title;
    DataHandler BinaryData;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DataHandler getBinaryData() {
        return BinaryData;
    }

    public void setBinaryData(DataHandler binaryData) {
        BinaryData = binaryData;
    }
}
