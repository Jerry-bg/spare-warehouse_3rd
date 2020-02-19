package com.kons.crawler.handler;

import com.kons.crawler.request.HttpGetRequest;
import org.springframework.lang.Nullable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Crawler{

    public static String start(String url,@Nullable String cookie) throws IOException {
        URLConnection connection=null;
        HttpGetRequest request=new HttpGetRequest(new URL(url));
        if(cookie != null) request.setCookie(cookie);

        connection=request.getConnection();
        InputStream stream=connection.getInputStream();
        BufferedReader reader=new BufferedReader(new InputStreamReader(stream,"gbk"));

        StringBuilder stringBuilder=new StringBuilder();
        String line;
        while ((line=reader.readLine())!=null)
            stringBuilder.append(line);
        return stringBuilder.toString();
    }
}
