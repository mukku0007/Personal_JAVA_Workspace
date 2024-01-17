package com.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read_File {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String fileName = reader.readLine();
            FileInputStream fStream = new FileInputStream(fileName);
            BufferedInputStream bStream = new BufferedInputStream(fStream);
            while(bStream.available()>0){
                System.out.print((char)bStream.read());
            }
        }catch(IOException ex){ex.printStackTrace();}
    }
}
