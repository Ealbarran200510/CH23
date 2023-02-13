
function getDayNumber (janFirstDay,yearDayNumber){

    var janFirstDay = Number(prompt("Ingresa el dia de la semana correspondiente al 1 de Enero (0-Lunes, 6-Domingo"));
    var yearDayNumber = Number(prompt("Ingresa el numero del día del año y te diré a qué día de la semana corresponde"));

    switch (janFirstDay){

        case (0):

        if((yearDayNumber%7)===0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52){

        console.log("Es Lunes")

        } else {

            console.log("Es")

        }

        case (1):

        if((yearDayNumber%7)===0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52){

            console.log("Es Martes")
    
            } else {
    
                console.log("Es")
    
            }
    }

}

getDayNumber();
