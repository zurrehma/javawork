package recursion;

public class q2 {
	
	/**
	 * 
	 * @param a
	 * @param size
	 * @return
	 */
	public static int min(int a[],int size){
		
		if(size==0){
			return a[0];
		}
		else
		{
			min(a,size-1);
			if(a[0]>a[size])
			{
				a[0]=a[size];
				return a[0];
			}
			else
			{
				return a[0];
			}
		}
		
	}
public static int sum(int a[],int size){
		
		if(size==0){
			return a[size];
		}
		else
		{
			return a[size]+sum(a,size-1);
			
		}
		
	}
public static boolean palindrom(char a[],int size){
	if(a.length%2==1){
		
	
	if(size==a.length/2){
		if(a[size]==a[a.length-1])
		{
			return true;
		}
		else{
			return false;
		}
	}
	else
	{
		
		
		palindrom(a,size-1);
		
		
		if(a[size]==a[a.length-size-1])
		{
			return true;
		}
		else
		{
			return false;
		    
			
		}
		
		
	}
	}
	else{
		if(size==a.length/2){
			if(a[size]==a[a.length-size-1])
			{
				return true;
			}
			else{
				return false;
			}
		}
		else
		{
			
			
			palindrom(a,size-1);
			
			
			if(a[size]==a[a.length-size-1])
			{
				return true;
			}
			else
			{
				return false;
			    
				
			}
			
			
		}
	}
			
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]={'a','b','b'};
		
		System.out.println(q2.palindrom(a, a.length-1));
	}

}
