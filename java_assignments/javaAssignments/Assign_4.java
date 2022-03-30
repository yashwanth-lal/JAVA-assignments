package javaAssignments;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;


 class Solution {


    public static void printRange(int numberOfTestCases, Scanner keyboard) {
        try{

        while(numberOfTestCases > 0 ){
            String date1=keyboard.next();
            String date2=keyboard.next();
            Date signupDate=new SimpleDateFormat("dd-MM-yyyy").parse(date1);
            Date currentDate=new SimpleDateFormat("dd-MM-yyyy").parse(date2);
            if(currentDate.compareTo(signupDate)>0) {
                Date start,end,cal;
                cal=signupDate;
                cal.setYear(currentDate.getYear());
                Calendar calendar=Calendar.getInstance();
                calendar.setTime(cal);
                calendar.add(Calendar.DATE, 30);
                end=calendar.getTime();
                calendar.add(Calendar.DATE,-60);
                start=calendar.getTime();
                if(end.compareTo(currentDate)>0) {
                    end = currentDate;
                }
                SimpleDateFormat print=new SimpleDateFormat("dd-MM-yyyy");
                System.out.println(print.format(start)+"  "+print.format(end));

            }
            else{
                System.out.println("No range");
            }
            numberOfTestCases--;
        }
    }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numberOfTestCases;

        System.out.println("Enter No Of Test Case");
        numberOfTestCases = keyboard.nextInt();


        printRange(numberOfTestCases, keyboard);


    }
}
    //SimpleDateFormat class is used to both parse and format dates according to a formatting pattern you specify yourself.
    //The set(int calndr_field, int new_val) method in Calendar class is used to set the calndr_field value to a new_val. The older field of this calendar get replaced by a new field.
    //boolean after(Date date) : Tests if current date is after the given date

