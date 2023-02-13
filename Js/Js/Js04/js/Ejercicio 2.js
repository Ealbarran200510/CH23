
let pattern = "*";

for (let i = 0; i < 5; i++){

    console.log(pattern);
    pattern += "*";

}

for (let i = 1; i <= 5; i++) {
    let pattern = '';
    for (let j = 1; j <= i; j++) {
      pattern += '* ';
    }
    console.log(pattern);
  }