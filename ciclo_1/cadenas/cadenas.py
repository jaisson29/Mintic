cadena = "hola mundo"

primer_caracter = cadena[0]
segundo_caracter = cadena[1]

print(primer_caracter, segundo_caracter)

#Rebanando cadenas
'''
primera posicion incluye el caracter,
ultima posición excluye el caracter
'''
rebanado_1 = cadena[0:5]
print(rebanado_1)

#Accediendo desde la última posición hasta la primera
ultimo_caracter = cadena[-1]
penultimo_caracter = cadena[-2]
print(f'ultimo caracter: {ultimo_caracter} - penultimo: {penultimo_caracter}')

#cadena[1] = 'a' -> Esto no se puede hacer porque las cadenas son inmutables

#Obtener el tamaño de una cadena
#len -> Obtener tamaño de una cadena

print(len(cadena))

tamaño = len(cadena)
ultimo_caracter = cadena[ tamaño-1 ]
print(ultimo_caracter)


