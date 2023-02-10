let miVariable = 34;

let miArreglo = []; //declaración literal
let miArreglo1 = new Array(); //por instancia

let miArreglo01 = [31,32,33,34];
console.log("Dato del arreglo en el índice 0 - " + miArreglo01[0]);
console.log("Dato del arreglo en el índice 0 - " + miArreglo01[1]);
console.log("Dato del arreglo en el índice 0 - " + miArreglo01[2]);
console.log("Dato del arreglo en el índice 0 - " + miArreglo01[3]);

let miArreglo001 = [{nombre:"Ashley"},{apellido:"Smith"},{edad:26}];
console.log(miArreglo001[0].nombre);
console.log(miArreglo001[1].apellido);
console.log(miArreglo001[2].edad);
console.log("Tamaño del arreglo: " + miArreglo001.length);

let miArreglo0001 = [9,5,7,4];
console.log("Arreglo ordenado: " + miArreglo0001.sort());
console.log("Arreglo ordenado inverso: " + miArreglo0001.reverse());
console.log("Metodo pop: " + miArreglo0001.pop());

let matriz = [[4,9,8], 
            [6,7,0], 
            [9,1,3]];
console.log("Tamañano: " + matriz.length)
console.log(matriz[1][1]);
console.log(matriz[0][2]);
console.log(matriz[1][2]);
