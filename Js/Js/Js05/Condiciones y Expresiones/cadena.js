
// Usando la variable text como objeto 

let text = "Hola";
let message = "El texto tiene " + text.length + " caracteres";

console.log(text);
console.log(message);

// Concatenando caracteres

let message1 = " ";

for (let index = 0; index < text.length; index++){

    message1 += text[index] + " ";

}

console.log(message1);

message1 = message1.trim(message1); //Elimina espacio en blanco al inicio y al final del mensaje
console.log(message1);

// Copiando parte del mensaje a partir de una posición

let partMessage = message.substr(3);
console.log(partMessage);

// Copiando parte del mensaje a partir de dos posiciones

let partMessage1 = message.substring(3,16);
console.log(partMessage1);

// Insertando entre caracteres

let message2 = "AB";
message2.split(" ");
console.log(message2[0] + " / " + message2[1]);

// Comprobando si existen caracteres dentro de un string

let message3 = "A,B,C,D,E,F";

if(message3.includes("H")){

    console.log("Yes");

} else{

    console.log("No");

}