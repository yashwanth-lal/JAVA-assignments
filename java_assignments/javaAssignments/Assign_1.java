package javaAssignments;

import java.io.File;
import java.util.Scanner;

class FileSearch {
public void findFile(){
    File file= new File("D:\\coding_world\\file_java");
    String str;
    Scanner scn = new Scanner(System.in);
    boolean notFound=true;
    while(notFound) {
        System.out.print("ENTER THE NAME OF THE FILE : ");
        str = scn.nextLine();
        String[] files = file.list();

        for (String s : files) {
            if (str.equals(s)) {
                System.out.println("File Found !");
                System.out.println("Path is : " + file.getAbsolutePath());
                notFound = false;
                break;
            }
        }
        if (notFound == true) {
            System.out.println("file not found please enter new file name");
        }
    }
    }
    public static void main(String[] args) {
        FileSearch obj =new FileSearch();
        //calling the findFile()
        obj.findFile();
    }
}
