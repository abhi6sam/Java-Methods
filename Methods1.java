class Methods1 {
   public static void main(String[] felight) {
	 System.out.println(add(10,20));
	 System.out.println(add(2,4));
	 System.out.println(add(1.1,100.5));
	 System.out.println(add(5.1,20.5));
	 System.out.println(getSpeed(2.5,100.45));
	 System.out.println(getSpeed(60.25,25.66));
	 System.out.println(Area(3.2));
	 System.out.println(Area(10.9));
	 System.out.println(Fact(5));
	 System.out.println(Fact(9));
	 System.out.println(Even(10));
	 System.out.println(Even(11));
	 System.out.println(Odd(24));
	 System.out.println(Odd(61));
     System.out.println(Palindrome(1221));
     System.out.println(Palindrome(1144));	
     System.out.println(Div6(24));
     System.out.println(Div6(67));	
     System.out.println(getHours(3600));	 
	 System.out.println(getHours(18000));
	 System.out.println(countNum(1113));
	 System.out.println(countNum(516));
	 System.out.println(Hundred(12345));
	 System.out.println(Hundred(12345678));
	 System.out.println(reqRunrate(326,49,210,33));
     System.out.println(reqRunrate(326,49,210,33));
	 System.out.println(makeDecimal(4,8,1));
     System.out.println(makeDecimal(0,0,6));
	 System.out.println(Make2Digits(6));
	 System.out.println(Sum2Digits(57));
	 System.out.println(Sum2Digits(10));
	 System.out.println(andBool( true ,true, true) );
     System.out.println(andBool( true ,false, true) );
	 System.out.println(largerThanOne(24,10,36));
     System.out.println(largerThanOne(100,200,300));
	 System.out.println(inAscendingOrder(2,4,6));
     System.out.println(inAscendingOrder(3,1,12));
	 System.out.println(sumOfDigits(12345));
     System.out.println(sumOfDigits(1000));
	 System.out.println(add4DigitNums(1,2,3));
     System.out.println(add4DigitNums(4,5,6));
	 System.out.println(isMultiple(27));
     System.out.println(isMultiple(58));
	 System.out.println(Largest(10,20,15));
	 System.out.println(Largest(100,200,300));
	 System.out.println(computeArea(1,2,4,6));
     System.out.println(computeArea(2,3,8,15));
	 System.out.println(numOfDays(1));
     System.out.println(numOfDays(12));
	 System.out.println(isDigit('1'));
     System.out.println(isDigit('a'));
	 System.out.println(changeCase('k'));
     System.out.println(changeCase('a'));
	 System.out.println(middle('3','9','7'));
     System.out.println(middle('a','x','X'));
	 System.out.println(isSameLastDigit(1268,80128));
     System.out.println(isSameLastDigit(901,9010));
	 System.out.println(addThird(12,28,16));
     System.out.println(addThird(17,37,10));
	 System.out.println(lotteryReward(22));
     System.out.println(lotteryReward(56));
	 System.out.println(lotteryReward(16));
     System.out.println(lotteryReward(21));
	 System.out.println(Sumlast3(1234));
     System.out.println(Sumlast3(7894));
	 System.out.println(blackjack(18,21));
     System.out.println(blackjack(22,23));
	 System.out.println(Reverse3(183));
     System.out.println(Reverse3(440));
	 System.out.println(Reverse3(123));
	 
	 
  }
  public static int add(int a,int b) {
     int sum = a+b;
     return sum;
  }
   public static double  add(double a,double b) {
     double sum = a+b;
     return sum;
}
   public static double getSpeed( double distance, double time)
   {
	 double speed= distance/time;
	 return speed;
   }
   public static double Area(double radius) {
	    double area= radius*radius*3.141;
	    return area;
   }
   
   public static long Fact(long n) {
	     long c,fact=1;
	     for(c=1;c<=n;c++)
		 {
		 fact=fact*c;
		 }
	     return fact;
   }

      public static boolean Even( int n) {
     if(n%2==0)
     return true;
     else 
     return false;
	}
	public static boolean Odd( int n) {
     if(n%2!=0)
     return true;
     else 
     return false;
	}
     public static boolean Palindrome(int n) {
	 int temp,reverse=0;
	 temp=n;
	 while(temp!=0)
		{
		 reverse=reverse*10;
		 reverse=reverse+temp%10;
		 temp=temp/10;
		}
		if(n == reverse)
			return true;
		else 
			return false; 
	}
	 public static boolean  Div6( int n) {
		 if(n%6==0)
         return true;
         else 
         return false;			 
		 
	 }
	 public static int getHours(int n) {
		 int h= n/3600;
		 return h;
	 }
	 
	 public static int countNum(int n) {
		 int temp,sum=0,count=0;
		 temp=n;
		 while(temp!=0) 
		 {
		 sum=temp%10;
		 count=count+1;
		 temp=temp/10;
		 }
	    return count;
	 }
     public static int Hundred(int n) 
     {
  
         int temp,sum=0;
         temp=n;
         temp=temp/100;
         sum=temp%10;
         return sum;
      }
	 
     public static float reqRunrate(int target,int maxovers,int currentscore,int oversbowled) 
     {
         float reqscore=target-currentscore;
         float remainingovers= maxovers-oversbowled;
	     float reqrunrate=(reqscore/remainingovers);
	     return reqrunrate;
	 
   
     }    		
     public static double makeDecimal(int a,int b,int c) 
     {
         double x;
	     double  temp = ((a*100) + (b*10) + c ) ;
  
         x = temp / 100;
	     return x;
     }

     public static int Make2Digits(int n) 
	 {
		 int temp;
         temp=((n*10)+n);
         return temp;
     }		 


     public static int Sum2Digits(int n) {
	     int x,y;
	     x=n%10;
	     y=n/10;
	     int temp= x+y;
	     return temp;
    }
	
	public static boolean andBool(boolean a,boolean b,boolean c) 
   {
	     if (a&&((b||c)&&(b&&c))) 
	     {
         return true;
         }
         else
	     {
         return false;
         }
	   
	 
    }

    public static boolean largerThanOne(int a,int b,int c) 
        {
	     return true?(a>b)&&(a<c) :(a<b)&&(a>c) ;
        }

    public static boolean inAscendingOrder(int a,int b,int c) 
    {
	     return true?((a<b)&&(b<c)) : ((c>b)&&(b>a))  ;
	}

    public static int sumOfDigits(int n) 
    {
	    int temp,sum=0;
	    temp=n;
	    while(temp!=0) {
		   sum=sum+temp%10;
	       temp=temp/10;
	    }
	return sum; 
    }
	
	
	public static int add4DigitNums(int a,int b,int c) 
   {
	    int x;
	    x=a+b+c;
	    x=x*1000+x*100+x*10+x;
	    return x; 
    }
    public static boolean isMultiple(int a) {
        if(a%3==0 || a%7==0)
           return true;
        else 
           return false;
    }	

    public static int Largest(int a,int b,int c) {
		if((a>b)&&(a>c))
			return a;
		 else if((b>a)&&(b>c))
			return b;
		else 
			return c;
    }		 

   public static double computeArea(int x1,int y1,int x2,int y2) {
		double r = Math.pow((x2-x1),2);
		double q = Math.pow((y2-y1),2);
		double z=r+q;
		double k= Math.sqrt(z);
		double area= 0.5*k*k;
		return area;
		
		

    }
	public static int numOfDays(int n) {
		if(n<=12) {
        if(n%2==0)
            return 30;
        else 
			return 31;		 
        }
		 return 0;  	 
    }
		 

	public static boolean isDigit(char n) {
	    if(n<='0'||  n<='9')
		    return false;
        else 
            return true;
	}
    
	public static char changeCase(char ch) {
	    int x;
		char y;
		if(ch>='A' && ch<='Z') {
		    x=(ch+32);
		    y=(char)x;
	        return y;
        }
		else if(ch>='a' && ch<='z'){
		    x=(ch-32);
		    y=(char)x;
		    return y;
		}
		else 
            return 0;			 
	    }

    public static char middle(char a,char b,char c) {
		if((a<c)&&(a>b)||(a>c)&&(a<b)) {
			return a;
		}
		else if ((b>a)&&(b<c)||(b<a)&&(b>c)) {
            return b;
		}
		else if((c>a)&&(c<b)||(c<a)&&(c>b))
			return c; 
		else return 0; 
	    }

     public static boolean isSameLastDigit(int a,int b)
		{
			 int x,y;
			 x=a%10;
			 y=b%10;
			 if(x==y)
			 return true;
		     else 
			 return false;
		}

    public static boolean addThird(int a,int b,int c)
		{
		     if((a+b)==c || (b+c)==a || (c+a)==b)
		     return true;
             else
             return false;	
	    }
	
	 
	public static int  lotteryReward(int a)
		{
		 if(a%4==0 && a%7==0)
		 {
			 return 20;
		 }else if(a%7==0)
		 {
         return 10;
		 }else if(a%4==0)
		 {
			 return 6;
		 }else 
			 return 0;
	 
	    }

		
    public static int  Sumlast3(int a)
		{ 
		     int x,y,sum=0;
		     y=a%1000;
		     
		     while(y!=0)
		     {
				 x=y%10;
				 y=y/10;
		         sum=sum+x;
		     }
		     return sum;
		 }

    public static int  blackjack(int a,int b)
		{ 
		   if ((a>21)||(b>21))
		   {
			   return -1;
		   }else if((a==b) ||((a<=21)&&(b<=21)))
		   {
			   return -2;
		   }else 
			   return 0;
		}
		 

    public static int  Reverse3(int a)
    { 
		  int temp,reverse=0;
		  temp=a;
	     while(temp!=0)
	    {
	     reverse=reverse*10;
	     reverse= reverse+temp%10;
	     temp=temp/10;
	    }
		return reverse;
    }



	
	
	
	
	
	
	
	
	
 }
	
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
