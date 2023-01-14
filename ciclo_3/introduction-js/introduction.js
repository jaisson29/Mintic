/**
 * VARIABLES
 **/
// Contante
const n1 = 10;
//Variables
let n2 = 50;
n2 = 20;
var n3 = 40;
n3 = 10;
// let flag = true;
// let flag = false;

const suma = n1 + n2 + n3;
// Mostrar datos en consola
console.log("Suma: " + suma);

/** Estructura de datos **/
let numeros = [10, 20, 30, 40, 50, 60];
console.log(numeros);
// Añadir elementos
numeros.push(70);
console.log(numeros);
// Eliminar ultimo elementos
numeros.pop();
// Eliminar elemento por su posicion
numeros.shift(3);
console.log(numeros);

// Iterar numeros
for (let i = 0; i < numeros.length; i++) {
	console.log("numeros-> ", numeros[i]);
}

//Objetos
let persona = {
	nombre: "Juliana",
	apellido: "Hernandez",
	edad: 28,
	telefonos: ["31234", "4567"],
};
// Imprimir objeto
console.log(persona);

// Acceder a los atributos
console.log(persona.nombre);
console.log(persona["apellido"]);
// Obtener los valores con un array
console.log(Object.values(persona));
// Obtener las llaves como un array
console.log(Object.keys(persona));
let values = Object.values(persona);
// Imprimir valores de un objeto
for (let i = 0; i < values.lenght; i++) {
	console.log(Values[i]);
}
