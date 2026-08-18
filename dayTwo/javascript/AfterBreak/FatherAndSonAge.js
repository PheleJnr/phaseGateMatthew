function calculateYears(fatherAge, sonAge){
    
    let yearsPast = sonAge % fatherAge;
    
    let twiceAge = sonAge * 2;
    
    let differenceInAge = fatherAge - twiceAge ; 
    
        if (yearsPast + fatherAge == twiceAge){
        
            console.log("The Father's age will be twice as old as the son's age " + twiceAge + "years old"); 
        
        }else if(fatherAge < twiceAge){
        
            console.log("The Father's age will be twice as old as the son's age " + differenceInAge * -1 + "years old");
            
        }else{
        
            console.log("The father's age was twice as old as the son's age " + (fatherAge - twiceAge  + " years old"));
            
            
        }
        
    }        
    
    
    
    
calculateYears(60, 40);
