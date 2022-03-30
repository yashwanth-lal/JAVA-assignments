package javaAssignments;

class AOuter{
    AOuter(){
        System.out.println("A outer class constructor is running.");
    }
    class AInner{
        AInner( int a,int b){
            System.out.println("The value of a is " +a);
            System.out.println("A inner class constructor is running.");
        }
    }
};

class BOuter extends AOuter{
    BOuter(){
        System.out.println("B outer class constructor is running.");
    }
    class BInner{
        BInner(int a){
            System.out.println("The value of a is " +a);
            System.out.println("B inner class constructor is running.");
        }
    }
}
 class part4 {
    public static void main(String[] args) {
        BOuter b=new BOuter();
    }
}
