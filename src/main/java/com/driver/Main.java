package com.driver;



public class Main {
	public static class A {
        //comment
   public String meth() {
        return "Invoking method from class A";
    }
}
//hello
public static class B extends A {
    @Override
    //hello
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}
    public static void main(String[] args) {
    
        B objB = new B();
        System.out.println(objB.meth());

       
        System.out.println(objB.meth()); 
    }
}
