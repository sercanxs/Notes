
Abstract class vs Interface


- Abstract classes and Interfaces are used to achieve abstraction in Java

- We can not instantiate abstract classes and interfaces

	public abstract class Food{

	}

	public interface Cookable{

	}

	Food food = new Food();          //Illegal
	Cookacle cook = new Cookable();  //Illegal


- We use abstract classes for setting foundation for sub classes. It is normally a general idea

- Interfaces are used to add a feature to classes by providing abstract methods

- Class can extends ONE abstract class

- Class can implement MULTIPLE interfaces

	public interface Cookable{}
	public interface Bakeable{}
	public abstract class Food{}

	public class Bread extends Food implements Bakeable{}

	public class Patotoes extends Food implements Cookable,Bakeable{}



- Methods:

	- Abstract classes can have abstract and non-abstract methods

	- Interfaces can have abstract, default, static methods

	- Concrete class is responsible for providing implementation

	public abstract class Food{

		public abstract void eat();  //void eat(); - > it will not work

		public void serve(){  //instance method
			//code
		}

		public static void buy(){ //static method
			//code
		}

	}

	public interface Cookable{

		public abstract void cook();

		void store();

	}


	public interface Bakeable{

		public default void bakeInOven(){
			//code
		}

		public static void bake(String str){
			//code
		}

	}

	public class Bread extends Food implements Bakeable{

		@Override
		public abstract void eat(){
			//code
		}

	}

	public class Patotoes extends Food implements Cookable,Bakeable{

		@Override
		public abstract void eat(){
			//code
		}

		@Override
		public void cook(){
			//code
		}

		@Override
		public void store(){
			//code
		}


	}


- Variables

	- Abstract classes can have instance, static and final variables

	- Interfaces can only have "public static final" variables


	public abstract class Food{

		String name;
		public static int amount;
		public final boolean EDIBLE = true;

	}

	publci interface Cookable{

		public static final String ACTION = "Cook";

		boolean CAN_BE_COOKED = true;  // same as public static final boolean CAN_BE_COOKED
	}

- Constructor

	- Abstract classes can have constructors

	- Interfaces can not have constructors


	public abstract class Food{

		String name;
		
		public Food(String name){
			this.name=name;
		}

		public Food(){
			this.name="Pizza";
		}

	}

	public interface Cookable{

		//We can not add constructor
	}


	public class Pizza extends Food{

		public Pizza(){
			super("Pasta");
		}

	}

-Access Modifiers

	- Abstract Classes can use all access modifiers with variables and methods 
	
	- Interfaces can only use public access modifier 

	(Java-11 private final avaiable too - dont worry) 

	public abstract class Food{

		public String name;
		protected int quantity;
		boolean isSpicy;
		private boolean isTasty;
	}

	public interface Cookable{

		public static final String ACTION="Cookable";

	}


- Inheritance 

	- Abstract classes can extend a single abstract or non-abstract class and implement interfaces

	- Interfaces can extend multiple interfaces

	- Interfaces support multiple inheritance

	- Interfaces can not extend classes 

	public abstract class Food{}

	public interface Fryable{}

	public interface Grillable{}

	public interface Cookable extends Fryable,Grillable{}

	public abstract class Soup extends Food{}






































