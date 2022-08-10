
numeros = [10, 15, 20, 25, 30, 35, 40, 50, 55]

pares = lambda n: n%2 == 0
impares = lambda n: n%2 != 0

resp = list(map(pares, numeros))
print(resp)
resp = list(map(impares, numeros))
print(resp)

'''
1) A partir de la lista 'nombres' filtrar todos los nombres que comiencen por J
'''

nombres = ['Andres', 'Juan', 'Julian', 'Jorge', 'Ivan', 'Hugo', 'Oliver', 'Jairo']

funcion = lambda n: n[0].lower() == 'j'

filtro = list(filter(funcion, nombres))
print(filtro)
    