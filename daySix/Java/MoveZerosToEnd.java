import java.util.Arrays;

public class MoveZerosToEnd{
    
    public static int[] movingZerosToTheEnd(int[] array){
    
        int[] newArray = new int[array.length];
        
        int index = 0;
        
        for(int count = 0; count < array.length; count++){
                
            if (array[count] != 0){
            
                newArray[index] = array[count];
                
                index++;
            
            }
        }
    
        while (index < newArray.length){
        
            newArray[index] = 0;
            
            index++;
        
        }
        
       return newArray; 
    }
        
        
    public static void main(String[] args){
    
    int[] array = {5, 0, 3, 0, 2, 0};
    
    System.out.println(Arrays.toString(movingZerosToTheEnd(array)));
    
    }
    
}
        
