#def -> Palabra reservada para crear funciones

#función sin parámetros
def saludar():
    mensaje = "Hola mundo dentro de una funcion"
    print(mensaje)
    
saludar()

'''
Estructura de una funcion:

def nombre de la funcion:
    mi codigo
    return (opcional)
'''

#Función sin parámetros y con retorno
def sumar():
    num_1 = 10
    num_2 = 20
    return num_1 + num_2

resultado = sumar()
resultado += 10

print(resultado)

print(sumar())

#Funciones con parámetros
def sumar_con_parametros(num_1: float, num_2: float):
    sum=num_1 + num_2
    return sum

resp= sumar_con_parametros(10, 11.25)
print(resp)

def saludar_usuario(nombre: str):
    return "Hola {nombre} nos alegra que nos visites"

print(saludar_usuario('ana'))