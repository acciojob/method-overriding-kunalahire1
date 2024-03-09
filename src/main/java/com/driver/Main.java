package com.driver;

public class Main {
  	public static void main(String[] args) {
	B obj=new B();
	obj.color();
	}
}
class A{
    public String color()
    {
        return "Invoking method from class A";
    }
}
class B extends A{
   @Override
     public String color()
    {
        return "Invoking method from class A";
    }
}
