let diaNumero = parseInt(prompt("Escribe el numero del día de la semana"));

if (diaNumero < 0){

    document.write("Número de día Inválido, ¿Día Negativo? ¿Te sientes bien?")

} else if (diaNumero == 0){

    document.write("Es Domingo :) De Bajón :(")
    
} else if (diaNumero == 1){

    document.write("Es Lunes :'(")

} else if (diaNumero == 2){

    document.write("Es Martes :(")

} else if (diaNumero == 3){

    document.write("Es Miércoles :|")

} else if (diaNumero ==4){

    document.write("Es Juevebes :)")

} else if (diaNumero == 5){

    document.write("Es BeViernes :D")

} else if (diaNumero == 6){

    document.write("Es SabaDrink :DDD")

} else if (diaNumero > 7) {

    document.write("Número de día Inválido, no hay más de 7 días ¬¬")

} else {

    document.write("Número de día Inválido")

}