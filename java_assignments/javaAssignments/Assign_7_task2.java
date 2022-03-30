package javaAssignments;

class Cycle{
    public  void balance(){
        System.out.println("The cost of cycle may differ based on the types of cycle we buy");
    }
    public void hello(){
        System.out.println("hello");
    }
};
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("The cost of Unicycle start with RS 2500. ");
    }
    public void bye(){
        System.out.println("bye");
    }
};
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("The cost of Bicycle start with Rs 3000. ");
    }
}
class Tricycle extends Cycle{

// public void balance(){
//    System.out.println("The cost of Tricycle start with Rs 6000. ");
//}
}
 class Part2 {
    public static void main(String[] args) {
        Cycle[] obj = new Cycle[3];
        obj[0] = (Cycle) new Unicycle();
        obj[0].balance();
        obj[1] = (Cycle) new Bicycle();
        obj[1].balance();
        obj[2] = (Cycle) new Tricycle();
        obj[2].balance();
        Unicycle c1=(Unicycle) obj[0];
        c1.balance();
        Bicycle c2=(Bicycle) obj[1];
        c2.balance();
        Tricycle c3=(Tricycle) obj[2];
        c3.balance();

    }
}