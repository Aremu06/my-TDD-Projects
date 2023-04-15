public class MyClass {

    public static void main(String[] args){
        Employee e = new FullTime();
        System.out.println("Full time employee salary is: " + e.salary());
        e = new Contractor();
        System.out.println("Contract employee salary is : " + e.salary());

        MyOverloadingClass myOverloadingClass = new MyOverloadingClass();
       // myOverloadingClass.myMethod(str:"my string");




    }
}
