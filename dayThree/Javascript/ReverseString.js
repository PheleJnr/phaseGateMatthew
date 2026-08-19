let text = "Hello world";
        
        let reverse = "";
        
        for (let count = text.length-1; count >= 0; count--){
        
        let alphabet = text.charAt(count).toLowerCase();
        
               reverse += alphabet;
         
        }
     
console.log(reverse);
     
     
