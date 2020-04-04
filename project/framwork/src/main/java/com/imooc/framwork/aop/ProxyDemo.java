package com.imooc.framwork.aop;

public class ProxyDemo {
    public static void main(String[] args) {
         Payment proxy = new Alipay(new RealPayment());
         proxy.pay();
    }
}
