package com.saurabh.demo;

class FinalBase{
	final private int i=10;//constant variable declared and initialized
//	final public void change(){
	public void change(){
//		i=20;
		System.out.println("Hi I am change function of base class ");
	}
}
class FinalDerived extends FinalBase{
	public void change(){
		
	}
}
public class MyClass {

}
