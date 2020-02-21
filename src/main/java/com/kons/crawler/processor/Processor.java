package com.kons.crawler.processor;

import com.kons.crawler.response.HttpResponse;

import java.util.List;

public interface Processor {

    <T> T handler(HttpResponse resp);

    <T> List<T> handlerBack(HttpResponse resp);
}
