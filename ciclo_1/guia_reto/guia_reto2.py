'''
*La función debe recibir como parámetro un diccionario con la siguiente estructura: ✔️
    informacion = {
        'id_cliente': 0,
        'nombre': '',
        'edad': 0,
        'primer_ingreso': False
    }
*La función debe retornar un diccionario con la siguiente estructura:
    respuesta = {
        'nombre': '',
        'edad': 0,
        'atraccion': '',
        'primer_ingreso': False,
        'total_boleta': 0,
        'apto': False
    }
*apto -> Verdad SOLO si el cliente está dentro del rango de edad de la tabla ✔️
*atraccion y total_boleta -> 'N/A' si no está dentro del rango de edad ✔️
*Si es primer primer ingreso se aplica un descuento ✔️
'''

'''
informacion = {
        'id_cliente': 0,
        'nombre': '',
        'edad': 0,
        'primer_ingreso': False
    }
'''

def cliente(informacion: dict)->dict:

    #Obtener edad
    edad = informacion['edad']
    atraccion = 'N/A'
    total_boleta = 'N/A'
    apto = False
    #Evaluar la edad dentro de los rangos descritos
    if edad > 18:
        apto = True
        atraccion = 'X-Treme'
        valor_boleta = 20000
        #Evaluar si es primer ingreso
        if informacion['primer_ingreso']:
            #Aplicar descuento sobre el valor de la boleta
            valor_boleta = valor_boleta - (valor_boleta*0.05)
    elif edad >= 15:
        pass
    elif edad >= 7:
        pass

    respuesta = {
        'nombre': informacion['nombre'],
        'edad': informacion['edad'],
        'atraccion': atraccion,
        'apto': apto,
        'primer_ingreso': informacion['primer_ingreso'],
        'total_boleta': valor_boleta
    }

    return respuesta


#Testear la función
informacion = {
        'id_cliente': 1,
        'nombre': 'Johana Fernandez',
        'edad': 20,
        'primer_ingreso': False
    }

print( cliente(informacion) )
