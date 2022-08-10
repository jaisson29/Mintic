import pandas as pd

guion = (lambda: print('------------------------------------------------'))

#CREAR SERIE
miSerie = pd.Series( [10,20,30,40], index=['ene','feb','mar','abr'] )
print(miSerie)

guion()
#ACCEDER A LOS VALORES DE LA SERIE
print( miSerie[2] )
print( miSerie['mar'] )

guion()
#ACCEDER AL OBJETO QUE CONTIENE EL INDICE
print( miSerie.index )
guion()
miSerie.index = ['enero','febrero','marzo','abril']
print(miSerie.index)
print(miSerie)

guion()
#OBTENER EL TIPO DE DATO DE LA SERIE
print(miSerie.dtype)

miSerie.name = 'Ventas 2022'
miSerie.index.name = 'Meses'
print(miSerie)

guion()
print(miSerie.axes)

#ACCEDER A LAS DIMENSIONES DE LA SERIE/DATAFRAME
print( miSerie.shape )

guion()
#CREAR UN DATAFRAME
dict_ventas = {
    'frutas': [150, 80, 200, 10, 250, 200, 640, 300, 110, 60, 640, 980],
    'aseo': [300, 90, 120, 140, 450, 300, 610, 390, 180, 460, 840, 900]
}

data_ventas = pd.DataFrame( dict_ventas, index=['ene','feb','mar','abr','may','jun','jul','ago','sep','oct','nov','dic'] )
data_ventas.name = 'Ventas 2021'
data_ventas.index.name = 'Meses'
print(data_ventas)

guion()
print( data_ventas.index )
print( data_ventas.columns )

guion()
##ACCEDER A LAS DIMENSIONES
print( data_ventas.axes )
print( data_ventas.shape )

guion()
#ACCEDER A LOS VALORES
print( data_ventas.values )
guion()
print( data_ventas['frutas']['ene'] )

guion()
data_ventas['total_ventas'] = data_ventas.frutas + data_ventas.aseo
print(data_ventas)

guion()
print( data_ventas.info() )
guion()
print( data_ventas.describe() )

guion()
#ACCEDER A LOS PRIMEROS 5 REGISTROS
print( data_ventas.head() )
print( data_ventas.head(10) )
guion()
#ACCEDER A LOS ÚLTIMOS 5 REGISTROS
print( data_ventas.tail() )
