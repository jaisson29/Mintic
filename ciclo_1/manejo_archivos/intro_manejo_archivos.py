
import json

persona = {}
def abrir_archivo(ruta: str):
    cadena: list = ruta.split('.')
    if cadena[1].lower() == 'json':
        try:
            #Referenciar el fichero
            with open(ruta) as archivo:
                #Cargar los datos del archivo json 
                persona = json.load(archivo)
                print(persona)
        except:
            print("Error al cargar los datos")
    else:
        print("Extension invalida")
        
abrir_archivo('persona.json')


#Referenciar el fichero
""" with open('introduccion/manejo_archivos/personas.json','w') as archivo:
    #Escribir/crear el fichero
    json.dump(persona, archivo) """