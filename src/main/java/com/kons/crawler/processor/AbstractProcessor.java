package com.kons.crawler.processor;

import com.kons.crawler.response.HttpResponse;

import java.io.IOException;

public abstract class AbstractProcessor {

    abstract public void handler(HttpResponse response) throws IOException;
}
