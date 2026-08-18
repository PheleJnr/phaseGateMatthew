public class FatherAndSonAge{

    public static void main(String[] args){
    
    calculateYears(60, 40);
    
    
    }
    
    
    
    
    public static void calculateYears(int fatherAge, int sonAge){
    
    int yearsPast = sonAge % fatherAge;
    
    int twiceAge = sonAge * 2;
    
    int differenceInAge = fatherAge - twiceAge ; 
    
        if (yearsPast + fatherAge == twiceAge){
        
            System.out.println("The Father's age will be twice as old as the son's age " + twiceAge + "years old"); 
        
        }else if(fatherAge < twiceAge){
        
            System.out.println("The Father's age will be twice as old as the son's age " + differenceInAge * -1 + "years old");
            
        }else{
        
            System.out.println("The father's age was twice as old as the son's age " + (fatherAge - twiceAge  + " years old"));
            
            
        }
        
    }        
            
}    
