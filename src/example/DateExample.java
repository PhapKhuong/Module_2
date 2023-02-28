package example;

import java.util.Date;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;

public class DateExample {

    public static void main(String[] args) {

        //getting current date and time using Date class

        System.out.println("Using Date class:");

        System.out.println("The formatted date and time is:");

        DateFormat df = new SimpleDateFormat("dd/MM/yy");

        Date d = new Date();

        System.out.println(df.format(d));

        //getting current date time using calendar class

        System.out.println("\nUsing Calendar class:");

        System.out.println("The formatted date and time is:");

        Calendar calobj = Calendar.getInstance();

        System.out.println(df.format(calobj.getTime()));

    }

}