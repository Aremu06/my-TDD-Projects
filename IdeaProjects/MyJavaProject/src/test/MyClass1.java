package test;

public class MyClass1 {

    public static void main(String[] args){
        MyClass1 myClass1 = new MyClass1();
        myClass1.myMethod1();
    }

    public void myMethod1(){
        MyClass myClass = new MyClass();
        myClass.initialize();
        System.out.println(myClass.i);
    }

}
