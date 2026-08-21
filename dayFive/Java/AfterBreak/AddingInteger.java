public class AddingInteger{
        
    public static int addInteger(int number){
                        
        int digit = 0;
        
        int sum = 0;
        
        while (number != 0){
        
            digit = number % 10;
            
            sum = sum + digit;
            
            number = number / 10;
                           
        } 
            
        
        return sum;  
            
       }
        

 
    
}
