package com.teresaj.demo.inter;

public class flydemo {
    public static void main(String[] args) {
        usefly(() -> System.out.println("222"));
    }

    public static void usefly(flyInter f){
        System.out.println("111");
    }
}
