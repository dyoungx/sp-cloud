package com.cloud.common.biz;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

public class SSBiz implements ApplicationRunner {

    private String s;

    public SSBiz() {
        this.s = "talk ..";
        System.err.println("empty SSBiz");
    }

    public SSBiz(String s) {
        this.s = s;
        System.err.println("SSBiz with a rgs");
    }

    public String talk(){
        System.err.println("talk........");
        return s;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.err.println("SSBiz run.........");
    }
}
