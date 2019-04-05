package com.the224.orbital.service;

import com.the224.orbital.domain.File;
import com.the224.orbital.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class FileService extends Service {

    @Autowired
    private FileRepository fileRepository;


    public FileService() {}


    public String createFile() {

        // Utils.jsonReply

        // TODO create the file

        return "Todo";
    }


    public File getById(Long id) {
        return fileRepository.findById(id);
    }

    public void remove(File file) {
        // TODO
    }

}