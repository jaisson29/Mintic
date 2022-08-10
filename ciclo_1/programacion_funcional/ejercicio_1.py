'''
1) Desarrolle una función anónima que retorne el promedio de una lista de números
    sum([]) ✔️
2) Desarrolle un función anónima que reciba como parámetro un String y retorne 
    el primer caracter del String ✔️
3) Desarrolle una función anónima que reciba como parámetro nombre y apellido, retorne
    en una tupla las iniciales. ✔️
        Ejemplo:
            Luis Torres -> (L, T)
4) Desarrolle un software que eleve al cubo todos los números de una lista numérica.
        NOTA: Para este punto debe hacer uso de funciones lambda y funciones
        de orden superior
'''

# Punto 1


def sumar(lista):
    suma = 0
    for n in lista:
        suma += n
    return suma


def calcular_promedio(lista): return (sumar(lista)/len(lista))


print(calcular_promedio([10, 12, 10, 15, 20]))

# Punto #2
# Julio Sandoval


def parametro(nom): return nom[0]


print(parametro('Julio'))

# Punto #3


def iniciales(nombre, apellido): return (nombre[0], apellido[0])


print(iniciales('Andrés', 'Quintero'))

# Punto #4


def elevar(funcion, lista):
    lista_cubos = []
    for n in lista:
        result = funcion(n)
        lista_cubos.append(result)
    return lista_cubos


cubo = lambda n:  n**3

print( elevar(cubo, [2,5,4]) )

