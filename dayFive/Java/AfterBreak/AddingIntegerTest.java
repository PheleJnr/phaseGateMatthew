import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class AddingIntegerTest{
    
    
    @Test
    public static void testThatTheSumofIntegerWorks(){
    
    int number = 38;
    
    int expectedSum = AddingInteger.addInteger(number);
    
    int actualSum = 11;
    
    assertEquals(expectedSum, actualSum);
    
    }
    
    
}




