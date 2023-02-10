/*

switch (expresión) {
  case valor1:
    Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor1
    [break;]
  case valor2:
    Declaraciones ejecutadas cuando el resultado de expresión coincide con el valor2
    [break;]
  ...
  case valorN:
    Declaraciones ejecutadas cuando el resultado de expresión coincide con valorN
    [break;]
  default:
    Declaraciones ejecutadas cuando ninguno de los valores coincide con el valor de la expresión
    [break;]
}

*/

let numeroDias = Number(prompt("¿Cuántos días tiene este mes?"));
switch (numeroDias) {

    case 28:

        document.write("Es Febrero");
        break;

    case 29:

        document.write("Es Febrero en año bisiesto");
        break;

    case 30:

        document.write("Abril, Julio, Septiembre o Noviembre");
        break;

    case 31:

        document.write("Enero, Marzo, Mayo, Junio, Agosto, Octubre o Diciembre");
        break;

    default:

        document.write("No hay meses con esa cantidad de días, wey");
        break;

}