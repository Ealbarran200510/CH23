
/*

Condicionante


If (Condition) {

    Código/Acción

} Else

*/

let edad = parseInt(prompt("Escribe tu edad"));

if (edad < 12){

    document.write("No puedes, estás chiquito")

} else if (edad < 18){

    document.write("Eres un niño")

} else if (edad < 40){

    document.write("Hola millenial")

} else if (edad < 60){

    document.write("Hola cñor")

} else if (edad < 80){

    document.write("Hola abuelo")

} else if (edad >= 80){

    document.write("¿Cómo es que sigues vivo?")

} else {

    document.write("Dije EDAD")

}