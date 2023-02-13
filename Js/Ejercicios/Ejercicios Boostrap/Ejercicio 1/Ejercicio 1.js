
const btn = document.querySelector('button');

function changeName () {

    var name = prompt("Introduce tu nombre");
    document.write("Hola ", name);

}

btn.addEventListener('click', changeName);

changeName();