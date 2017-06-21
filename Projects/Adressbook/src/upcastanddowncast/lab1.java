package upcastanddowncast;

public class lab1 {
public int average(int... x){
	int sum=0;
	for(int i=0;i<x.length;i++){
		sum+=x[i];
		
	}
	sum=sum/x.length;
	return sum;
	
}
public int product(int... x){
	int sum=1;
	for(int i=0;i<x.length;i++){
		sum=sum*x[i];
		
	}
	//sum=sum/x.length;
	return sum;
	
}
public int sum(int x,int y,String c){
	switch(c){
	case "+":
	{
		return x+y;
		
	}
	case "-":
	{
		return x-y;
		
	}
	case "/":
	{
		return x/y;
		
	}
	case "x":
	{
		return x*y;
		
	}
	default:
	{
		return 0;
	}
	}
	//sum=sum/x.length;
	//return sum;
	
}
public void combine(char [] a2,int...a1){
	int sum1=0;
	int sum2=0;
	int x=a1.length+a2.length;
	String []a3=new String[x];
	
	//System.out.println(a3.length);
	for(int i=0;i<a3.length;i++){
		if(i%2==0){
			if(a1.length==sum1)
			{
				a3[i]=Character.toString(a2[sum2]);
				sum2++;
			}
			else{
			a3[i]=Integer.toString(a1[sum1]);
			sum1++;
			}
			
		}
		else{
			if(a2.length==sum2)
			{
				a3[i]=Character.toString(a2[sum1]);
				sum1++;
			}
			else{
			a3[i]=Character.toString(a2[sum2]);
			sum2++;
			}
		}
		
	}
	for(int i=0;i<a3.length;i++){
		System.out.print(a3[i]);
		}
}
public void sort(int[]a1,int[]a2){
	int reserve=0;
	for(int i=0;i<a1.length;i++){
		for(int j=0;j<a1.length;j++){
			if(a1[i]<a1[j]){
				reserve=a1[i];
				a1[i]=a1[j];
				a1[j]=reserve;
			}
		}
		}
	for(int i=0;i<a2.length;i++){
		for(int j=0;j<a2.length;j++){
			if(a2[i]<a2[j]){
				reserve=a2[i];
				a2[i]=a2[j];
				a2[j]=reserve;
			}
		}
		}
	System.out.print("first array  ");
	for(int i=0;i<a1.length;i++){
		System.out.print(a1[i]+" ");
		}
	System.out.println("");
	System.out.print("second array  ");
	for(int i=0;i<a2.length;i++){
		System.out.print(a2[i]+" ");
		}
	int x=a1.length+a2.length;
	
	System.out.println("");
	System.out.println(a1.length);
	System.out.println(x);
	int next=0;
	int pre=0;
	int []a3=new int[x];

	int index1=0;
	int index2=0;
	for(int i=0;i<a3.length;i++)
		{
			if(index2==a2.length||index1<a1.length&&a1[index1]<=a2[index2])
			{
				a3[i]=a1[index1];
				index1++;
				
			}
			else 
			{
				if(index2<a2.length){
					a3[i]=a2[index2];
					index2++;
				}
				
			}
		}
	

	for(int i=0;i<a3.length;i++){
		System.out.print(a3[i]+" ");
		}
}
public void reverseString(String  mystring){
	char reversestring;
	
	for(int i=1;i<=mystring.length();i++){
		reversestring=mystring.charAt(mystring.length()-i);
		System.out.print(reversestring);
		}

}
public void evenorodd(int num){
	int ans;
	for(int i=0;i<=num;i=i+2){
         if(i==num){
        	 System.out.print("even"); 
        	return;
         }
        
		}
	System.out.print("odd"); 
}
public static void main(String[] args){
	lab1 obj=new lab1();
	//int ans=obj.average(2,3,4,5);
	//////int fn=Integer.parseInt(args[0]);
	//////int ln=Integer.parseInt(args[1]);
	//////String c=args[2];
	//////obj.sum(fn,ln,c);
	char[] a1={'a','b','c','d','e'};
	obj.combine(a1,1,2,3,4,5);
	//System.out.println(ans);
//	int[]a1={4,2,8,10};
//	int[]a2={5,1,37,45,2,3};
//	obj.sort(a1,a2);
//	String mystring="zahid";
//	obj.reverseString(mystring);
	//obj.evenorodd(100000002);
}
}
