package com.the224.orbital.domain;

import java.util.List;

public class Folder {

    private List<File> files;
    private List<Folder> folders;
    private String path;

    public Folder(String path) {
        this.path = path;
    }




}
