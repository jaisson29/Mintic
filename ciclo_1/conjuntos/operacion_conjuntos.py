conjunto_a = {10,20,30,40,50,60,70,80,90}
conjunto_b = {10,15,20,25,30,35,45,55,65,76,86,96}

print('----------A intersection B----------')
interseccion_a_b = conjunto_a.intersection(conjunto_b)
print(interseccion_a_b)

print('----------B diference A----------')
diference_b_a = conjunto_b - conjunto_a#conjunto_b.difference(conjunto_a)
print(diference_b_a)

print('----------A diference B----------')
diference_a_b = conjunto_a.difference(conjunto_b)
print(diference_a_b)

print('----------A intersection update B----------')
print('datos conjunto a-> ', conjunto_a)
#conjunto_a.intersection_update(conjunto_b)
print('datos conjunto a-> ', conjunto_a)

print('----------A diference update B----------')
print(conjunto_a)
conjunto_a.difference_update(conjunto_b)
print(conjunto_a)

print('----------UNION--------')
union = conjunto_a.union(conjunto_b)
print(union)

