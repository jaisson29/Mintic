

numeros = [10,20,30,40,50,60,70,80,90]

numeros_al_cuadrado = [n**2 for n in numeros]

print(numeros_al_cuadrado)

#La linea 10 y 11 es lo mismo que la linea 4
lista = []
for n in numeros:
    lista.append(n**2)


nombres = ['Andres', 'Juliana', 'Claudia', 'Oliver', 'Bladimir']

iniciales = [n[0] for n in nombres]
print(iniciales)


nombres_mayusculas = [n.capitalize() for n in nombres]
print(nombres_mayusculas)



formula = lambda n: (n+10)*2

lista = [formula(n) for n in numeros]
print(lista)


nombres = ['Andres', 'Juliana', 'Claudia', 'Oliver', 'Bladimir']

list_nombres = [tuple(n) for n in nombres]
print(list_nombres)



numeros = [10,20,30,40,50,60,70,80,90,15,25,35,45,55,65,75,85,95]

numeros_pares = [n for n in numeros if n%2==0]
print(numeros_pares)
numeros_impares = [n for n in numeros if n%2 !=0]
print(numeros_impares)


numeros_impares = [n if n%2==0 else 0 for n in numeros]
print(numeros_impares)


nombres = ['Andres', 'Juliana', 'Claudia', 'Oliver', 'Bladimir', 'Juan', 'Jorge', 'JUlieta']

nombres_x_j = [n.upper() for n in nombres if n[0].lower() == 'j']
print( nombres_x_j)


'''
* Generar una lista con los nombres que empiezan por j en minuscula, 
    en lo contrario guardarlos en mayuscula
'''

nombres = ['Andres', 'Juliana', 'Claudia', 'Oliver', 'Bladimir', 'Juan', 'Jorge', 'JUlieta']

nombres_m_M = [n if n[0].lower()=='j' else n.upper() for n in nombres]
print(nombres_m_M)