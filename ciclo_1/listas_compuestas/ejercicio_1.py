
abuelo = [
    [
        [100, 200, 300, 400],
        [400, 200, 800, 900]
    ],
    [
        [600, 300, 700, 250],
        [800, 100, 900, 900]
    ]
]

padre_1 = abuelo[0]
print(padre_1)
hijo_1 = padre_1[0]
print(hijo_1)
n1 = hijo_1[0]
print(n1)

n1 = abuelo[0][0][0]
print(n1)

print('---------------------\n')

#Recorrer lista 'abuelo'
for padre in abuelo:
    print(padre)
    for nieto in padre:
        print(nieto)
        for n in nieto:
            print(n)
