def CDT(usuario: str, capital: int, periodo: int):
    cantidad=capital
    porcentaje_interes=0.03
    tiempo=periodo
    porcentaje_perder=0.02

    if periodo >= 3:
        valor_intereses = cantidad*porcentaje_interes*tiempo/12
        valor_total = valor_intereses+cantidad
        mensaje = "Para el usuario " + usuario + " La cantidad de dinero a recibir, según el monto inicial " +str(cantidad)+ " para un tiempo de " + str(tiempo) + " meses es: " + str(valor_total)
    else:
        valor_perder = cantidad*porcentaje_perder*tiempo
        valor_total = cantidad-valor_perder
        mensaje = "Para el usuario " + usuario + " La cantidad de dinero a recibir, según el monto inicial " +str(cantidad)+ " para un tiempo de " + str(tiempo) + " meses es: " + str(valor_total)
        
    return mensaje
print(CDT('juan', 10000, 3))


def CDT(usuario: str, capital: int, periodo: int):
    porcentaje_interes = 0.03
    porcentaje_perder = 0.02
    
    if periodo >= 3:
        valor_intereses = capital*porcentaje_interes*periodo/12
        valor_intereses += capital
        mensaje = "Para el usuario " + usuario + " La cantidad de dinero a recibir, según el monto inicial " +str(capital)+ " para un tiempo de " + str(periodo) + " meses es: " + str(valor_intereses)
    else:
        valor_perder = capital*porcentaje_perder*periodo
        valor_perder -= capital
        mensaje = "Para el usuario " + usuario + " La cantidad de dinero a recibir, según el monto inicial " +str(capital)+ " para un tiempo de " + str(periodo) + " meses es: " + str(valor_perder)
    return mensaje
print(CDT('juan', 10000, 3))