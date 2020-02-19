package com.kons.crawler.schedule;

import com.kons.crawler.request.HttpGetRequest;

import java.net.MalformedURLException;
import java.net.URL;

public class ScheduleStart {
    private RequestSchedule requestSchedule;

    public ScheduleStart(){
        requestSchedule = new RequestSchedule();
    }

    public void start() throws MalformedURLException {
        HttpGetRequest request = new HttpGetRequest(new URL(""));
        requestSchedule.into(request);
    }
}
