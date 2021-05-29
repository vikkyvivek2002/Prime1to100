public class Prime1to100
{
	public static void main(String[] args) 
	{
	    int i,a=0,j,temp=0;
	   
	    for(j=1;j<=100;j++)
	    { 
	        for(i=1;i<=j;i++)
	           {  
	               if(j%i==0)
	               {
	                   temp++;
	               }
	            }
	           if(temp==2)
	      {
	          System.out.println(""+j);
	      }
	    else
	      {
	         temp = 0;
	      }
	     
	    }
	}
}
