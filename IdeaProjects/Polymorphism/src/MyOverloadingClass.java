public class MyOverloadingClass {

    public void myMethod(String str){
        System.out.print(str);

    }
    public void myMethod(String str, int i){
        System.out.print(str + i);
    }
    public void myMethod(int i){
        System.out.print(i);
    }
 }
