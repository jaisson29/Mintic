'''
------------------ESTRUCTURA DE DATOS-----------------

propietarios = {
    '123456': {
        'nombre': '',
        'apellido': '',
        'telefono': '',
        'email': '',
        'vehiculos': ['RJH-224']
    }
}
Donde 123456 es la cédula del propietario y 'RJH-224' es la placa del vehículo
vehiculos = {
    'RJH-224': {
        'modelo': 2015,
        'color': '',
        'marca': '',
        'tipo_vehiculo': ''
    }
}

garantias = {
    ('RJH-224','123456'): {
        'tipo_reparacion': ''
    }
}
'''
import json

mostrar_titulo = lambda titulo: print(f'-----------------------{titulo.upper()}-----------------------')
mostrar_mensaje = lambda mensaje: print(f'------------------------------------------------------\n\t{mensaje}\n------------------------------------------------------')
_PROPIETARIOS = "propietarios"
_VEHICULOS = "vehiculos"
_GARANTIAS = "garantias"

def guardar_datos(diccionario: dict, nombre_archivo: str):
    ruta = f'introduccion/CRUD_persistencia_datos/base_de_datos/{nombre_archivo}.json'
    with open(ruta, 'w') as archivo:
        json.dump(diccionario, archivo)

def cargar_datos(nombre_archivo: str):
    ruta = f'introduccion/CRUD_persistencia_datos/base_de_datos/{nombre_archivo}.json'
    datos = dict()
    try:
        with open(ruta) as archivo:
            datos = json.load(archivo)
    except:
        datos = {}
    return datos

'''
-----FUNCIONES ENCARGADAS DE MANIPULAR LA INFORMACIÓN DEL PROPIETARIO-------
'''

#Función para registrar un propietario
def registrar_propietario(propietarios: dict):
    mostrar_titulo('registrar propietario')
    existe,cedula = validar_propietario(propietarios)
    if not existe:
        propietarios[cedula] = {
            'nombre': input('Nombre: '),
            'apellido': input('Apellido: '),
            'telefono': input('Teléfono: '),
            'email': input('Email: '),
            'vehiculos': []
        }
        nombre = propietarios[cedula]['nombre']
        guardar_datos(propietarios, _PROPIETARIOS)
        mostrar_mensaje('Propietario creado con éxito')
        #Preguntar al usuario si desea registrar vehículos
        resp = input(f'¿Desea registrarle vehículos al propietario {nombre}? S/N >> ')
        if resp.lower() == 's':
            registrar_vehiculos(cedula)
        print('\n\n')

#Valida la existencia de un propietario en la "base de datos"(diccionario)
def validar_propietario(propietarios: dict):
    cedula = input('Ingrese la cédula: ')
    existe = False
    if cedula in propietarios:
        existe = True
    return (existe, cedula)

def actualizar_propietario(propietarios: dict):
    mostrar_titulo('actualizar propietario')
    existe,cedula = validar_propietario(propietarios)
    if existe:
        propietarios[cedula]['nombre'] = input('Nombre: ')
        propietarios[cedula]['apellido'] = input('Apellido: ')
        propietarios[cedula]['telefono'] = input('Teléfono: ')
        propietarios[cedula]['email'] = input('Email: ')
        
        guardar_datos(propietarios, _PROPIETARIOS)
        mostrar_mensaje('información actualizada con éxito')
    else:
        mostrar_mensaje(f'El propietario con cédula {cedula} no existe')

def consultar_propietario(propietarios):
    mostrar_titulo('consultar propietario')
    existe,cedula = validar_propietario(propietarios)
    if existe:
        nombre = propietarios[cedula]['nombre']
        apellido = propietarios[cedula]['apellido']
        placas = propietarios[cedula]['vehiculos']
        #capturar la info restante
        vehiculos = cargar_datos(_VEHICULOS)
        info = '-------------------------------------------------\n'
        info += f'Nombre: {nombre}\n'
        info += f'Apellido: {apellido}\n'
        info += 'Vehículos: \n'
        #Iterar vehiculos
        for p in placas:
            vehiculo = vehiculos[p]
            color = vehiculo['color']
            modelo = vehiculo['modelo']
            info += f'Placa: {p}\n'
            info += f'Color: {color}\n'
            info += f'Modelo: {modelo}\n'
        info += '-------------------------------------------------\n'
    else:
        mostrar_mensaje(f'El propietario con cédula {cedula} no existe')

