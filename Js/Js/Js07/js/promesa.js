/*
const url = document.URL.toString(); // La URL del objeto document se guarda en la constante url
const promise = fetch(url); // Llamada a la función fetch con la url almacenada que devuelve una promesa en la variable promise
promise.then(result => console.log(result), e => console.log("Error en callback ${e}")); // La función then maneja la respuesta a la promesa, si se cumple se muestra console.log(result), si se produce un error entonces se imprime el mensaje de error con {e} que permite incluir el valor de la variable dentro de este mensaje

Ejemplo

// Se declara la variable url que contiene la URL donde se obtendrán los datos
let url = "https://jsonplaceholder.typicode.com/users";
// Se llama a la función fetch para obtener los datos, devuelve una promesa para utilizarlos
fetch(url)
// Se utilizan bloques then, primero se convierte la respuesta a formato json
.then(response=>response.json())
// Luego se llama a la función showData pasandole los datos convertidos a json
.then(data=>showData(data));
// Al final se maneja un mensaje de error en caso de no cumplirse la promesa inicial
.then(error=>console.log(error));

// La función showData recibe los datos y los utiliza para construir una tabla
const showData=(data)=>{
    console.log(data);
    let body="";
    //Cada fila se construye con un ciclo for que itera sobre cada dato
    for(var i=0, i<data.lenght;i++)
    body+=<tr>
    <td>${data[i].id}</td>
    <td>${data[i].name}</td>
    <td>${data[i].email}</td>
    </tr>
}
// La tabla se agrega al elemento HTML mediante innerHTML
document.getElementById("data").innerHTML=body
}
*/