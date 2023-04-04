package com.hw10;


public class Main {
    public static void main(String[] args) {
        FileNavigator exm = new FileNavigator();
        FileData fileData = new FileData("VVVVV", 5, "/path/to/file");
        System.out.println(exm.mapOfFiles);
        exm.add(fileData);
        System.out.println(exm.mapOfFiles);
        FileData fileData1 = new FileData("VVVVV1", 4, "/pathhj/to/file32");
        FileData fileData2 = new FileData("VVVVV1", 6, "/path/to/file32");
        FileData fileData3 = new FileData("VVVVV1", 5, "/path/to/file67");
        exm.add(fileData1);
        exm.add(fileData2);
        exm.add(fileData3);
        System.out.println(exm.mapOfFiles);
        var fileData4 = exm.find("/path/to/file32");
        System.out.println(fileData4);
        var fileData5 = exm.filterBySize(5);
        System.out.println(fileData5);
//        exm.remove("/path/to/file32");
//        System.out.println(exm.mapOfFiles);
        System.out.println(exm.sortBySize());
    }
}
