package threading;

public class lab10Q1 extends Thread  {
	static int x=0;
	private Thread t;
	public String name;
	public lab10Q1(String name){
		//t = new Thread (this);
		this.name=name;
	}
	
    public void run(){
    	
    	try {
    		for (int i = 0; i <500; i++) {
    			x++;
            	System.out.println(x+" "+name);
			}
    		
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void start(){
    	
    	 if (t == null) {
             t = new Thread (this,name);
             System.out.println(t);
             t.start();
          }
    	 
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lab10Q1 thread1=new lab10Q1("one");
		

			thread1.start();
			lab10Q1 thread2=new lab10Q1("two");
			
			thread2.start();
			

	}

}
