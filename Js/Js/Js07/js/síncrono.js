
// Funciones síncronas

// Ejecución secuencial del proceso
// Procesos bloqueantes, no se ejecuta la siguiente línea hasta la terminación de la anterior


alert("Hola");
console.log("Hola, secuencial");

alert("Adiós");
console.log("Adiós, secuencial");


// Funciones asíncronas

// Ejecución del proceso no secuencial
// Procesos no bloqueantes, no necesitan esperar a que se ejecute la acción anterior

// setTimeout ejecuta la función 2000 ms después de la secuencia
setTimeout(

    function () {
        console.log("Hola, timeout");
    }, 2000
)

// setTimeout pasa a espera y console.log se ejecuta
console.log("Segundo secuencial");

const callback = () => console.log("Hola timeout simplificado");
setTimeout(callback,3000);


//