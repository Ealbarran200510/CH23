
/*

test('test suma', () => {
    // second 

})

const indexTest = require ("../calculadora"); //Js5

*/

// Prueba efectiva

import { indexTest } from "../Calculadora"; //Js6
test('test suma', () => {
  const r = indexTest.suma(3,2);
  expect (r).toBe(5);

});

test.todo("test resta");
test.todo("test mult");
test.todo("test divide");