/* Java Programs for understanding the concepts of using Methods */

class Methods {
    public static void main(String[] args) {
	   System.out.println(add(10,10));
	   System.out.println(addDouble(1.1,100.5));
	   System.out.println(speedCalulate(100.45,2.5));
	   System.out.println(areaCalulate(3.2));
	   System.out.println(fact(5));
	   System.out.println(isEven(10));
	   System.out.println(isOdd(26));
	   System.out.println(isPrime(6));
	   System.out.println(isPalindrome(121));
	   System.out.println(divide(36));
	   System.out.println(time(18000));
	   System.out.println(count(516));
	   System.out.println(Sum2Digits(57));
	   
	}
	
	public static int add(int num1, int num2) {
	    int sum = num1 + num2;
		return sum;
	}
	
	public static double addDouble(double num1, double num2) {
	    double sum = num1 + num2;
		return sum;
	}
	
	public static double speedCalulate(double distance, double time) {
	    double speed = distance / time ;
		return speed;
	}
	
	public static double areaCalulate(double radius) {
	    double area = 3.14159 * radius * radius;
		return area;
	}
	
	public static int fact(int num) {
	    int factorial = 1 ;
		for (int i = 1; i <= num; i++) {
		    factorial = factorial * i;
		}
		return factorial;
	}
	public static boolean isEven( int num) {
	    if ( num % 2 == 0)
		    return true;
		else
		    return false;
	}
	
	public static boolean isOdd( int num) {
	    if (num % 2 != 0)
		    return true;
		else
		    return false;
	}
	
	public static boolean isPrime( int num) {
	    int flag = 0;
	    for(int i = 2; i < num; i++) { 
		    if (num % i == 0)
			flag = 1;
	    }
		 if(flag == 0)
		    return true;
		else
		    return false;
	}
	
	public static boolean isPalindrome( int num) {
	    int reverse = 0, remainder;
        int temp = num;		
	    while (temp > 0) {
		    remainder = temp % 10;
		    reverse = reverse * 10 + remainder;
		    temp = temp / 10;
	    }
		    if(reverse == num) 
		       return true;
		    else
		       return false;
			   
	}
	
	public static boolean divide (int num) {
	    if( num % 6 == 0 )
		    return true;
		else
		    return false;
	}
			  
	public static int time (int sec) {
	    int hour = sec / 3600;
		return hour;
	}
	
	public static int count (int num) {
	    int count = 0;
	    while(num > 0) {
		    num = num / 10; 
            count++;			
		}
	    return count;
	}
	
	public static int Sum2Digits(int num) {
	    
		int sum = (num % 10) + (num /10);
		return sum;
	}

	
}

/* Conclusion : Methods once written can be used multiple times just by calling it function(like - count(int num), isPrime(int num) etc..)
                Its makes it easier for us as we do not need to write function again again for one action, 
				we can get the result by call the desired function and putting the values of our requirements */