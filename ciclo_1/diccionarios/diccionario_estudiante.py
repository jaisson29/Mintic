estudiante_1 = {
    'nombre': 'Bladimir',
    'apellido': 'Diuche',
    'edad': 25,
    'activo': False
}
print(estudiante_1)

#Obtener el tamaño/cantidad de elementos de llaves/claves
#len(diccionario)
tamanio = len(estudiante_1)
print("Tamaño diccionario -> ", tamanio)

#Actualizar valor de un diccionario
estudiante_1['activo'] = True
print(estudiante_1)

#Añadir elementos a un diccionario
estudiante_1['promedio_notas'] = 4.2
print(estudiante_1)

tamanio = len(estudiante_1)
print("Tamaño final -> ", tamanio)

""" 
x = estudiante_1['nombre']
print(x)

edad = estudiante_1['edad']
print(edad) """

#Eliminar un item
estudiante_1.pop('promedio_notas')
print(estudiante_1)
