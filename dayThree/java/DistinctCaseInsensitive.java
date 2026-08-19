public class DistinctCaseInsensitive{

    public static String countDistinctInsensitiveCase(String text){
    
    String[] newArray = text.split(" ");
    
    int[] repeat = new int [newArray.length];
    
    int newRepeat = 0;
    
    for(int character = 0; character < newArray.length; character++){
    
        for(int index = 0; index < newArray.length; index++){
        
            if(newArray[character].equals(newArray[index].toLowerCase() || newArray[character].equals(newArray[index]).toUpperCase())){
            
            
            newRepeat++;
            }
        
        
        }
    
    
    }
