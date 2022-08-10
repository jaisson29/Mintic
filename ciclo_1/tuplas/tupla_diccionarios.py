
diccionario_1 = {
    'nombre': 'Juan',
}

diccionario_2 = {
    'nombre': 'Maria'
}

tupla = diccionario_1,diccionario_2
print(tupla)

dic_1, dic_2 = tupla
dic_1['apellido'] = 'quintana'
dic_2['apellido'] = 'Tolosa'
print(tupla)

print('------------------TUPLA DE LISTAS-------------------')
tupla_lista = ([], [])
print(tupla_lista)
l1, l2 = tupla_lista
l1.append(10)
l1.append(20)
l2.append(30)

print(tupla_lista)