package javaAssignments;

import java.util.Scanner;
import java.util.regex.Pattern;

 class Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired String");
        System.out.println("To exit the check, TYPE : exit");
        String s = sc.nextLine();
        while(!s.equals("exit")){
            System.out.println(Pattern.matches("[A-Z].*[.]", s));
            System.out.println("Enter the String");
            System.out.println("To exit the check, TYPE : exit");
            s = sc.nextLine();
        }
    }
}
//.* means "any character, any number of repetitions."
