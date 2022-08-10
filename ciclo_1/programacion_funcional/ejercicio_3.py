'''
1) Desarrolle una función que reciba como parámetro una lista de String y
    retorne una lista de String donde cada elemento tenga la inicial en mayúscula
'''

nombres = ['andrés', 'julián', 'iván', 'maría', 'mónica']

inicial_mayuscula=lambda name:name.replace(name[0],name[0].upper())
resultado = list(map(inicial_mayuscula,nombres))
print(resultado)

#-----------------------
mayus = lambda x: x.capitalize()


print( list(map(mayus, nombres)) )

def primera_mayus(funcion, nombres):
    lista_nombres = []
    """ for name in nombres:
        resp = funcion(name)
        lista_nombres.append(resp) """
    
    return list(map(funcion, nombres))

print(primera_mayus(mayus, nombres))

print('-------------------------------')

def capital(list):
    mayusculas = []
    for n in list:
            mayusculas.append(n.capitalize()) 
    
    return mayusculas

print(capital(nombres))

