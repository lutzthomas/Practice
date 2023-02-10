function findAverage(array) {
  let sum;
  array.forEach(num => {
    sum += num;
  });

  return sum/array.length;
}

function remove (string) {
    let lastChar = string.slice(-1);
    if (lastChar == '!'){
        string = string.slice(0,-1);
    }
    return string;
  }

  function warnTheSheep(queue) {
    if(queue.slice(-1) = 'wolf'){
        return "Pls go away and stop eating my sheep";
    }

    let sheepNum = 0;
    queue.reverse();
    for(let i = 0; i < queue.length; i++){
        if(queue[i] === "wolf"){
            sheepNum = i+1;
        }
    }

    return `Oi! Sheep number ${sheepNum}! You are about to be eaten by a wolf!`

  }