public class MySuperClass {

    String superStr = "super class string";

    public MySuperClass(String constructorStr){
        System.out.println("super class constructor");
        System.out.println(constructorStr);

    }

    public MySuperClass() {

    }

    public void superClassMethod(){
        System.out.println("super class method");
    }

}
