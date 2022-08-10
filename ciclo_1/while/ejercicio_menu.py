#input -> retorna por defecto un string
#nombre = input('Por favor ingrese su nombre: ')
'''
Convertir/castear un tipo de dato
int(miVariable) -> retorna un entero
float(miVariable) -> retorna un flotante
str(miVariable) -> retorna un string
'''

#print(f"Su nombre es: {nombre}")


menu = "-----------------CALCULADORA------------\n"
menu += "1) Sumar\n"
menu += "2) Restar\n"
menu += "3) Salir\n"
menu +=">> "

opcion = ''
while opcion != 3:
    #Solicitar la opción al usuario
    opcion = int(input(menu))
    if opcion == 1:
        num_1 = float(input("Ingrese el primer número: "))
        num_2 = float(input("Ingrese otro número: "))
        suma = num_1 + num_2
        print(f"----La suma es:------\n\t{suma}\n-----------------------\n")
    elif opcion == 2:
        num_1 = float(input("Ingrese el primer número: "))
        num_2 = float(input("Ingrese otro número: "))
        resta = num_1 - num_2
        print(f"----La resta es:------\n\t{resta}\n-----------------------\n")
    elif opcion != 3:
        print("Ingrese una opción válida")
