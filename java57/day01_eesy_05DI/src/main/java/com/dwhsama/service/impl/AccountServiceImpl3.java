package com.dwhsama.service.impl;

import com.dwhsama.service.IAccountService;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl3 implements IAccountService {

    private String[] myStr;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStr));
        System.out.println(myList);
        System.out.println(myMap);
        System.out.println(mySet);
        System.out.println(myProps);
    }

}
