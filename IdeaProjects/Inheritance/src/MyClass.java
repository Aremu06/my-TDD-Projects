public class MyClass {

    public static void main(String[] args){
        MySubClass mySubClass = new MySubClass();
        mySubClass.superClassMethod();
        System.out.println(mySubClass.superStr);
        mySubClass.subClassMethod();


    }
}
