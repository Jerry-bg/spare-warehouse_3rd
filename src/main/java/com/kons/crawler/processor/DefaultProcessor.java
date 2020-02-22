package com.kons.crawler.processor;

import com.alibaba.fastjson.JSON;
import com.kons.crawler.response.HttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DefaultProcessor extends AbstractProcessor {

    private Object data;
    private Class aClass;

    @Override
    public void handler(HttpResponse response) throws IOException {
        ByteArrayInputStream stream=response.getData();
        byte[] buff=new byte[1024];
        int len=-1;
        StringBuilder str=new StringBuilder();
        while ((len=stream.read(buff,0,buff.length))!=-1)
            str.append(new String(buff,0,len));
        data= JSON.parseObject(str.toString(),aClass);
        stream.close();
    }

    public Object getData() {
        return data;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
