package recursion;

public class q1 {
	public static int sum(int num){
		if(num==1){
			return num;
		}
		else{
			return num+sum(num-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=q1.sum(5);
       System.out.println(num);
       
	}

}
