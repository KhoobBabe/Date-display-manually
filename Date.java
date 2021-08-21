package com.khubaib;

import java.util.Scanner;

public class Date {

    //variables declared
    int date;
    int month;
    int year;

    //date class
    Date(int day, int mon, int yer){
        date = day;
        month = mon;
        year = yer;
    }

    //displays the date in a format
    String DisplayDate(){
        return (date+" / "+month+" / "+year);
    }
}

class DateTest {

    public static void main(String[] args) {

        //declaring input
        Scanner input = new Scanner(System.in);


        System.out.print("enter the date: ");
        int date = input.nextInt();//input for date
        System.out.print("enter the month: ");
        int month = input.nextInt();//input for month
        System.out.print("enter the year: ");
        int year = input.nextInt();//input for year

        //method called
        Date date1 = new Date(date,month, year);

        System.out.println();

        //output displayed
        System.out.println(date1.DisplayDate());

    }
}
