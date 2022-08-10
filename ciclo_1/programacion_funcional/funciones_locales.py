def calcular_promedios(numeros: list):

    #Función local
    def obtener_suma(lista_numeros: list):
        suma = 0
        for n in lista_numeros:
            suma += n
        return suma
    
    promedio = obtener_suma(numeros) / len(numeros)

    return promedio

#print( calcular_promedios([4.2, 4.5, 3.9, 4.9, 3.1]) )


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

operacion = fabricar_operacion('+')
print( operacion(20,20) )
operacion = fabricar_operacion('-')
print( operacion(50,20) )