'''
-----FUNCIONES ENCARGADAS DE MANIPULAR LA INFORMACIÓN DEL VEHÍCULO-------
'''

def registrar_vehiculos(cedula: str = '', vehiculos: dict = None):
    mostrar_titulo('registrar vehiculos')
    if vehiculos == None:
        vehiculos = cargar_datos(_VEHICULOS)
    if cedula == '':
        cedula = input('Cédula del propietario: ')
    #Cargar propietarios y validar que exista la cédula
    propietarios = cargar_datos(_PROPIETARIOS)
    if cedula in propietarios:
        opc = 's'
        placas = []
        while opc.lower() == 's': 
            existe,placa = validar_vehiculo(vehiculos)
            if not existe:
                vehiculos[placa]={
                    'modelo': input('Modelo: '),
                    'color': input('Color: '),
                    'marca': input('Marca: '),
                    'tipo_vehiculo': input('Tipo vehículo: ')
                }
                #Guardar la info en el fichero vehiculos.json
                guardar_datos(vehiculos, _VEHICULOS)
                placas.append(placa)
                mostrar_mensaje('Vehículo registrado con éxito')
            else:
                print(f'\nEl vehículo con placas {placa} ya se encuentra registrado en la base de datos\n')
            #Preguntar si desea registrar mas vehículos
            opc = input('¿Desea registrar mas vehículos? S/N >> ')
        #Asignarle las placas al propietario
        propietarios[cedula]['vehiculos'] = propietarios[cedula]['vehiculos'] + placas
        guardar_datos(propietarios, _PROPIETARIOS)
    else:
        print(f'\nEl propietario con cédula {cedula} no se encuentró en la base de datos\n')

#Valida la existencia de un vehículo en la "base de datos"(diccionario)
def validar_vehiculo(vehiculos: dict):
    placa = input('Ingrese placa del vehículo: ').upper()
    existe = False
    if placa in vehiculos:
        existe = True
    return (existe, placa)

def actualizar_vehiculo(vehiculos: dict):
    mostrar_titulo('actualizar vehículo')
    existe,placa = validar_vehiculo(vehiculos)
    if existe:
        vehiculos[placa]['modelo'] = input('Modelo: ')
        vehiculos[placa]['color'] = input('Color: ')
        vehiculos[placa]['marca'] = input('Marca: ')
        vehiculos[placa]['tipo_vehiculo'] = input('Tipo vehículo: ')
        
        guardar_datos(vehiculos, _VEHICULOS)
        mostrar_mensaje('información actualizada con éxito')
    else:
        mostrar_mensaje(f'El vehículo con placa {placa} no existe')

#Función principal
def menu():
    #Diccionarios para almacenar toda la información correspondiente al software
    propietarios = cargar_datos(_PROPIETARIOS)
    vehiculos = cargar_datos(_VEHICULOS)
    garantias = cargar_datos(_GARANTIAS)
    #Variable que representa la descripción del menú
    mensaje_menu = '------------------🚖🚘🚖🚘GARANTÍA VEHÍCULOS🚘🚖🚘🚖-------------\n'
    mensaje_menu += '1) Registrar propietario\n'
    mensaje_menu += '2) Registrar vehículo\n'
    mensaje_menu += '3) Actualizar info propietario\n'
    mensaje_menu += '4) Actualizar info vehiculo\n'
    mensaje_menu += '5) Visualizar info propietarios\n'
    mensaje_menu += '6) Consultar propietario\n'
    mensaje_menu += '7) Consultar vehículo\n'
    mensaje_menu += '8) Visualizar vehículos\n'
    mensaje_menu += '9) Eliminar vehículo\n'
    mensaje_menu += '10) Eliminar propietario\n'
    mensaje_menu += '-1) Salir\n'
    mensaje_menu += '>>> '

    opcion = 0
    #Repetir hasta que el usuario desee salir
    while opcion != -1:
        #Manejador de excepciones
        try:
            #Solicitar una opción al usuario
            opcion = int( input(mensaje_menu) )
            #Evaluar la opción ingresada por el usuario
            if opcion == 1:
                registrar_propietario(propietarios)
            elif opcion == 2:
                registrar_vehiculos(vehiculos=vehiculos)
            elif opcion == 3:
                actualizar_propietario(propietarios)
            elif opcion == 4:
                actualizar_vehiculo(vehiculos)
            elif opcion == 5:
                pass
            elif opcion == 6:
                consultar_propietario(propietarios)
        
        except:
            print('Ingrese un dato númerico')

menu()
