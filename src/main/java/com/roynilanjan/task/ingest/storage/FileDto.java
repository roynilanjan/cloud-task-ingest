package com.roynilanjan.task.ingest.storage;

public class FileDto {
    private String fileName;
    private String nfsPath;

    public String getNfsPath() {
        return nfsPath;
    }

    public void setNfsPath(String nfsPath) {
        this.nfsPath = nfsPath;
    }


    public FileDto(String filename,String nfsPath) {
        this.fileName = filename;
        this.nfsPath = nfsPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
