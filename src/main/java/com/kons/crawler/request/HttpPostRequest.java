package com.kons.crawler.request;

public class HttpPostRequest extends HttpRequest{

    private String body;

    public HttpPostRequest(String url) {
        super(url);
    }
}
