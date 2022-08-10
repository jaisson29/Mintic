'''
A->#
B->@
C->!
D->"
☺☻
Desarrollar codificador
'''


from functools import reduce


letras = ['A', 'B', 'C', 'D', 'E', 'F','G','H','I','J','K','L']
caracteres_especiales = ['#', '@', '"', '-', '_', '!','$','%','&','/','?','¿']

relacion_letras_caracteres = list( zip(letras, caracteres_especiales) )
print(relacion_letras_caracteres)

mensaje = "ceja"
'''
ceja -> [(),()]
'''

def codificar_mensaje(relacion_letras_caracteres, mensaje):
    filtrar = lambda letra: list(filter( lambda tupla: tupla[0]==letra.upper() ,relacion_letras_caracteres ))
    resp = list(map( filtrar, mensaje))
    
    codificacion = list(map(lambda e: e[0][1], resp))
    print(codificacion)
    codificacion = reduce( lambda ac,e: ac+e, codificacion )
    return codificacion

print( codificar_mensaje(relacion_letras_caracteres, mensaje) )
