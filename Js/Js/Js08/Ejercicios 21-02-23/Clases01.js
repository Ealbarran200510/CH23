
/* 

class Person{

    constructor (name, lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

let person1 = new Person ("Ana", "Smith");
console.log(person1, name)
console.log(person1, lastName)

let person2 = new Person ("John", "Lowe");
console.log(person2)

*/

// Creando la clase Person
class Person{

    // Creando un constructor que toma dos argumentos y los asigna: name y lastName
    constructor (name, lastName) {
        this._name = name;
        this._lastName = lastName;
    }

    // La clase tiene 4 métodos:

    // "Set's" permiten cambiar los valores
    set name (name) {
        this._name = name;
    }

    // "Get's" devuelven los valores asignados
    get name () {
        return this._name;
    }

    set lastName (lastName) {
        this._lastName = lastName;
    }

    get lastName () {
        return this._lastName;
    }

    // Los atributos se acceden usando guión bajo indicando que son protegidos (no públicos) y sólo pueden ser accedidos por los métodos de la clase

    // Agregando el método fullName para devolver nombre completo
    fullName () {
        return this._name + " " + this.lastName
    }

    // Agregando el método toString para sobrescribir de la clase padre Object
    toString () {
        return this.fullName();
    }
}

let person3 = new Person ("Lorient", "Blanc");
person3._name = "Louis";
console.log(person3._name);

person3._lastName = "Oier";
console.log(person3._lastName)

// Creando la clase Employe
class Employe extends Person{

    // Recibe name y lastName de la clase Person y además agrega el atributo area
    constructor (name, lastName, area) {
        super(name,lastName); // Hereda de la clase Person usando super
        this._area = area;
    }

    set area (area) {
        this._area = area;
    }

    get area () {
        return this._area;
    }

    // Implementando el método fullName en la clase Employe, este utiliza el mismo método de la clase Person, lo llama con super y lo concatena al valor area

    // Sobrescritura
    fullName () {
        return super.fullName() + " , " + this._area
    }
}

let person1 = new Person("Gorka", "Urreta");
console.log(person1);

let employe1 = new Employe("Jules", "Bouquet", "Human Resources");
console.log(employe1);
console.log(employe1._name);

console.log(person1.fullName());
console.log(employe1.toString());
