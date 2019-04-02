package com.example.demospringbootfirst;

import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
/**
 * @ClassName PersonTest
 * @Author wuzhiyong
 * @Date 2019/3/9 15:56
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {
    @Test
    public void testjson(){
        Map m = new HashMap(3);
        m.put("code",100);
        m.put("msg","testsets");
        m.put("data",new Object[]{2,"34",444,"dfsf"});
        JSONObject object = JSONObject.fromObject(m);
        System.out.println(object);

    }
}
