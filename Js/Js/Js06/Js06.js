/*

DOM

- Node: Unidad mas básica del documento. Etiqueta, texto dentro de una etiqueta, comentario, etc.

    <title> Node
        Manipulación DOM | Nodo hijo de title
    </title>

- Document: Nodo de tipo documento, nodo raíz a partir del cual se generan todos los demás nodos

- Element : Nodos definidosn por etiquetas: <div> <img> <h1> <p>

- Attributes: Nodos dan información asociada al tipo de elemento

- Comentario: Considerados también nodos dentro del HTML

*/

/* Leer nodos

Versiones anteriores de Js

- document.getElementById()
- document.getElementByTagName()
- document.getElementByClassName()

// Asignando el elemento a una variable para usarlo en cualquier parte del código

var elementId = document.getElementById("botonResta");
console.log(elementId);

var elementTag = document.getElementsByTagName("button");
console.log(elementTag);

var elementClass = document.getElementsByClassName("botones");
console.log(elementClass);

// Método actual

var element = document.querySelector("#input1");
console.log(element);

var elements = document.querySelectorAll(".botones");
console.log(elements);

//Creando un nodo

- document.createElement(tipoNodo);

*/

var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var btnSuma = document.getElementById("btnSuma");
var btnResta = document.getElementById("btnResta");
var btnMult = document.getElementById("btnMult");
var btnDiv = document.getElementById("btnDiv");

var result = document.getElementById("result")

// Creando etiqueta de tipo imagen

const img = document.createElement("img");

// Creando atributos para img

img.src = "https://acf.geeknetic.es/imgri/imagenes/tutoriales/definiciones/2020/12/Calculadora-g841.jpg?f=webp";
img.alt = "Imagen";
img.style.width = "150px";
img.style.borderRadius = "50";

// Insertando elementos o nodos en la página

document.body.append(img);

var textImg = document.createElement("p");
textImg = "Esta es una imagen";

document.body.append(textImg);

/* Modificando nodos */


// Identificar el nodo

var modifResult = document.getElementById("result");

// Modificarlo

modifResult.innerHTML = "Resultado de la operación";

/*

Manipulacion del DOM


    - Metodos para acceder a elementos 

        - document.getElementById
        - document.getElementsByTagName
        - document.getElementosByClassName


    - Metodos para crear elementos  

        - document.createElement(etiqueta)
        - document.createTextNode(texto)


    - Metodos para insertar elementos

        - parentElement.append
        - parentElement.insertBefore
        - parentElement.insertAdjacentElement


    - Metodos para modificar elementos

        - node.outerHTML (leer o referenciar el elemento)
        - node.innerHTML (modificar el elemento)

*/

// Definir el elemento con el cual interactuar

var changeElement = document.querySelector("#h1")

// Creando la función que ejecuta la acción

function changeColor(color){
    changeElement.style.color = color;
}

// Creando funciones para operaciones

function suma (){

    let v1 = parseInt(input1.value); // Recibiendo valor de input 1
    let v2 = parseInt(input2.value); // Recibiendo valor de input 2
    let suma = (v1 + v2);            // Operando
    result.innerHTML = suma;         // Asignando la función al id=result

}

function resta (){

    let v1 = parseInt(input1.value);
    let v2 = parseInt(input2.value);
    let resta = (v1 - v2);            
    result.innerHTML = resta;         

}

function mult (){

    let v1 = parseInt(input1.value);
    let v2 = parseInt(input2.value);
    let mult = (v1 * v2);            
    result.innerHTML = mult;         

}

function div (){

    let v1 = parseInt(input1.value);
    let v2 = parseInt(input2.value);
    let div = (v1 / v2);            
    result.innerHTML = div;         

}

// Creando un evento

btnSuma.addEventListener("click", suma); //nodo . evento a escuchar (accion , funcion)
btnResta.addEventListener("click", resta);
btnMult.addEventListener("click", mult);
btnDiv.addEventListener("click", div);