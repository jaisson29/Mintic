
tupla = tuple()

tuplaSencilla_1 = (5,)
tuplaSencilla_2 = 5,
print(tuplaSencilla_1)
print(tuplaSencilla_2)

tupla_numeros = 10,20,30,40,50,
print(tupla_numeros)

print(tupla_numeros[0])

print('-----------DESEMPAQUETADO DE TUPLAS----------------')
n1,n2,n3,n4,n5 = tupla_numeros
print(n1)
print(n2)
print(n3)
print(n4)
print(n5)


#No se puede hacer (Una tupla es inmutable)
#tupla_numeros[0] = 50

def sumar():
    n1 = 10
    n2 = 20
    
    return n1,n2
print(sumar)

print('--------------------DE LISTAS A TUPLAS----------------------')
lista_numeros = [10,20,30,40,50]
tupla_numeros = tuple(lista_numeros)
print(tupla_numeros)