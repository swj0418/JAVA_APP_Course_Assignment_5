package assignment;

public class Dog extends Animal{
	
	Dog()
	{
		this.name = "dog";
		System.out.println("A new " + name + " has been created!");
	}
	
	@Override
	void eat()
	{
		System.out.println("A " + name + " eats...");
	}
	
	@Override
	void sleep()
	{
		System.out.println("A " + name + " sleeps...");
	}


}
