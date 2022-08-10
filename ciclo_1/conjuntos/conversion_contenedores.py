usuarios_a = ['Sebastián', 'Juan', 'Juliana', 'María', 'Luis']
usuarios_b = ['Jaisson', 'Julián', 'Mónica', 'Andrés', 'Luis', 'Juan']

set_usuarios_a = set(usuarios_a)
set_usuarios_b = set(usuarios_b)

usuarios_comun = set_usuarios_a.intersection(set_usuarios_b)
usuarios_comun = list(usuarios_comun)
print(usuarios_comun)

tupla = (10,20,30,40,50,60)
conjunto_tupla = set(tupla)
print(conjunto_tupla)

print('--------------------------')

dict_persona = {
    'nombre': 'Andrés',
    'apellido': 'Quintero',
    'edad': 28,
    'telefono': '123456767898'
}
print('---Conjunto con las claves del diccionario: ')
conjunto = set( dict_persona.keys() )
print(conjunto)

print('---Conjunto con los valores del diccionario: ')
conjunto = set( dict_persona.values() )
print(conjunto)

print('----------CADENA DE CARACTERES A CONJUNTO------------------------')
nombre = 'jaisson'
conjunto_nombre = set(nombre)
print(conjunto_nombre)

lista_nombre = list(conjunto_nombre)
str_nombre = "".join(conjunto_nombre)
print(str_nombre)
