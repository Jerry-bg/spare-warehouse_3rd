package com.kons.crawler.downloader;

import com.kons.crawler.request.HttpRequest;
import com.kons.crawler.response.HttpResponse;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class DownLoader {

    public HttpResponse download(HttpRequest request) throws IOException {
        URL url=new URL(request.getUrl());
        URLConnection connection=url.openConnection();
        Map<String, String> map=request.getProperties();
        for (String key:map.keySet()){
            String value=map.get(key);
            connection.setRequestProperty(key,value);
        }

        InputStream stream=connection.getInputStream();

        HttpResponse response=new HttpResponse();
        response.setData(stream);
        response.setHeader(connection.getHeaderFields());
        stream.close();
        return response;
    }
}
