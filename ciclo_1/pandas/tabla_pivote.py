from turtle import pd
import pandas as pd
import numpy as np

movies = pd.read_csv('introduccion/pandas/movies.csv')

#print( movies.info())

subDataframe = movies.loc[:, ['Director', 'Gross Earnings', 'Facebook likes - Movie', 'User Votes']]
#print( subDataframe)
#print(tabla_dinamica)
#Por defecto aplica la media
#tabla_dinamica = pd.pivot_table(subDataframe, index=['Director'])
tabla_dinamica = pd.pivot_table(subDataframe, index=['Director'], aggfunc=[np.size])
print(tabla_dinamica.head(10))