/*

Optimizar los siguientes códigos


if (GPAacumulativo > 2.0){
    
    if(unidadesTotales >= 120){
        
        console.log("¡Puede graduarse!")
        
    }
}

*/

let GPAacumulativo = 2
let unidadesTotales = 130

if(GPAacumulativo >= 2.0 && unidadesTotales >= 120){

    console.log("¡Puede graduarse!")

} else {

    console.log("No puede graduarse")

}

/*

if(cspCalificacion >= 75){

    console.log("¡Eres elegible para la graduación!");

}

if(progCalificacion >= 75){

    console.log("¡Eres elegible para la graduación!");

}

*/

let cspCalificacion = 95
let progCalificacion = 75

if(cspCalificacion >= 75 && progCalificacion >= 75){

    console.log("¡Eres elegible para la graduación!");

} else {

    console.log("No eres elegible para la graduación");

}

// Agrega puntos entre las letras de cada palabra, pero no entre las dos palabras.
// Resultado: "H.o.l.a M.u.n.d.o"

let text = "Hola Mundo";

let message = [];

for (let index = 0; index < text.length; index++){

    message += text[index] + ".";

}

let partMessage1 = message.substring(0,7);
let partMessage2 = message.substring(10,19);
console.log(partMessage1 + " " + partMessage2);
