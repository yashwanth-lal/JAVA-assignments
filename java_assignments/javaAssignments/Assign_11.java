package javaAssignments;

import java.io.*;
import java.util.*;

 class CharCount {
    public static void main(String[] args)
    {
        try {
            Scanner inputFile = new Scanner(new File("C:\\Users\\Yashwanth Lal\\Desktop\\zemoso company\\Assignment11_input.txt"));
            PrintWriter outputFile = new PrintWriter("C:\\Users\\Yashwanth Lal\\Desktop\\zemoso company\\Assignment11_output.txt");
            HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();//takes the keys and values
            int count;
            while(inputFile.hasNext()) {
                char[] charArray = inputFile.next().toCharArray();//.next takes the each and every word in input,The method toCharArray() returns an Array of chars after converting a String into sequence of characters
                for (char ch : charArray) {
                    if (charCount.containsKey(ch)) {//containsKey checks if the chracter exits in hashmap or not
                        count=charCount.get(ch);//get is used for knowing the value of ch
                        count++;
                        charCount.replace(ch,count);//replace is used to update the value for the particular key(here: ch)
                    } else {
                        charCount.put(ch, 1);//put method is used to add new key,value in the hashmap
                    }
                }
            }
            for (Character key:charCount.keySet())// The method returns a set having the keys of the hash map
            {
                outputFile.println(key + ": " + charCount.get(key));//this prints in our output file
            }
            inputFile.close();
            outputFile.close();
        }

        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
//The Java PrintWriter is useful if you are generating reports (or similar) where you have to mix text and numbers