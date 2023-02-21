
class game {

    secretNumber = 50;
    attemp = [];

    play () {

        let number;

        do {

            number = Number(prompt("Ingresa un numero del 1 al 100"));

            if (number < 0, number > 100) {
            alert("Numero no válido")
            }

            else if (number == this.secretNumber) {
                alert("Felicitaciones, encontraste el numero");
                console.log("Intentos: ", this.attemp);
                return;
            }

            else {
                this.attemp.push(number);
                alert("Ese no es el numero secreto, intenta de nuevo")
            }
        } while (true);
    }

}

const playGame = new game();
playGame.play();