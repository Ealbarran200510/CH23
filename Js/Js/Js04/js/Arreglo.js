
/* List Lenght para mostrar el numero de elementos del arreglo */

let list = [12,5,80,34,7];
console.log("Longitud del arreglo: ",list.length);

/* */

for (let i = 0; i < list.length; i ++){

    console.log("Operando con lenght", list[i]);

}

console.log(list);

/* Agregando elementos al arreglo */

let list1 = list.slice(1,3);
console.log(list1)

/* Agregando caracteres entre elementos */

let caracter = list.join("**");
console.log(list);

/* Agregando elemento al final de la lista */

list.push(50);
console.log(list);

/* Concatenando elementos */

let elements = list.concat(22,48,91);
console.log(elements);

/* Eliminando el último elemento */

list.pop();
console.log(list);

/* Eliminando el primer elemento */

list.shift();
console.log(list);

/* Eliminando un elemento específico del arreglo */

elements.splice(2,1);
console.log(elements);

/* Eliminando un elemento específico del arreglo y agregando un elemento */

list.splice(2,1,66,79);
console.log(list);


/* Eliminando un elemento específico y dividiendo el arreglo */

let remove = elements.splice(2,3);
console.log(remove);
console.log(elements);

/* Invirtiendo el orden del arreglo */

list.reverse();
console.log(list);

/* Ordenando ascendentemente el arreglo (TOMA EL PRIMER NUMERO!!!) */

list.sort();
console.log(list);

/* Ordenando de menor a mayor */

list.sort(

    function (val1,val2) {

        return val1 - val2;

    }

);

console.log(list);



let varN = list.map(

    function(valN1){

        return valN * 2
    }

)

console.log(varN);