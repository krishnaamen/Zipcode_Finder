package com.krish.controller;
import java.util.*;
import java.io.*;

public class FileHandler {
    ArrayList<Integer> zipcodeList = new ArrayList<>();
    ArrayList<String> cityList = new ArrayList<>();
    Scanner sc = null;

    public FileHandler() throws IOException {

        FileInputStream fis = new FileInputStream("src/com/krish/controller/city.txt");
        sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            int zipCode = sc.nextInt();
            zipcodeList.add(zipCode);
        }




    FileInputStream fis1=new FileInputStream("src/com/krish/controller/cityName.txt");
    Scanner s = new Scanner(fis1);
        while (s.hasNextLine()) {
        String city = s.nextLine();
        cityList.add(city);
    }



}}
