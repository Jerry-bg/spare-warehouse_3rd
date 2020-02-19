package com.kons.crawler.request;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class HttpGetRequest {
    private static final String DEFAULT_USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36";
    private static final String DEFAULT_CHARSET = "GBK";

    private URL url;
    private String cookie;

    public HttpGetRequest(URL url){
        this.url=url;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public URLConnection getConnection() throws IOException {
        URLConnection connection=url.openConnection();
        connection.setRequestProperty("accept", "*/*");
        connection.setRequestProperty("connection", "Keep-Alive");
        connection.setRequestProperty("accept-charset",DEFAULT_CHARSET);
        connection.setRequestProperty("user-agent",DEFAULT_USER_AGENT);
        if(cookie!=null)
            connection.setRequestProperty("cookie",cookie);

        return connection;
    }
}
