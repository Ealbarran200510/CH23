
class OperacionesAritmeticas{
    num0 = 5;
    num1 = 0;

    constructor(valor0, valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(a,b){
        return a+b;
    }
}

let obj4 = new OperacionesAritmeticas(8, 6);

let obj3 = new OperacionesAritmeticas();
obj3.num0 = 8;
obj3.num1 = 5;

console.log(obj3.sumar(obj3.num0, obj3.num1));

let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5, 6));

let obj1;
obj1 = new OperacionesAritmeticas();
console.log(obj1.numero0);