'''
✔️
Genera intereses
si tiempo > 2
valor_intereses = (cantidad * porcentaje_interes * tiempo) / 12
porcentaje_interes = 0.03
valor_total = valor_intereses + cantidad

------
✔️
Genera pérdidas
si tiempo <= 2
valor_perder = cantidad * porcentaje_perder
porcentaje_perder = 0.02
valor_total = cantidad - valor_perder

-------
✔️
Parámetros que debe recibir la función:
* usuario: str (String)
* capital: int
* tiempo: int
✔️
La función debe RETORNAR un String.

Formato del string a retornar para el caso de las ganancias:
Para el usuario {} La cantidad de dinero a recibir, según el monto inicial {} para un tiempo de {} meses es: {}

Para el caso de las pérdidas:
Para el usuario {} La cantidad de dinero a recibir, según el monto inicial {} para un tiempo de {} meses es: {}

'''

def CDT(usuario: str, capital: int, tiempo: int):
    mensaje = ""
    #Genera intereses
    if tiempo > 2:
        porcentaje_interes = 0.03
        valor_intereses = (capital * porcentaje_interes * tiempo) / 12
        valor_total = valor_intereses + capital
        mensaje = f"Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {valor_total}"
    else:#Genera pérdidas
        porcentaje_perder = 0.02
        valor_perder = capital * porcentaje_perder
        #Aquí calcular el valor total
        #...
        mensaje = f"Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {valor_total}"

    return mensaje

#ALERTA
#ÚNICAMENTE PARA TESTEAR EN NUESTRAS MÁQUINAS
#NO SUBIR A LA PLATAFORMA
print( CDT('ABC123', 1000000, 3) )
