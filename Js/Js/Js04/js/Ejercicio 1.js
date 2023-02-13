
/* Arreglo de personas en el banco */

let personas = ["Sofía", "David", "Juan"];

/* Se agregan dos personas a la fila y se elimina el primer elemento */

personas.push("Sara","Agustin");
personas.shift();

/* Agrega una persona en la posición deseada */

personas.splice(1,0,"Renata");

/* Agrega una persona al final del arreglo */

personas.push("Elena");

console.log(personas);