package com.the224.orbital.service;

public class Service {

    protected static Long currentId = 1L;


    public Service() {}


    public static Long getCurrentId() {
        return currentId;
    }


    protected static void incrementCurrentId() {
        currentId++;
    }

}