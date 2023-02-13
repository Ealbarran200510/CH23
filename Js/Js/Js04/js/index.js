
let variable = 5;

/* Arreglo unidimensional */

let array = [2,3,4,5,6];

/* Arreglo multidimensional -> Matriz */

let array1 = [

    [1,2,3],
    [4,5,6],
    [7,8,9]

];

console.log("Valor: ", array1[0]); /*=1,2,3*/
console.log("Valor: ", array1[1]); /*=4,5,6*/
console.log("Valor: ", array1[2]); /*=7,8,9*/

console.log("Valor: ", array1[0][0]); /*=1*/
console.log("Valor: ", array1[0][1]); /*=2*/
console.log("Valor: ", array1[0][2]); /*=3*/
console.log("Valor: ", array1[1][0]); /*=4*/
console.log("Valor: ", array1[2][2]); /*=9*/

/* Ciclo For 

for (Valor inicial;Prueba lógica; Incremento)*/

let array2 = [20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35];

for ( let i = 0; i <10; i++){

    console.log("Operando For", array2[i]);

} /*=20,21,22,23,24,25,26,27,28,29*/

for ( let i = 0; i <13; i++){

    console.log("Operando For", array2[i]);

} /*=20,21,22,23,24,25,26,27,28,29,30,31,32*/

/* Ciclo For Bidimensional */

let array3 = [

    [1,2,3],
    [4,5,6],
    [7,8,9]

];

for (let i = 0; i < 3; i++){

    for ( let j = 0; j < 3; j++){

        console.log("Operando For para una matriz", array3[i][j]);

    } /*=1,2,3,4,5,6,7,8,9*/

}

/* Operando con matrices */

let matrizResultado = [

    [],[],[]

]

for (let i = 0; i < 3; i++){

    for ( let j = 0; j < 3; j++){

        matrizResultado[i][j] = array3[i][j] * array3[i][j];

    } 

}

console.log(matrizResultado)

/*  [1,2,3], * [1,2,3], = [(1*1),(2*2),(3*3)] = [1, 4, 9 ],
    [4,5,6],   [4,5,6],   [(4*4),(5*5),(6*6)]   [16,25,36],
    [7,8,9]    [7,8,9]    [(7*7),(8*8),(9*9)]   [49,64,81] */

/* Ciclo While 

let var = (Inicializar variable)
while(condición){
    Ejecución
} */

let contador = 0;

while (contador < 10){

    console.log("Operando while", contador);
    contador ++;

} /*=1,2,3,4,5,6,7,8,9*/
