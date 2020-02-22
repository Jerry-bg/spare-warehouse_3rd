package com.kons.crawler;

import com.kons.crawler.downloader.AbstractDownloader;
import com.kons.crawler.downloader.DownLoader;
import com.kons.crawler.request.HttpRequest;
import com.kons.crawler.response.HttpResponse;
import com.kons.crawler.schedule.Schedule;

import java.io.IOException;

public class Spider implements Runnable{
    @Override
    public void run() {
        try {
            HttpRequest request = Schedule.reqOut();
            AbstractDownloader downloader=new DownLoader();
            HttpResponse response = downloader.download(request);
            Schedule.respIn(response);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
