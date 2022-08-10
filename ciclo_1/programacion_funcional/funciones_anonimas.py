
def sumar (n1,n2):
    return n1+n2

funcion_anonima = lambda : 'Hola mundo desde lambda'
#print(funcion_anonima())

suma_lambda = lambda  n1,n2: n1+n2
#print(suma_lambda(20,10))

def fabricar_funcion(operador: str):
    #inicializar la 'operacion' con una funcion por defecto
    operacion = lambda n1,n2 : f'No existe operacion para {n1} {operador} {n2} '
    #Evaluar operador
    if operador == '+': operacion = lambda n1,n2: n1+n2
    elif operador == '-': operacion = lambda n1,n2: n1-n2
    elif operador == '*': operacion = lambda n1,n2: n1*n2
    elif operador == '%': operacion = lambda n1,n2: n1/n2
    elif operador == '**': operacion = lambda n1,n2: n1**n2
    
    return operacion

operacion = fabricar_funcion('+')
print(operacion(10,2))