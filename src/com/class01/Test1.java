package com.class01;

import org.testng.annotations.Test;

public class Test1 {
@Test// if we remove this , the code will be not executed . It acts like main method
public void testDemo() {// the whole method called testcase
	System.out.println("Hello");
}
@Test// this @ annotation 
public void a() {
	System.out.println("Bye");
}
@Test// this annotation work by alphabatic order
public void b() {
	System.out.println("hello world");
}
}
