package com.the224.orbital.domain;

public class File {

    private String name;
    private String path;
    private Long size;
    private String extension;
    private boolean readonly = true;

    public File(String path) {
        this.path = path;
    }



}
