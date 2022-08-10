
import numpy as np
from numpy import divide, random as r

guion = lambda : print('-------------------------------------------')

#Crear una matriz
matriz = np.array( [ [10, 20], [30, 40] ] )
print(matriz)

guion()
flotante = np.array([[10,20], [30,40.2]])
print(flotante)

guion()
string = np.array([[10, 20],[30,'40']])
print(string)

guion()
matriz = np.array([[10,20],[30,40.2],['50','60']])
print(matriz)

guion()
guion()

matriz_zeros = np.array([ [0,0,0],[0,0,0],[0,0,0] ])
print(matriz_zeros)
matriz_zeros = np.zeros( [4,3] )
print(matriz_zeros)
matriz_ones = np.ones( [4,2] )
print(matriz_ones)

guion()
guion()


nombres = ['Juan', 'Maria', 'Juliana', 'Sebastian']

ganadores = r.choice( nombres, size=r.choice([1,2], size=[1]), p=[0.1, 0.2, 0.5, 0.2] , replace=False )
print(ganadores)

guion()
guion()

print('OPERACIONES')
guion()

numeros_1 = np.array([ [10,20,30,40],[50,60,70,80] ])
numeros_2 = np.array([ [12,15,20,90],[80,70,60,50] ])

#Sumar
guion()
suma = np.add( numeros_1,numeros_2)
suma = numeros_1 + numeros_2
print(suma)

#Resta
guion()
resta = np.subtract(numeros_1,numeros_2)
resta = numeros_1 - numeros_2
print(resta)

#Multiplicacion elemento a elemento
multiplicaion = numeros_1 * numeros_2
print(multiplicaion)

#Dvidir
dividir = numeros_1 / numeros_2
print(dividir)

matriz_1 = np.array([ [2,5,4], [1,2,10] ])
matriz_2 = np.array([ [10,2], [8,4], [1,5] ])

#Multiplicacion de matrizes

mult = np.dot(matriz_1, matriz_2)
print(mult)

guion()
guion()

nombres = ['Juan', 'Maria', 'Juliana', 'Sebastian']
#Reordenar la lista
r.shuffle(nombres)
print(nombres)
