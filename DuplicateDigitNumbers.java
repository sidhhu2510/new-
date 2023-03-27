package VirdhTechLab;


	public class DuplicateDigitNumbers {
		
		
		
		  private static int getDigitSum(int num) {
		        int sum = 0;
		        while (num > 0) {
		            sum += num % 10;
		            num /= 10;
		        }
		        return sum;
		    }
		  
		  
		  private static boolean hasDuplicateDigits(int num) {
		    	
		        String numStr = String.valueOf(num);
		        
		        for (int i = 0; i < numStr.length(); i++) {
		        	
		            char currChar = numStr.charAt(i);
		            
		            if (numStr.indexOf(currChar) != numStr.lastIndexOf(currChar)) {
		                return true;
		            }
		        }
		        return false;
		    }
		
	    public static void main(String[] args) {
	    	
	        for (int i = 0; i <= 500; i++) {
	        	
	            if (hasDuplicateDigits(i) && getDigitSum(i) <= 5) {
	                System.out.println(i);
	            }
	        }
	    }
	    
	}

	  

	  

