function getAverageScoreGrade(ScoreOne, ScoreTwo, ScoreThree){
    
        let sum = ScoreOne + ScoreTwo + ScoreThree;
        
        let averageScores = sum / 3;
        
        if (averageScores > 100 || averageScores <= 0){ 
            
            console.log("invalid");
          
        }  
            if (averageScores >= 90 && averageScores <= 100){
                
                console.log("A");
                    
            }else if (averageScores >= 80 && averageScores < 90){
                
                console.log("B");
                    
            }else if (averageScores >= 70 && averageScores < 80){
                    
                console.log("C");
                    
            }else if (averageScores >= 60 && averageScores < 70){
                
                console.log("D");
                    
            }else{
                
                console.log("F");
        
        }
 
    } 
    
    
getAverageScoreGrade(90, 50, 60)
