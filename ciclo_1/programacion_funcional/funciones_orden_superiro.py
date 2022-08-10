def fabricar_operacion(operador):
    respuesta = ''
    if operador == '+':
        def sumar(n1, n2):
            return n1+n2
        respuesta = sumar
    elif operador == '-':
        def restar(n1,n2):
            return n1-n2
        respuesta = restar
    return respuesta


def funcion_orden_superior(funcion):
    resultado = funcion(10, 20)
    print('El resultado es -> ', resultado)

operacion = fabricar_operacion('-')
funcion_orden_superior(operacion)
