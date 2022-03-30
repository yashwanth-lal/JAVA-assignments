package javaAssignments;

abstract class Rodent{
    Rodent(){
        System.out.println("Constructor of Rodent is running.");
    }
    public abstract void eat();
    public abstract void disp();

} ;
class Mouse extends Rodent{
    Mouse(){
        System.out.println("Constructor of Mouse is running.");
    }
    public void eat(){
        System.out.println("Mouse is eating cheese.");
    }
    public void disp(){
        System.out.println("I am Mouse... ");
    }
};
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Constructor of Gerbil is running");
    }
    public void eat(){
        System.out.println("Gerbil is eating boiled eggs");
    }
    public void disp(){
        System.out.println("I am Gerbil... ");
    }
};
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Constructor of Hamster is running");
    }
    public void eat(){
        System.out.println("Hamster is eating pears");
    }
    public void disp(){
        System.out.println("I am Hamster... ");
    }
}
class Part1 {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].disp();
        rodent[0].eat();
        rodent[1] = new Gerbil();
        rodent[1].disp();
        rodent[1].eat();
        rodent[2] = new Hamster();
        rodent[2].disp();
        rodent[2].eat();
    }
}
