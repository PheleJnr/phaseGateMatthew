import java.util.Scanner;

    public class TaskTwo{
    
    
        public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter 10 scores: ");
             
             int sum = 0;
             
             int average = 0;
             
                                          
            for(int count = 1; count <= 10; count++){
            
            int scores = input.nextInt();
            
            
            
             sum += scores;
             
             average = sum / 10;
            
            }
                     
              
         System.out.println("The average of the sum of scores: " + average); 
        }
    
    
    
    }
