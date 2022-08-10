
contador = 1
impares = []
while contador < 100:
    if contador%2 != 0:
        impares.append(contador)
    contador +=1

print(contador)

iniciales = []
nombres = ['Juan', 'Pedro']

primer_nombre = nombres[0]
segundo_nombre = nombres[1]

iniciales.append(primer_nombre[0], segundo_nombre[0])
print(iniciales)

'''
1) Cree una lista con todos los números impares de 
    1 hasta 100

2) Cree una lista de String, almacene los nombres de 2 estudiantes en la lista,
    posteriormente cree otra lista con las iniciales de cada nombre
    Ejemplo:
    nombres = ['Juan', 'Luis']
    iniciales = ['J', 'L']
'''
#Punto 1
contador = 1
impares = []
while contador <= 100:
    if contador%2 != 0:
        impares.append(contador)
    contador += 1

#print(impares)

#Punto 2
nombre1=input("agregue nombre 1: ")
nombre2=input("agregue nombre 2: ")
nombre3=input("agregue nombre 3: ")

estudiantes=[nombre1, nombre2, nombre3]

n1=estudiantes[0]
n2=estudiantes[1]
n3=estudiantes[2]

total_iniciales=[n1[0],n2[0], n3[0]]

print(total_iniciales)

print('------------------')

nombre= []
nombre1= input('escriba nombre')
nombre.append(nombre1)
print(nombre)
nombre2= input('escriba nombre')
nombre.append(nombre2)

iniciales = [nombre1[0], nombre2[0]]
print(iniciales)
