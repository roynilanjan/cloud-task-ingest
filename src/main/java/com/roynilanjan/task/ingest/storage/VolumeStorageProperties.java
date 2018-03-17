package com.roynilanjan.task.ingest.storage;

import org.springframework.stereotype.Component;

@Component
public class VolumeStorageProperties {
    /**
     * NFS location for storing files
     */
    //private String location = "upload-dir";
    private String location = "file:///var/vcap/data/25e99105-be2c-4c9f-88c9-2fcea54e62b6/";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
