#Esto es un comentario de una sola linea

"""
Esto es un comentario 
de varias 
lineas
"""

'''
Esto es un comentario
de varias
lineas
'''

#Instrucción para mostrar un mensaje en pantalla
print('---------------------')
print("¡Hola mundo!")
print('---------------------')

'''
\n -> Salto de linea
\t -> Tabular
'''

print('-----------\nUniversidad\tTecnológica de Pereira\n--------------')

'''
------------VARIABLES---------
'''
#Númericas de tipo entero
miVariable = 10
num_1 = 200
num1 = 100
num_2 = 300
num_3 = -100

#Flotantes (Decimales) "float"
flotante = 10.11

#String (texto) "str"
mensaje = "Hola mundo desde una variable"

print(mensaje)
'''
Indicar el tipo de dato en las variables únicamente es 
para legibilidad de código
'''
#str -> String (texto)
direccion: str = "Cra 100 #20-22"
#float -> flotante
num_5: float = 3.1416
#int -> entero
num_4: int = 50


#Operaciones básicas
num_1 = 50.22
num_2 = 100.05
num_3 = 120
num_4 = 200

suma = num_1 + num_2
multiplicacion = num1 * num_2
division = multiplicacion / 2
#Elevado a la potencia (Potenciacion)
elevado = suma ** 2
# % -> módulo (retorna el residuo de una división)
modulo = suma % 2

#----------Concatenando en un print----------
print("Suma = ", suma)
#Limitar el número de decimales
print("suma = %.2f" %suma)
#Mostrar múltiples vairable limitando el número de decimales
print("%.2f * %.2f = %.3f" %(num_1,num_2,multiplicacion))

print(f"{num_1} * {num_2} = {multiplicacion}")

print(f"Suma = {suma}")
