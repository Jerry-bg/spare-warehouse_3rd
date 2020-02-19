package com.kons.crawler.schedule;

import com.kons.crawler.request.HttpGetRequest;

import java.util.concurrent.LinkedBlockingQueue;

public class RequestSchedule {
    private LinkedBlockingQueue<HttpGetRequest> startQueue;

    public RequestSchedule(){
        startQueue=new LinkedBlockingQueue<>();
    }

    public HttpGetRequest out(){
        try {
            return startQueue.take();
        }catch (InterruptedException ex){
            ex.printStackTrace();
            return null;
        }
    }

    public void into(HttpGetRequest connection){
        try{
            startQueue.put(connection);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public int size(){
        return startQueue.size();
    }

    public boolean isEmpty(){
        return startQueue.isEmpty();
    }
}
