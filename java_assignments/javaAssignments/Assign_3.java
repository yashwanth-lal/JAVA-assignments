package javaAssignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

 class Ping_Demo {
     // method for finding the ping statics of website
    static void runSystemCommand( ArrayList<String> commandList) {

        try {
            ProcessBuilder build = new ProcessBuilder(commandList);
            Process process= build.start();
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()) );
            // before crating the object of bufferReader we need to create the inputStreamReader object and to give that object as argument for bufferReader
            String s = "";

            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);

            }
        }
        catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ping");
        list.add("www.google.com");
        runSystemCommand(list);

    }
}
/*With BufferedReader, if you wish to read single character, it will store the contents to fill its buffer (if it is empty)
 and for further requests, characters will directly be read from buffer, and hence achieves greater efficiency. InputStreamReader
 converts byte streams to character streams.*/
//getInputStream() method gets the input stream of the subprocess
//ProcessBuilder class is used to create operating system processes and ProcessBuilder.start() starts the sub-process which will execute the ping command.
//getMessage() is the method which it give the details about the thrown exception
//start() method causes this thread to begin execution
