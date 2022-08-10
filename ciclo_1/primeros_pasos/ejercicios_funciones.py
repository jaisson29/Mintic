
'''
1)Desarrolle una función que reciba como parámetro el nombre del usuario y la ciudad. 
La función deberá retornar:
    -> Hola nombre_usuario nos alegra que nos visites desde nombre_ciudad
2) Desarrolle una función que calcule y retorne el promedio de 4 notas de un estudiante
3) Desarrolle una función que retorne los intereses a ganar de un CDT:
    FORMULA PARA CALCULAR LOS INTERESES: (cantidad_dinero * porcentaje_interes * tiempo) / 12
'''

#Solución punto 1
def info_ususario(nombre: str, ciudad: str):
    return f"Hola {nombre} nos alegra que nos visites desde {ciudad}"

print(info_ususario('jaisson', 'cajica'))

#Solución punto 2
def promedio(nota_1: float, nota_2: float, nota_3: float, nota_4: float):
    resultado = nota_1 + nota_2 + nota_3 + nota_4 / 4
    return resultado
print(promedio(1, 2, 3, 4))

#Solución punto 3
def CDT(cantidad_dinero: int, porcentaje_interes: int, tiempo: int):
    calculo = cantidad_dinero * porcentaje_interes * tiempo /12
    return calculo
print(CDT(10000, 0.03, 6)) 

#Operaciones básicas

def multiplicar(n1: float, n2: float, n3: float):
    mult = n1 * n2 * n3
    return mult

resp_1 = multiplicar(50, 20, 30) 
resp_2 = CDT(resp_1, 0.4, 8)
print(f"El valor del interés es de {resp_2}")

def operacion():
    mult = multiplicar(30, 40, 50)
    mult /= 2
    return mult

print( operacion() )
