public class AdditionFunction{

    public static int addNumbers(int numberOne, int numberTwo){
    
        int sum = numberOne + numberTwo;
        
        return sum;
        
    } 
    
    public static boolean evenNumbers(int number){
  
        return (number % 2 == 0);
     
    }  
    
    
    public static int squareOfNumbers(int number){
   
        return (number ** 2);
    } 
    
    
    public static double convertsTemperature(double celsius){
   
        int farenheit = (9 / 5 * celsius) + 32;
    
        return farenheit;
   
    } 
    
    public static boolean isPrime(int number){
    
        if (number <= 1){
   
        return false;
        }
         
        if (number % number == 1 && number % 1 == nnumber){
        
            return true;
        
        }else{
        
             return false;
   
        }
   
    }
   
   
    public static int largestOfNumbers(int numberOne, int numberTwo, int numberThree){
    
        int largest = numberOne;
        
            if (numberOne < numberTwo){
                
                numberTwo = largest;
            
            }else if (numberTwo < numberThree){
            
                numberThree = largest; 
            }
    
        return largest;
    
    }
    
    
    public static double calculateSimpleInterest(double principal, double rate, double time){
    
        int simpleInterest = principal * rate * time / 100;
        
        return simpleInterest;    
    
    }
    
    public static double calculateAreaOfRectangle(double length, double breath){
    
        int area = length * breath;
    
        return area;
    
    }
    
    public static void calculateReverse(int number){
    
        int digit = 0;
        
        digit = number % 10;
        
        digit = ((number % 10) / 10) + digit;
        
        digit = ((number % 100) / 10) + digit;
        
     
    }
    
    
    public static String countNumberOfOccurence(String text){
    
        int counter = 0;
                
        for(int count = 0; count < text.length(); count++){
        
            char[] alphabet = text.charAt[count];
            
            counter++;
                 
        } 
         return counter;
    
    }
    
         
    
}










