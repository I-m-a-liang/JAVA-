package com.imooc.framwork.aop;

public class RealPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("作为用户我只关心支付功能");
    }
}
