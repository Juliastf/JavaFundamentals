package com.company;

import java.io.FileInputStream;

/**
 * Created by nikijul on 01.02.2017.
 */
public class ReadFile {
    public static void main(String[] args) {

        String path="C:\\Users\\nikijul\\Desktop\\New folder\\blog-master\\Files - LAB\\input.txt"

                try (FileInputStream fis=new FileInputStream(path)){
                    int oneByte=fis.read();

                }
        String[] input=
    }
}
