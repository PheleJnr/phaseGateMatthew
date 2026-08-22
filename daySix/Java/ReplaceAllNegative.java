import java.util.Arrays;

public class ReplaceAllNegative{

    public static int[] replaceNegativeWithZeros(int[] array){
    
        int[] newArray = new int [array.length];
        
        for(int count = 0; count < array.length; count++){
        
            if(array[count] < 0){
            
                newArray[count] = 0;
            
            }else {
            
                newArray[count] = array[count];
            }
        
        }
    
        return newArray;
    }
    
    
    public static void main(String[] args){
    
        int[] array = {5, -9, 3, -6, 2, -11};
    
        System.out.println(Arrays.toString(replaceNegativeWithZeros(array)));
    
    
    }
    
    
} 

   
