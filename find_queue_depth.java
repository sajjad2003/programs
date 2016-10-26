import MQQmanager.MQQdepth.*;
 
public class find_queue_depth {
 
	public static void main(String[] args) {
		 
	  MQQdepth CallQDepth =new MQQdepth(); 	
	int depth =1;
	 
	while (depth!= 0)
	{
		depth=CallQDepth.qdepth();
		
		
		  try
          {
          Thread.sleep(7000);  
         
          }catch (InterruptedException ie)
          
        	  {
        		  System.out.println(ie.getMessage());
        		  }
	}
	
	System.out.println("Program Ended.");	
	 
	}

}
