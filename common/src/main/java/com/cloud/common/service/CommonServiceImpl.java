package com.cloud.common.service;

import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {

    public CommonServiceImpl(){
        System.out.println("load CommonServiceImpl !");
    }

    public void say(){
        System.out.println("hhhhhhhhhhhhhhhh");
    }
}
