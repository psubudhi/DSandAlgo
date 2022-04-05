

class ReverseString {
    public void reverseString(char[] s) {
        
                 System.out.print(s);  
    	        for (int i=s.length-1,j=0;i>=(s.length-1)/2 & j<=s.length;i--,j++)
                {
    	        	char tmpCar=s[i];
    	        	s[i]=s[j];
    	        	s[j]=tmpCar;
                }
                
                System.out.print(s);  
    }
    public static void main(String[] args) {
    	ReverseString rev=new ReverseString();
    	char[] carr= {'h','e','l','l','o'};
		rev.reverseString(carr);
	}
}

/*
class ReverseString {
	static String[]   s1 = {"h","e","l","l","o"};
	static char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	
    	    public static void reverseString(char[] c1) {
    	    char[] helloArrayNew = new char[c1.length];
    	     String []str=new String[c1.length];
    	        for (int i=c1.length-1,j=0;i>=0 & j<=c1.length;i--,j++)
                {
    	        	helloArrayNew[j]=c1[i];
                }
                System.out.print(helloArrayNew);  
    	    }
public static void main(String[] args) {
	System.out.println(helloArray);
	reverseString(helloArray);
}
}
*/
/*
public class ReverseString {
	static String[]   s1 = {"h","e","l","l","o"};
	 char[]   charTemp = {'h','e','l','l','o'};


   	    		public static void main(String[] args) {

    			reverseString(s1);
			}
    	    public static void reverseString(char[] c1) {
    	     
       	     String []str=new String[c1.length];
 	        for (int i=c1.length-1;i>=0;i--)
             {
                 
                 str[i]=c1[i]+"";
               
             }
                System.out.print(str.toString());  
 	    }

    	    }
    	}
    	*/