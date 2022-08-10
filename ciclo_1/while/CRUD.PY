'''
usuarios = {
    'andres@gmail.com': {
        'nombre': 'andres',
        'apellido': 'quintero',
        'password': '1234567'
    }
}
1) Crear usuario
2) Consultar un usuario por su correo
3) Actualizar usuario
4) Consultar todos los usuarios
5) Eliminar usuario por correo
6) Eliminar todos los usuarios
7) Salir
'''


def crear_usuario(usuarios: dict):
    # Solicitar datos al usuario
    email = input('Email: ')
    nombre = input('Nombre: ')
    apellido = input('Apellido: ')
    password = input('Password: ')
    # Añadir los datos al diccionario
    usuarios[email] = {
        'nombre': nombre,
        'apellido': apellido,
        'password': password
    }
    print('\nUsuario creado con éxito\n')


def consultar_por_correo(usuarios: dict):
    email = input('Ingrese el email del usuario a consultar: ')
    # Evaluar si el usuario existe
    if email in usuarios:
        # Obtener la información del usuario
        info = usuarios[email]
        # Mostrar la información del usuario
        nombre = info['nombre']
        apellido = info['apellido']
        print(f'------------------{email}--------------------------\n')
        print(f'Nombre: {nombre}')
        print(f'Apellido: {apellido}')
    else:
        print('El usuario no existe en la base de datos')

def actualizar_usuario(usuarios: dict):
    print('------------ACTUALIZAR USUARIO-------------\n')
    email = input('Ingrese el email del usuario: ')
    #Validar si email existe en el diccionario
    if email in usuarios:
        #Solicitar al usuario la contraseña
        password = input('Ingrese la contraseña: ')
        usuario = usuarios[email]
        usuPassword = usuario['password']
        if password == usuPassword:
            nombre = input('Nuevo nombre: ')
            apellido = input('Nuevo apellido: ')
            usuarios[email]['nombre'] = nombre
            usuarios[email]['apellido'] = apellido
        else:
            print('Contraseña incorrecta')
    else:
        print(f'\nEl email {email} no existe en la base de datos\n')

def consultar_todos_usuarios(usuarios: dict):
    for email, info in usuarios.items():
        nombre = info['nombre']
        apellido = info['apellido']
        print('--------------------------------')
        print(f'Email: {email}')
        print(f'Nombre: {nombre}')
        print(f'Apellido: {apellido}')
        print('--------------------------------')
    print('\n')

def eliminar_usuario(usuarios: dict):
    print('----------------ELIMINAR USUARIO----------------')
    email = input('Email del usuario: ')
    #Validar si existe el email
    if email in usuarios:
        password = input('Password: ')
        #Validar el password
        if password == usuarios[email]['password']:
            usuarios.pop(email)
            print('\n¡Usuario eliminado con éxito!\n')
        else:
            print('\nContraseña incorrecta\n')
    else:
        print(f'\nEl email {email} no existe en la base de datos\n')

'''
--------------------------------
email: andres@gmail.com
nombre: '',
apellido: ''
--------------------------------
'''

def menu():
    # Diccionario que almacena a todos los usuarios
    usuarios: dict = {}
    # Variable que representa la estructura del menú que se muestra en consola
    mensaje_menu = "----------------------CRUD USUARIOS---------------------\n"
    mensaje_menu += "1) Crear usuario\n"
    mensaje_menu += "2) Consultar un usuario por su correo\n"
    mensaje_menu += "3) Actualizar usuario\n"
    mensaje_menu += "4) Consultar todos los usuarios\n"
    mensaje_menu += "5) Eliminar usuario por correo\n"
    mensaje_menu += "6) Eliminar todos los usuarios\n"
    mensaje_menu += "7) Salir\n"
    mensaje_menu += ">>> "

    opcion = ''
    while opcion != 7:
        # Obtener la opción que ingrese el usuario
        opcion = int(input(mensaje_menu))
        # Evaluar la opción
        if opcion == 1:
            crear_usuario(usuarios)
        elif opcion == 2:
            consultar_por_correo(usuarios)
        elif opcion == 3:
            actualizar_usuario(usuarios)
        elif opcion == 4:
            consultar_todos_usuarios(usuarios)
        elif opcion == 5:
            eliminar_usuario(usuarios)
        elif opcion == 6:
            usuarios.clear()
            print('\nTodos los usuarios han sido eliminados con éxito\n')
        elif opcion != 7:
            print('Por favor ingrese una opción válida')


menu()

