package com.kons.cache;

import org.apache.ibatis.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RedisCache implements Cache {

    private final static Logger logger= LoggerFactory.getLogger(RedisCache.class);
    private final static long EXPIRE_TIME_IN_MINUTES=30;
    private final ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    private final String id;
    private RedisTemplate redisTemplate;

    public RedisCache(String id){
        if(id==null)
            throw new IllegalArgumentException("Cache instances require an ID.");
        logger.info("cache id is " + id);
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void putObject(Object key, Object value) {
        RedisTemplate redisTemplate1 =getRedisTemplate();
        ValueOperations valueOperations=redisTemplate1.opsForValue();
        logger.info("key:"+key.hashCode()+" value:" + value.toString());
        valueOperations.set(key.hashCode(),value,EXPIRE_TIME_IN_MINUTES, TimeUnit.MINUTES);
    }

    public Object getObject(Object o) {
        RedisTemplate redisTemplate1=getRedisTemplate();
        ValueOperations valueOperations=redisTemplate1.opsForValue();

        logger.info("key is" + o.hashCode());
        return valueOperations.get(o.hashCode());
    }

    public Object removeObject(Object o) {
        return getRedisTemplate().delete(o);
    }

    public void clear() {
        getRedisTemplate().execute((RedisCallback) connection ->{
            connection.flushDb();
            return null;
        });
    }

    public int getSize() {
        return 0;
    }

    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }

    private RedisTemplate getRedisTemplate(){
        if(redisTemplate==null)
            redisTemplate=ApplicationContextHolder.getBean("redisTemplate");
        return redisTemplate;
    }
}
