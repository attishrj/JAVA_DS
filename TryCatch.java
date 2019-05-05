/* IMPORTANT: Multiple classes and nested static classes are supported */

package com.java.basics;
  import java.io.BufferedReader;
import java.io.InputStreamReader;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TryCatch {
    public static void main(String args[] ) throws Exception {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter the number of input");
    // int n=Integer.parseInt(br.readLine());
     System.out.println("Enter the number ");
        String ip=br.readLine();
        String input[] =ip.split(" ");
        int cip[]=new int[input.length];
        for(int i=0;i<input.length;i++){
            
            cip[i]=Integer.parseInt(input[i]);
        }
        for(int i=0;i<input.length;i++)
        {
            execute( cip[i]);
        
        }
    //    catch(Exception e)
      //  {
          // System.out.println("Wrong input"); 
        //}

    }
    
    public static void execute(int n)
    {
        for(int i=1;i<=n;i++)
        {
            isMultiplExecute(i);
        }
        
    }
     public static void  isMultiplExecute(int n)
    {
        if(n%3==0)
        {
        	  
              	if(!(n%5==0))
              	{
            System.out.println("Fizz");
            return;
        }
        	  }
        if(n%5==0)
               {
        	if(!(n%3==0))
        	{
          System.out.println("Buzz"); 
          return;
        	}
        }
        if(n%15==0)
        {
          System.out.println("FizzBuzz");  
        }
        else{
            System.out.println(n);
        }
        
    }
    
}
