package assignment;

public class Bird extends Animal{
	
	Bird()
	{
		this.name = "bird";
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
