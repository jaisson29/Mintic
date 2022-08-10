import pandas as pd

guion = lambda:print('-----------------------------------------------------------------------------')

try:
    #Lectura archivo csv y retorno de dataframe
    movies = pd.read_csv('introduccion/pandas/movies.csv')
    #Consultar la informacion basica del staframe
    print( movies.info())
    guion()
    print( movies.describe())
    title = movies['Title']
    print( title.tail() )
    guion()
    print( title.sample(10) )
    #Crear subdataframe
    subDataFrame = movies.loc[:,['Title', 'Genres','Duration', 'Facebook Likes - Director', 'Facebook likes - Movie']]
    #print( subDataFrame)
    pelis_menor_100 = subDataFrame[ subDataFrame['Duration'] < 100 ]
    print( pelis_menor_100)

    subDataFrame['Total likes'] = subDataFrame['Facebook Likes - Director'] + subDataFrame['Facebook likes - Movie']
    print( subDataFrame.describe())

    guion()
    pelis_populares = subDataFrame[ subDataFrame['Total likes'] > 30000]
    print(pelis_populares)
except:
    print('Error al cargar los datos')

