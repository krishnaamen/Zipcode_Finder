package com.krish.controller;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileHandler fh = new FileHandler();
        boolean sentinel = true;

        while(sentinel) {
            System.out.println("Do you want to see the city from zipcode y/n");
            char ans = sc.next().toLowerCase().charAt(0);
            if (ans == 'y') {
                try {
                    System.out.println("Please Enter the  postal code to see your city:");
                    int userCode = sc.nextInt();
                    if (fh.zipcodeList.contains(userCode)) {
                        for (int i = 0; i < fh.cityList.size(); i++) {
                            if (userCode == fh.zipcodeList.get(i)) {
                                System.out.println("\n\nThe city name for the zip code is\n===============================\n" + "         " + fh.cityList.get(i) + "\n===============================\n\n");
                            }
                        }
                    } else {

                        System.out.println("Opps!! you enter the postal code which doesnot exist please try again with valid postal code");

                    }
                }catch (InputMismatchException e){
                    System.out.println("Please only enter the valid number not any letters or words");
                    sentinel=false;
                }
            }

            else if(ans =='n'){
                System.out.println("Thank you for using Krishna's  software, have a nice day...........");
                sentinel=false;
            }
            else{
                System.out.println("Invalid input");
            }
        }


    }
}
