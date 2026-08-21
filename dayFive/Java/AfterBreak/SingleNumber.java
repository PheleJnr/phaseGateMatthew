public class SingleNumber{

    
    public static int numberThatAppearLess(int[] array){
    
        int counter = 0;
        
        int actualNumber = 0;
        
               
        for (int count = 0; count < array.length; count++){
        
            for(int index = 0; index < array.length; index++){
                  
                if(array[count] != array[index]){
                
                actualNumber = array[index];
               
                }
               
            }
              
           
       }
     
     return actualNumber;
    }
    
    
    
    
    public static void main(String[] args){
    
        int[] array = {2,2,2,1,1,6,5,5,5};
        
        System.out.println(numberThatAppearLess(array));
    
    }
    
}
