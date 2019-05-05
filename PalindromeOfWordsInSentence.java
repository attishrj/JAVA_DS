package com.ques.hackerrank;

public class PalindromeOfWordsInSentence {
	static boolean checkPalin(String word) 
    { 
		word = word.toLowerCase(); 
       /* int n = word.length(); 
        for (int i=0; i<n; i++,n--) 
           if (word.charAt(i) != word.charAt(n - 1)) 
              return false;        
        return true; */
		StringBuilder builder=new StringBuilder(word);
		StringBuilder reverse = builder.reverse();
		return word.equals(reverse.toString());
		 
    } 
      
    // Function to count palindrome words 
    static int countPalin(String str) 
    {         
        // to check last word for palindrome 
        str = str + " "; 
          
        // to store each word 
        String word = ""; 
        int count = 0; 
        for (int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
              
            // extracting each word 
            if (ch != ' ') 
                word = word + ch; 
            else { 
                if (checkPalin(word)) 
                    count++; 
                word = ""; 
            } 
        } 
          
        return count; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        System.out.println(countPalin("Madam "
                  + "Arora teaches malayalam")); 
                    
        System.out.println(countPalin("Nitin "
                        + "speaks malayalam")); 
    } 

}
