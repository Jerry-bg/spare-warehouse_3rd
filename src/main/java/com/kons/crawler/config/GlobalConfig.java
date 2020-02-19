package com.kons.crawler.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class GlobalConfig {
    private final static ClassLoader cla=ClassLoader.getSystemClassLoader();

    public final static HashMap<String,String> configMap=new HashMap<>();

    static {
        InputStream stream=cla.getResourceAsStream("config/config-crawler.properties");
        Properties properties=new Properties();
        try {
            properties.load(stream);
            Set set = (Set) properties.keySet();
            Iterator iterator=set.iterator();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                String value=properties.getProperty(key);
                configMap.put(key,value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
