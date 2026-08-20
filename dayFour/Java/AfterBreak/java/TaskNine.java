import java.util.Scanner;

    public class TaskTwo{
    
    
        public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter your scores: ");
             
             int sum = 0;
                                                                               
            for(int count = 1; count <= 10; count++){
                                    
            int scores = input.nextInt();
            
                if (scores > 0){
                                            
                     sum += scores;
                    
                     
                }
             
            
            }
                
        
         System.out.println("The total sum of Even scores: " + sum);
                
       
         
         
        }
    
    
    
    }
