package com.hw10;

import java.util.*;

public class FileNavigator {
    Map<String, List<FileData>> mapOfFiles = new HashMap();
    private String keyPath = "/path/to/file";

    public void add(FileData fileData) {
        List<FileData> listOfObjects = new ArrayList<>();
        listOfObjects.add(fileData);
        String pathToFile = fileData.getPath();
        if(!examination(pathToFile)){
            System.out.println("Не відповідає");
            return;
        }
        if (mapOfFiles.containsKey(pathToFile)) {
            List<FileData> newDataList = mapOfFiles.get(pathToFile);
            newDataList.add(fileData);
            mapOfFiles.put(pathToFile, newDataList);
        } else mapOfFiles.put(pathToFile, listOfObjects);

    }
private boolean examination (String pathToFile){
     return pathToFile.startsWith(keyPath);

}
    public List<FileData> find(String pathToFile) {
        return mapOfFiles.get(pathToFile);
    }

    public List<FileData> filterBySize(long volume) {
        List<FileData> newFileDate2 = new ArrayList<>();
        var values = mapOfFiles.values();
        for (List<FileData> value : values) {
            for (FileData fileData : value) {
                if (fileData.getSize() <= volume) {
                    newFileDate2.add(fileData);
                }

            }
        }
        return newFileDate2;
    }

    public void remove(String pathToFile) {
        mapOfFiles.remove(pathToFile);
    }

    public List<FileData> sortBySize() {
        List<FileData> newFileDate2 = new ArrayList<>();
        var values = mapOfFiles.values();
        for (List<FileData> value : values) {
            for (FileData fileData : value) {
                newFileDate2.add(fileData);
            }
        }
        Collections.sort(newFileDate2, Comparator.comparingLong(FileData::getSize));
        return newFileDate2;
    }
}
