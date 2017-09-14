package assignment;

public class Animal {
	
	String name;
	
	Animal()
	{
		name = "animal";
		System.out.println("A new " + name + " has been created!");
	}
	
	void eat()
	{
		if (name == "animal")
		{
			System.out.println("An " + name + " eats...");
		}
		else
		{
			System.out.println("A " + name + " eats...");
		}
	}
	
	void sleep()
	{
		if (name == "animal")
		{
			System.out.println("An " + name + " sleeps...");
		}
		else
		{
			System.out.println("A " + name + " sleeps...");
		}
	}

}
