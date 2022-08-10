
saludo = "Hola"
print(saludo)

print('---------TAMAÑO--------')
tamanio = len(saludo)
print(tamanio)

print('---------ACCEDER A CARACTERES--------')
c1 = saludo[0]
print(c1)
c2 = saludo[tamanio-1]
print(c2)

print('---------INMUTABLE--------')
#No es permitido hacer esto:
#saludo[0] = 'R'

fruta = 'Fresa'

print('---------Rebanado--------')
print( fruta[-1:-4] )
