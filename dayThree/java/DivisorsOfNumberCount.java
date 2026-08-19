public class DivisorsOfNumberCount {

    public static void main(String[] args){
    
        int number = 5;
                       
        int counter = 0;
               
        for (int count = 1; count <= number; count++){
        
            if (number % count == 0)
                
             counter++;
        
          
         }
        System.out.println(counter);   
     }                
                
}         
              



