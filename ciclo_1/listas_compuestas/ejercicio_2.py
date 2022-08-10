'''
Desarrolle una función que reciba como parámetro la lista compuesta 'notas',
Retornar el promedio por cada lista padre y  el promedio general dentro de un diccionario 
con la siguiente estructura:
    respuesta = {
        'promedios': [4.5, 4.2],
        'promedio_general': 4.35
    }
'''

notas = [
    [
        [4.5, 3.2, 4.9, 4.2],
        [3.5, 4.2, 3.9, 4.8]
    ],
    [
        [4.9, 3.9, 4.9, 3.2],
        [3.8, 4.4, 2.9, 3.8]
    ]
]

def calcular_promedios(notas: list)->dict:
    promedios = []
    promedio_general = 0
    contador_general = 0
    for i in notas:
        promedio_notas = 0
        cant_notas = 0
        for j in i:
            for k in j:
                promedio_notas += k
                cant_notas += 1
                promedio_general += k
                contador_general += 1
        promedio_notas /= cant_notas
        promedios.append(promedio_notas)
    promedio_general /= contador_general

    return {
        'promedios': promedios,
        'promedio_general': promedio_general
    }
print(calcular_promedios(notas))