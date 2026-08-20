import java.util.Scanner;

    public class TaskOne{
    
    
        public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter 10 scores: ");
             
             int sum = 0;
                              
            for(int count = 1; count <= 10; count++){
            
            int scores = input.nextInt();
            
            
            
             sum += scores;
            
            }
                
        
        
                
         System.out.println("The total sum of scores: " + sum);
        }
    
    
    
    }
