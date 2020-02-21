package com.kons.crawler.schedule;

import com.kons.crawler.request.HttpRequest;
import com.kons.crawler.response.HttpResponse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Schedule {
    public static LinkedBlockingQueue<HttpRequest> requestQueue=new LinkedBlockingQueue<HttpRequest>();
    public static Queue<HttpResponse> responsesQueue= new LinkedList<HttpResponse>();

    public static HttpRequest reqOut() throws InterruptedException {
        return requestQueue.take();
    }

    public static void reqIn(HttpRequest request) throws InterruptedException {
        requestQueue.put(request);
    }
}
