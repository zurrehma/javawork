package class1;

public   class car extends vehicle  implements hydrolicSystem {
	public  void engine(int x)
	{
		if((x>0)||(x<200))
		{
			System.out.println(x+"  " +("cc is engine of mehran car"));
		}
		else if((x>200)||(x<400))
		{
			System.out.println(x+"  "+("cc is engine of cultus car"));
		}
		else if((x>400)||(x<600))
		{
			System.out.println(x+"  "+("cc is engine of civic car "));
		}
		else
		{
			System.out.println(x+"  "+("is not engine of car"));
		}
	}
	public void hydrolic(String name)
	{
		if(name=="civic"||name=="cultus"||name=="mehran")
		{
			System.out.println(name+" "+"have hydrolic system");
		}
		else
		{
			System.out.println(name+" "+"did not have have hydrolic system");
		}	
	}
	public static void welcome()
	{
		System.out.println("welcome to car class");
	}
}
