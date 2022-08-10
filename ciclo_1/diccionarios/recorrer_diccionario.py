notas = {
    'nota_1': 3.2,
    'nota_2': 3.0,
    'nota_3': 4.5,
    'nota_4': 4.2
}

print('-----------ITERACIÓN OBTENIENDO LAS CLAVES------------')
#Recorrer diccionario obteniendo las claves
for x in notas:
    print('clave -> ', x)
    #valor = notas[x]
    #print('valor -> ', valor)

print('-----------ITERACIÓN OBTENIENDO LOS VALORES------------')
#Recorrer diccionario obteniendo los valores
for n in notas.values():
    print(n)

print('-----------ITERACIÓN OBTENIENDO CLAVE-VALOR------------')
#Recorrer diccionario obteniendo clave-valor
for clave, valor in notas.items():
    print("Clave-> ", clave)
    print("valor-> ", valor)




suma= 0

for v in notas.values():
    suma += v
    
print("%.0f" %suma)