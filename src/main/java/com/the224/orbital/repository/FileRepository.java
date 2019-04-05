package com.the224.orbital.repository;

import com.the224.orbital.domain.File;
import com.the224.orbital.domain.Folder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FileRepository {

    private Folder rootFolder = new Folder("./file");

    private FileRepository() {

    }

    public List<File> findAll() {
        return null;
    }

    public List<File> findByTitle(String title) {
        return null;
    }

    public File findById(Long EpicId) {
        return null;
    }

}
