
/* Exercise #1
You have a list of names: var names = ["Maria", "Antony", "Joy", "Juan"] */

let names = ["Maria", "Antony", "Joy", "Juan"];

/* Part 1
Write a function to insert a name to the end of the list. Add your own name to the end of the list. */

function addPerson (){

    names.push("Enrique");

}

addPerson();
console.log(names);

/* Part 2
Write a function that takes in a name and checks if the list has that name. It should return back a boolean - true/false. */

function checkName(name,names){

    return names.includes(name);

}

console.log(checkName("Antony", names));
console.log(checkName("Jacob", names));

/* Part 3
Write a function that takes in a list of names. This function should compare the list taken into the names list you currently have. The function should pass back an array with the names that are in both lists.*/

let list1 = ["Mara", "Antony", "Joy", "John", "Coby"];
let list2 = ["Mar", "Antonio", "Joy", "Juan", "Coby"];

function matchNames(list1, list2) {

    return list1.filter(name => list2.includes(name));

}

console.log(matchNames(list1,list2));

/* Part 4
Write a function that takes in a list of names and returns a list of Integers with the length of the names in the same order as received. Hint use the push function.*/

function getLength(names) {

    let nameLength = [];

    for (let i = 0; i < names.length; i++) {
        nameLength.push(names[i].length);
    }

    return nameLength;

}

console.log(getLength(names)); /* ["Maria", "Antony", "Joy", "Juan", "Enrique"] */
                                /*[  "5"  ,  "6"  ,  "3"  ,  "4"  ,  "7"  ] */

/* Exercise #2 
What do the following expressions evaluate to? */

console.log(false || (true && false));
console.log(true || (11 + 12));
console.log((31 + 22) || true);
console.log(true && (1 + 7));
console.log(false && (3 + 4));
console.log((1 + 2) && true);
console.log((32 * 4) >= 129);
console.log(false !== !true);
console.log(true === 4);
console.log(false === (847 === '847'));
console.log(false === (887 == '887'));
console.log((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false);

/* Exercise #3
Write a function that logs whether a number is between 0 and 25 (inclusive), between 26 and 100 (inclusive), greater than 100, or less than 0.*/

let number = Number(prompt("Ingresa un numero"));

function checkNumber (number){

    if (number < 0){

        console.log(number, "Es menor a 0")

    } else if (number >= 0, number <= 25){

        console.log(number, "Está entre 0 y 25")

    } else if (number > 25, number <= 100){

        console.log(number, "Está entre 25 y 100")

    } else {

        console.log(number, "Es mayor a 100")

    }

}

checkNumber(number);

/*
numberRange(25);   // '25 is between 0 and 25'
numberRange(75);   // '75 is between 26 and 100'
numberRange(125);  // '125 is greater than 100'
numberRange(-25);  // '-25 is less than 0'

Additional Exercises

What is shown on the console when f is console.log'd? */

var a;
var b = null;
var c = undefined;
var d = 4;
var e = 'five';
var f = a || b || c || d || e;

console.log(f);