package javaAssignments;

public class Assign_6_pt2 {
    public Assign_6_pt2(){
        System.out.println("constructor one is running");
    }
    public Assign_6_pt2(String s){
        this();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Assign_6_pt2 obj = new Assign_6_pt2("yashwanth");

    }
}
