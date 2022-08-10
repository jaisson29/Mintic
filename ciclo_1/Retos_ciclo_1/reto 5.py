'''
Contruir un subdataframe con las columnas:✔️
*Country ✔️
*Language ✔️
*Gross Earnings ✔️

Crear tabla dinámina utilizando como indice: ✔️
*Country ✔️
*Language ✔️

La función solo debe retornar 10 registros ✔️
'''
import pandas as pd
# ruta file csv
rutaFileCsv = 'https://github.com/luisguillermomolero/MisionTIC2022_2/blob/master/Modulo1_Python_MisionTIC2022_Main/Semana_5/Reto/movies.csv'


def listaPeliculas(rutaFileCsv: str) -> str:
    respuesta = ''
    #Validar que la ruta del archivo termine en csv
    lista_cadenas = rutaFileCsv.split('.')
    if lista_cadenas[-1].lower() == 'csv':
        try:
            #Cargar los datos
            movies = pd.read_csv(rutaFileCsv)
            #Contruir subDataframe
            subDataframe = movies.loc[ : ,  ['Country','Language','Gross Earnings']]
            #Construir tabla dinámica
            tabla = pd.pivot_table(subDataframe, index=['Country','Language'])
            respuesta = tabla.head(10)
        except:
            respuesta = 'Error al leer el archivo de datos.'
    else:
        respuesta = 'Extensión inválida.'
    
    return print(respuesta)

listaPeliculas(rutaFileCsv)


def listaPeliculas(rutaFileCsv: str) -> str:
    if rutaFileCsv.split('.')[-1] != 'csv':
        try:
            csv = pd.read_csv(rutaFileCsv)
            subGrupoPeliculas = csv[['Country', 'Language', 'Gross Earnings']]
            gananciaPaisLenguaje = subGrupoPeliculas.pivot_table(
                index=['Country', 'Language'])
            return gananciaPaisLenguaje.head(10)

        except:
            print('Error al leer el archivo de datos.')
    else:
        print('Extensión inválida.')
    return
print(listaPeliculas(rutaFileCsv))