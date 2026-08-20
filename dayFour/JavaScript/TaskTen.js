const prompt = require("prompt-sync")();

        
            let sum = 0;
            
            let average = 0; 
                                                   
            for(let count = 1; count <= 10; count++){
            
            const scores = Number(prompt("Enter your scores: "));
            
                 if (Scores > 0){
                                  
                 sum += scores;
                 
                 average = sum / 10;
                                          
                }
            }    
        
        
console.log(average);
               
