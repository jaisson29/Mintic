estudiantes = {
    '1234': {
        'nombre': 'Bladimir',
        'apellido': 'Diuche',
        'edad': 25,
        'notas': {
            'nota_1': 3.2,
            'nota_2': 3.0,
            'nota_3': 4.5,
            'nota_4': 4.2
        }
    },
    '4321': {
        'nombre': 'Adriana',
        'apellido': 'Quintero',
        'edad': 28,
        'notas': {
            'nota_1': 3.1,
            'nota_2': 4.8,
            'nota_3': 4.2,
            'nota_4': 4.0
        }
    }
}

def calcular_promedios(dict_estudiante: dict):
    #Diccionario que representa el promedio de nota de los estudiantes
    dict_promedios = dict()#Crea un diccionario vacío
    #Iterar diccionario padre, es decir, 'estudiantes'
    for cedula, info in dict_estudiante.items():
        #Obtener las notas del estudiante
        notas = info['notas']
        promedio_notas = 0
        #Iterar el diccionario 'notas'
        #Ciclo anidado
        for n in notas.values():
            promedio_notas += n
        #Obtener la cantidad de notas
        cant_notas = len(notas)
        #Calcular el promedio de notas
        promedio_notas = promedio_notas / cant_notas
        #Añadir el promedio de la nota al diccionario dict_promedios
        #round -> redondear -> round(numero_redondear, cantidad_decimales)
        dict_promedios[cedula] = round(promedio_notas, 1)
    #Retornar diccionario
    return dict_promedios

print( calcular_promedios(estudiantes))

'''
1) Encapsule el ejercicio anterior dentro de una función que 
    reciba como parámetro el diccionario estudiantes ✔️
2) De la función desarrollada RETORNE un diccionario
    el cual relacione el promedio de notas de cada estudiante con 
    la cédula, ejemplo:
    {
        '1234': 3.7
    }
    Donde '1234' es la cédula y 3.7 es el promedio de la nota ✔️
'''
def Calcular_promedios (dict_estudiante: dict):
    dict_promedios = dict()
    for cedula, info in dict_estudiante.items():
        #Obtener las notas del estudiante
        notas = info['notas']
        promedio_notas = 0
        #Iterar el diccionario 'notas'
        #Ciclo anidado
        for n in notas.values():
            promedio_notas += n
        #Obtener la cantidad de notas
        cant_notas = len(notas)
        #Calcular el promedio de notas
        promedio_notas = promedio_notas / cant_notas  
        dict_promedios[cedula] = promedio_notas
    
    return dict_promedios

print( Calcular_promedios(estudiantes))
""" 
persona = {
    '1144558810': {'firstname': 'Jeison', 'lastname': 'Diuche'}
}

for cedula, info in persona.items():
    firstname = info['firstname']

firstname = persona['fullname']['firstname']

fullname = persona['fullname']
firstname = fullname['firstname']
"""
#tamanio = len(estudiantes)
#print("tamaño-> ", tamanio)
