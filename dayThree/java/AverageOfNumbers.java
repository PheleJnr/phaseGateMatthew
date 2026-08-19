public class AverageOfNumbers {

    public static void main(String[] args){
    
        int sum = 0;
        
        int average = 0;
        
        for(int count = 1; count <= 100; count++){
        
            sum += count;
            
            average += sum;
            
            
       }
       
     System.out.println (average);  
    }
    
    
}
