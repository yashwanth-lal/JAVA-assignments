package javaAssignments;

class yashwanth{
    Character gender;
    int age;
    public void print(){
        System.out.print(this.age+" "+this.gender);
    }
//dfg
    //we cannot print local variables without initializing them;
}
class Singleton{
    String email;

    public static Singleton setEmail(String email) {
        //    this.email = email;
        return new Singleton();
    }

    public void getEmail() {
        System.out.println(this.email);
    }
}

class DefaultInitialization {
    public static void main(String[] args) {
        yashwanth p=new yashwanth();
        p.print();
        //p.printLocal();
        System.out.println();
        Singleton s=new Singleton();
        s.getEmail();
    }
}
