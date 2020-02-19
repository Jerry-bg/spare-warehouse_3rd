package com.kons.cache;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextHolder implements ApplicationContextAware {
    public static ApplicationContext ctx;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx=applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return ctx;
    }

    public static <T> T getBean(Class<T> cla){
        return ctx.getBean(cla);
    }

    public static <T> T getBean(String bean){
        return (T) ctx.getBean(bean);
    }
}
