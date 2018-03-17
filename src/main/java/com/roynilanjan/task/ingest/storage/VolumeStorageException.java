package com.roynilanjan.task.ingest.storage;

public class VolumeStorageException extends RuntimeException{

    public VolumeStorageException(String message) {
        super(message);
    }

    public VolumeStorageException(String message, Throwable cause) {
        super(message, cause);
    }

}
