'''
1) Desarrollar una función que reciba como parámetro el nombre y edad de una persona,
    retorne un String que indique si la persona es mayor de edad o menor de edad
    Ejemplo:
        'Pedro Perez es mayor de edad'
        ó 'Pedro Perez es menor de edad'

2) Desarrollar una función que retorne una serie de ejercicios al usuario, la función debe
    recibir como parámetro un String.
    facil:
        10 flexiones de pecho
        10 sentadillas
    medio:
        50 flexiones de pecho
        10 burpes
        50 sentadillas
    avanzado:
        100 flexiones de pecho con palmada
        80 paracaidistas
        200 abdomilaes
    NOTA:
        \n -> Salto de linea
        \t -> Tabular
'''

#Solucion punto 1
def edad(nombre: str, años: int):
    if años >= 18:
        mostrar= f"{nombre} es mayor de edad"
    else:
        mostrar= f"{nombre} es menor de edad"
    return mostrar
        
edad('jaisson', 17)
        
#Solucion punto 2 

def ejercicios(nivel: str):
    if nivel == 'facil':
        dificultad = "10 flexiones de pecho\n10sentadillas"
    elif nivel == 'medio':
        dificultad = "50 flexiones de pecho\n10 burpes\n50 sentadillas"
    elif nivel == 'avanzado':
        dificultad = "50 flexiones de pecho con palma\n80 paracaidistas\n200 sentadillas" 
    return dificultad

print(ejercicios('facil'))

#Solucion punto 3
'''

3) Desarrollar una función que retorne una cadena con el valor del interes y 
el total del dinero a retirar de un CDT.
    * Si el usuario retira el dinero menor o igual a dos meses se 
        aplica una penalidad del 2%(0.02)
        valor_penalidad = dinero_invertido * 0.02
    *Si el usuario retira el dinero mayor a dos meses recibirá un interés sobre su dinero
        valor_interes = (dinero * porcentaje_interes * tiempo) / 12
    
    NOTA:
        La función deberá recibir como parámetro: dinero, porcentaje_interes, tiempo
    
    Ejemplo de la cadena que debe retornar si no aplica penalidad:
        "*El valor del interés es de {valor_interes} 
         *El total del dinero a retirar es {total_dinero}"
    Si aplica penalidad:
        "*El valor de la penalidad es de {valor_penalidad}
        *El total del dinero a retirar es {total_dinero}"

'''

def cdt (dinero, tiempo, porcentaje_interes):
    if tiempo <= 2:
        valor_penalidad = dinero * 0.02
        total_dinero = dinero - valor_penalidad
        msg = f"*El valor del interés es de {valor_penalidad} \n*El total del dinero a retirar es {total_dinero}"
    else:
        valor_interes = dinero * porcentaje_interes * tiempo /12
        total_dinero = dinero + valor_interes
        msg = f"*El valor del interés es de {valor_interes} \n*El total del dinero a retirar es {total_dinero}"
    return msg
print(cdt(10000, 3, 0.02))