public class ReverseString {

    public static void main(String[] args){
    
        String text = "Hello world";
        
        String reverse = "";
        
        for (int count = text.length()-1; count >= 0; count--){
        
        char alphabet = Character.toLowerCase(text.charAt(count));
        
               reverse += alphabet;
         
        }
     
     System.out.println(reverse);   
    }       
    
    
}     
