package test;

import java.util.Locale;

public class MyClass {
    // fields - parameters - variables - int, String, float, double, boolean, String
    // constructors -

    int i = 5;
    String str = " Hello World";

    public MyClass(){

    }
    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.stringCheck();
        System.out.println(myClass.initialize().i);

    }

    public void stringCheck(){
        str = str.concat(" !!");
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        //str = str.substring(6);
        str = str.substring(6, 12);
        System.out.println(str);
        boolean flag = str.equalsIgnoreCase("WORLD");
        System.out.println(flag);

        // How to convert string into int
        str = "5";
        int i = Integer.parseInt(str);
        System.out.println(i);

        // How to convert int into string

        i = 6;
        str = String.valueOf(i);

    }

    public MyClass initialize(){
        i = 6;
        return this;

    }
}
