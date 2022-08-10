
from functools import reduce


numeros = [1,2,3,4,5]

sumar = lambda acumulador, elemento: acumulador+elemento

respuesta = reduce(sumar, numeros)
respuesta = reduce(lambda acumulador, elemento: acumulador-elemento, numeros)
print (respuesta)


nombre = 'Juan'
separar = lambda ac, e: ac+'-'+e
respuesta = reduce(separar, nombre)
print (respuesta)


lista = ['Python', 'Java', 'C#', 'JavaScript', 'Ruby', 'Elixir', 'Dart']

separar = lambda ac, e: ac+'-'+e
print (reduce(separar, lista))

lista_numerica = [10,11,12,13,14,15,16,17,18,19,20]

acum= lambda acumulador, numeros: acumulador+numeros
reducir = reduce(acum,lista_numerica)
print(reducir)