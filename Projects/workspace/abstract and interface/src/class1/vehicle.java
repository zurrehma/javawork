package class1;

public abstract   class vehicle implements hydrolicSystem {
public void description(String name)
{
	if(name=="civic"||name=="cultus"||name=="mehran")
	{
		System.out.println(name+"is car");
	}
	else
	{
		System.out.println(name+"is other vehicle");
	}
}
 public abstract void engine(int x);
public static void welcome()
{
	System.out.println("welcome to vehicle class");
}
}
