package com.demo.starter.service;

/**
 * 描述：
 *
 * @Author shf
 * @Date 2019/5/7 21:59
 * @Version V1.0
 **/
public class DemoService {
    public String sayWhat;
    public String toWho;
    public DemoService(String sayWhat, String toWho){
        this.sayWhat = sayWhat;
        this.toWho = toWho;
    }
    public String say(){
        return this.sayWhat + "!  " + toWho;
    }
}
