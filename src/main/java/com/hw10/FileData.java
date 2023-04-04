package com.hw10;


public class FileData  {
    private String nameFile;
    private long size;
    private String path;

    public FileData(String nameFile, long size, String path) {
        this.nameFile = nameFile;
        this.size = size;
        this.path = path;
    }

    public String getNameFile() {
        return nameFile;
    }

    public long getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "nameFile='" + nameFile + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }

  }
