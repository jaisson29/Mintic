
supermercado = {
    'belen': {
        'aseo': 18000000,
        'frutas': 35000000
    },
    'poblado':{
        'aseo': 15000000,
        'frutas': 38000000
    }
}

'''
1) Calcular el promedio de ventas por cada sede del supermercado
2) Obtener el TOTAl de VENTAS del supermercado
'''

cantidad_belen= len(supermercado['belen'])
belen = supermercado['belen']
promedio_belen = belen['aseo'] + belen['frutas']/cantidad_belen

cantidad_poblado= len(supermercado['poblado'])
poblado = supermercado['poblado']
promedio_poblado = poblado['aseo'] + poblado['frutas']/2
print(promedio_belen)
print(promedio_poblado)

total_ventas = belen['aseo']+ belen['frutas']+ poblado['aseo']+ poblado['frutas']
print (total_ventas)