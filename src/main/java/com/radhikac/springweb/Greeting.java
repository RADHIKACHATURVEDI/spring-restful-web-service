package com.radhikac.springweb;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Greeting {
    public long id;
    public String content;    
    public Greeting(long incrementAndGet, String format) {
        this.id = incrementAndGet;
        this.content = format;  
    }
}
