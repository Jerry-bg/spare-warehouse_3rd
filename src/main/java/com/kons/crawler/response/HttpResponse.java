package com.kons.crawler.response;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class HttpResponse {
    private InputStream data;
    private Map<String, List<String>> header;

    public InputStream getData() {
        return data;
    }

    public void setData(InputStream data) {
        this.data = data;
    }

    public Map<String, List<String>> getHeader() {
        return header;
    }

    public void setHeader(Map<String, List<String>> header) {
        this.header = header;
    }
}
