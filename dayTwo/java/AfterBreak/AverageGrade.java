public class AverageGrade{

    public static void main(String[] args){
    
    getAverageGrades(40, 50, 60);
    
    
    }
    
    public static void getAverageGrades(int ScoreOne, int ScoreTwo, int ScoreThree){
    
        int sum = ScoreOne + ScoreTwo + ScoreThree;
        
        int averageScores = sum / 3;
        
        if (averageScores > 100 || averageScores <= 0){ 
            
            System.out.println("invalid");
          
        }  
            if (averageScores >= 90 && averageScores <= 100){
                
                System.out.println("A");
                    
            }else if (averageScores >= 80 && averageScores < 90){
                
                System.out.println("B");
                    
            }else if (averageScores >= 70 && averageScores < 80){
                    
                System.out.println("C");
                    
            }else if (averageScores >= 60 && averageScores < 70){
                
                System.out.println("D");
                    
            }else{
                
                System.out.println("F");
        
        }
 
    } 
   
   
}   
    
