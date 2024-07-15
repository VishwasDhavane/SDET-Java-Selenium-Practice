package interviewpractice;

public class CheckingPasswordStrength {
	
	public static boolean isStrongPassword(String password)
	{
		
		 if (password.length() < 8) {
	            return false;
	        }

	        // Check for lowercase, uppercase, digit, and special character
	        boolean hasLowercase = false;
	        boolean hasUppercase = false;
	        boolean hasDigit = false;
	        boolean hasSpecialChar = false;

	        for (char ch : password.toCharArray()) {
	            if (Character.isLowerCase(ch)) {
	                hasLowercase = true;
	            } else if (Character.isUpperCase(ch)) {
	                hasUppercase = true;
	            } else if (Character.isDigit(ch)) {
	                hasDigit = true;
	            } else if ("!@#$%^&*()-+".contains(String.valueOf(ch))) {
	                hasSpecialChar = true;
	            }
	        }

	        // Check adjacent characters
	        for (int i = 1; i < password.length(); i++) {
	            if (password.charAt(i) == password.charAt(i - 1)) {
	                return false;
	            }
	        }

	        // All criteria met
	        return hasLowercase && hasUppercase && hasDigit && hasSpecialChar;
	    }
	
		
		
	
	
	
	
	

       public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password1 = "IloveLe3tcode!";
        String password2 = "Me+You--IsMyDream";
        String password3 = "1aB!";

        System.out.println("Is password1 strong? " + isStrongPassword(password1));
        System.out.println("Is password2 strong? " + isStrongPassword(password2));
        System.out.println("Is password3 strong? " + isStrongPassword(password3));
    }
        
        
		
		

	}

