

Casting

public class A{
	public void methodA(){}
}

public class B extends A{
	public void methodB(){}
}

A obj = new B();
obj.methodA(); 

B obj2 = (B) obj;   //B obj2 = new B();
obj2.methodA();
obj2.methodB();

public class C extends B{
	public void methodC(){}
}


A obj = new C();

//cast to B and call methodB
B obj2 = (B) obj;  
obj2.methodA();
obj2.methodB();

//method C???
C obj3 = (C) obj;
obj3.methodA();
obj3.methodB();
obj3.methodC();

++++++++++++++++++++++++++++++++++

A obj = new B();

C obj2 = (C) obj;  //not possible

A
B
C

You can not cast below your object level

++++++++++++++++++++++++++++++++++
A
B
C
D 

A obj2 = new D();
Casting options:  B,C,D

A obj2 = new C();
Casting options:  B,C 

++++++++++++++++++++++++++++++++++

public class Animal{
	public void speak(){}
}

public class Goat extends Animal{
	public void eat(String str){}
}


Animal an = new Goat();
an.speak();

1) Goat gt = (Goat) an; 
	gt.eat("grass");


2)((Goat) an).eat("grass");


	
((TakeScreenShot) driver).takeSchreenshot("image.png");





























