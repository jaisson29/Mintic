def cliente(informacion: dict)-> dict:
    primer_ingreso = informacion['primer_ingreso']
    edad = informacion['edad']
    atraccion = 'N/A'
    total_boleta = 'N/A'
    apto = False
    if edad > 18:
        apto = True
        atraccion = 'X-Treme'
        valor_boleta = 20000
        total_boleta = valor_boleta
        if primer_ingreso:
            valor_boleta -= valor_boleta*0.05
            total_boleta = valor_boleta
    elif edad >=15:
        apto = True
        atraccion = 'Carros chocones'
        valor_boleta = 5000
        total_boleta = valor_boleta
        if primer_ingreso:
            valor_boleta -= valor_boleta*0.07
            total_boleta = valor_boleta
    elif edad >=7:
        apto = True
        atraccion = 'Sillas voladoras'
        valor_boleta = 10000
        total_boleta = valor_boleta
        if primer_ingreso:
            valor_boleta -= valor_boleta*0.05
            total_boleta = valor_boleta
    return {
        'nombre': informacion['nombre'],
        'edad': informacion['edad'],
        'atraccion': atraccion,
        'apto': apto,
        'primer_ingreso': primer_ingreso,
        'total_boleta': total_boleta
    }
