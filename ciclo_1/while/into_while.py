
contador = 0

while contador < 10000:
    print('contador-> ', contador)
    contador += 1

print('------------------')


contador = 0
while True:
    print(contador)
    contador += 1
    if contador == 10000:
        #break -> rompe el ciclo
        break
