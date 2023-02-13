
function booleanDay(day){

    var day = Number(prompt("Ingrese el número de día (1-Lunes, 7-Domingo)"));

    if (day >= 1 && day <= 5) {

        var day = true;
        console.log(day);

    } else {

        var day = false;
        console.log(day);

    }

}

function booleanHour(hour){

    var hour = Number(prompt("Ingresa la hora (En 'HoraPUNTOMinuto', Formato 24 Horas)"));

    if (hour >= 9 && hour <= 18) {

        var hour = true
        console.log(hour);

    } else {

        var hour = false;
        console.log(hour);

    }

}

booleanDay();
booleanHour();

function businessHour(booleanDay,booleanHour){

    if(booleanDay == true && booleanHour == true ){

        console.log("Horario comercial")

    } else {

        console.log("Horario no comercial")

    }

}

businessHour();