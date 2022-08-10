#Booleanos
p = True
q = False
#Indica el tipo de dato
r: bool = True

if q and p:
    print('Es verdad')
else:
    print('Es falso')
    
if q or p:
    print('Or -> Verdad')
else:
    print('Or -> Falso')
    
if not not p:
    print('Cumple')
else:
    print('No cumple')
    
if not p and q or r and p:
    print("p and q or r and p -> Es verdad")
else:
    print("p and q or r and p -> Es Falso")


num_1 = 100
num_2 = 200
num_3 = 150

if num_1 >= num_2:
    print("es mayor o igual")
elif num_1 < num_3:
    print("num_1 es menor a num_3")
else:
    print("No cumple ninguna condicion")

opcion = 's'

if opcion == 's':
    print("opcion es 's'")
else:
    print("opcion es diferente de 's'")    

if opcion != "s":
    print("opcion es diferente a 's'")
else:
    print("opcion es igual a 's'")  
    
    
    
    
    
    
    