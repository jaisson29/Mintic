'''
1) Desarrolle una solución que elimine las tildes de una lista de caracteres
    Ejemplo: á -> a
            é -> e
'''
#caracteres = ['á','é','í','ó','ú']

def eliminar_tildes(caracter: str):
    respuesta = caracter
    #Evaluar el caracter
    if caracter.lower() == 'á':
        respuesta = 'a'
    elif caracter.lower() == 'é':
        respuesta = 'e'
    elif caracter.lower() == 'í':
        respuesta = 'i'
    elif caracter.lower() == 'ó':
        respuesta = 'o'
    elif caracter.lower() == 'ú':
        respuesta = 'u'
    elif caracter.lower() == 'ñ':
        respuesta = 'n'

    return respuesta

#lista=['á','é','í','ó','ú', 'a', 'n']
mensaje = 'Sebastián, Andrés, Julián, Peñaranda'
resultado = ''.join(list(map(eliminar_tildes,mensaje)))
#print(resultado)


print('-------------------------------------------------')

'''
2) Utilizando la solución anterior, elimine los caracteres especiales 
    de una lista de cadena de caracteres
'''
nombres = ['Andrés', 'Julián', 'Iván', 'María', 'Mónica']

lista_nombres = []
for n in nombres:
    resp = list(map( eliminar_tildes, n ))
    lista_nombres.append(''.join(resp))

#print(lista_nombres)

#funcion = lambda name: ''.join(list(map(eliminar_tildes, name)))
#lista_respuesta = list(map( funcion, nombres ))

lista_respuesta = list(map( lambda name: ''.join(list(map(eliminar_tildes, name))), nombres ))
print(lista_respuesta)
