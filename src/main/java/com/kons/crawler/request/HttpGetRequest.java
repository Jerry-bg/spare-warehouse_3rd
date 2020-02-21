package com.kons.crawler.request;

public class HttpGetRequest extends HttpRequest{

    public String param;

    public HttpGetRequest(String url) {
        super(url);
    }
}
