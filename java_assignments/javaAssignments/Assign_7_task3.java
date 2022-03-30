package javaAssignments;

interface A{
    public void getA();
    public void dispA();
}
interface B{
    public void getB();
    public void dispB();
}
interface C{
    public void getC();
    public void dispC();

}
interface D extends A,B,C{
    public void getD();

}
class ConcreteClass{
    public void display(){
        System.out.println("concrete class is on display");
    }
}

class E extends ConcreteClass implements D {
    public void getA(){
        System.out.println("interface A get method");
    }
    public void dispA(){
        System.out.println("interface A disp method");
    }
    public void getB(){
        System.out.println("interface B get method");
    }
    public void dispB(){
        System.out.println("interface B disp method");
    }
    public void getC(){
        System.out.println("interface C get method");
    }
    public void dispC(){
        System.out.println("interface C disp method");
    }
    public void getD(){
        System.out.println("interface D get mehtod ");
    }
    public void method1(A a){
        a.dispA();
    }
    public void method2(B b){

    }
    void method3(C c){

    }
    public void method4(D d){

    }
}
class Part3 {

    public static void main(String[] args) {
        E e= new E();
        e.getA();
//        e.method1();
    }
}