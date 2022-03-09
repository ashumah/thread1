package thread1;

public class thread {

				     private int count;
				     public thread() { count = 0; }
					public String getCount() {
						// TODO Auto-generated method stub
						return null;
						
					}
	}
				     
				class counter extends thread
					
				{
				public void run()
				{
					int i=0;
					while(i<50)
					{
						System.out.println("output");
						i++;
					}
					if(i>50)
						i=0;
				}
				
				  public static void main(String[] args)
				  { 
					   
				     counter c = new counter();
				     thread t = new thread();
				      
				      
				     System.out.println("output");   }

		



	}


