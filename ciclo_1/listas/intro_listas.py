
listaVacia = []
listaVacia = list()

miLista = [5, 3.1416, 'Hola mundo', True, False]
print(miLista)

print('----------ACCEDER A UN VALOR---------')
e1 = miLista[0]
print(e1)
e2 = miLista[1]
e3 = miLista[2]
e4 = miLista[3]
e5 = miLista[4]
print(e2)
print(e3)
print(e4)
print(e5)

print('----------ACTUALIZAR A UN VALOR---------')
miLista[0] = 10
print(miLista)

print('----------AGREGAR ELEMENTOS---------')
nombres = []
print(nombres)
#Agregar elementos a la lista
nombres.append('Juan')
nombres.append('Juliana')
nombres.append('María')
nombres.append('Andrés')
nombres.append('Ricardo')
print(nombres)

print('----------ELIMINAR ELEMENTOS---------')
#Eliminar el último elemento
nombres.pop()
print(nombres)
#Eliminar elemento por indice
nombres.pop(2)
print(nombres)
