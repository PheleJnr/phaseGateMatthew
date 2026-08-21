let array = [2,2,2,1,1,6,5,5,5];

let counter = 0;

let actualNumber = 0;


for (let count = 0; count < array.length; count++){

    for(let index = 0; index < array.length; index++){

        if(array[count] != array[index]){

            actualNumber = array[index];

        }

    }


}

console.log(actualNumber);






