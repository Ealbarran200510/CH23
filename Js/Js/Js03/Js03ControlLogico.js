let horaDia = Number(prompt("¿Qué hora es? (Formato: Horas . Minutos 24HORAS)"));

if (horaDia < 0){

    document.write("¿Días con hora negativa? Ya duérmete.")

} else if (horaDia < 6){

    document.write("¿Te puedes dormir ya?")

} else if (horaDia >= 6 && horaDia < 12){

    document.write("Buenos días")

} else if (horaDia >= 12 && horaDia < 18){

    document.write("Buenas tardes")
    
} else if (horaDia >= 18 && horaDia <= 24){

    document.write("Buenas noches")

} else if (horaDia > 24){

    document.write("Días de +24Hrs. Directamente desde Venus")

} else {

    document.write("Hora no válida")

}