import numpy as np
from numpy import random as r


def crear_baraja(valor_cartas):
    corazones = ['♥︎' for _ in valor_cartas ]
    trebol = ['♣︎' for _ in valor_cartas ]
    diamantes = ['♦︎' for _ in valor_cartas ]
    picas = ['♠︎' for _ in valor_cartas ]
    #Emparejar
    #corazones = list( zip(valor_cartas, list(lambda _: 'Corazones', valor_cartas)) )
    corazones = list( zip(valor_cartas, corazones) )
    trebol = list( zip(valor_cartas, trebol) )
    diamantes = list( zip(valor_cartas, diamantes) )
    picas = list( zip(valor_cartas, picas) )
    #Unificar las listas (concatenar)
    cartas = corazones + trebol + diamantes + picas
    #barajar las cartas
    r.shuffle(cartas)
    return cartas


def repartir_cartas(cartas: list):
    #Sacar dos cartas de la baraja
    carta_1 = cartas.pop()
    carta_2 = cartas.pop()
    return carta_1, carta_2

def poner_en_mesa(cartas: list):
    #sacar cartas
    carta_1 = cartas.pop()
    carta_2 = cartas.pop()
    carta_3 = cartas.pop()

    return carta_1, carta_2, carta_3

def pedir_carta(cartas):
    #Barajar cartas
    r.shuffle(cartas)
    return cartas.pop()

def mostrar_cartas_usuario(misCartas):
    print('----------------MIS CARTAS-------------')
    for carta in misCartas:
        print(f'{carta[0]}{carta[1]}')

'''
Si es mayor a 21 retorna Falso sino retorna Verdad
'''
def validar_21(cartas_jugador)->bool:
    sumatoria = 0
    cant_cartas_a = 0
    for carta in cartas_jugador:
        valor = carta[0]
        if valor.lower() == 'a':
            cant_cartas_a += 1
        elif valor.lower() == 'j' or valor.lower() == 'q' or valor.lower() == 'k':
            sumatoria += 10
        else:
            sumatoria += int(valor)
    
    if cant_cartas_a >= 1:
        if sumatoria <= 10:
            sumatoria += cant_cartas_a * 10
        else:
            sumatoria += cant_cartas_a
    
    return (sumatoria <= 21)

def pedir_carta_both():
    pass

def obtener_ganador():
    pass

def obtener_ranking():
    pass

def dinero_ganado(apuesta: float):
    print('💵💵💵💵💵💵💵💵💵💵💵💵 DINERO GANADO 💵💵💵💵💵💵💵💵💵💵💵💵')
    print(f'\t💵💵💵💵 ${apuesta} 💵💵💵💵')
    print('💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵')

def jugar():
    print('------------\nPOKER\n---------------')
    valor_cartas = ['A','2','3','4','5','6','7','8','9','10','J','Q','K']
    cartas = crear_baraja(valor_cartas)
    #Solicitar la cantidad de jugadores
    num_jugadores = int( input('Por favor ingrese el número de jugadores: ') )
    if num_jugadores >= 2:
        #Solicitar el valor de la apuesta
        apuesta = float( input('Valor de la apuesta: ') )
        apuesta *= num_jugadores
        #Cartas del usuario
        misCartas = list(repartir_cartas(cartas))
        #Diccionario que representa los jugadores
        jugadores_both = {}
        #repartir cartas a todos los jugadores
        for n in range(num_jugadores-1):
            jugadores_both[f'jugador_{n+1}'] = list(repartir_cartas(cartas))
        
        #Mostrar las cartas del usuario
        mostrar_cartas_usuario(misCartas)
        nueva_apuesta = input('Desea realizar nueva apuesta: S/N >> ') 
        while nueva_apuesta.lower() != 'n':
            valor_apuesta = float( input('Valor de la apuesta: ') )
            apuesta += valor_apuesta * num_jugadores
            print(f'------------Apuesta acumulada: {apuesta}----------')
            #Condicional para que el usuario pida una carta
            nc = input('¿Desea pedir una carta? S/N >> ')
            if nc.lower() == 's':
                nv_carta = pedir_carta(cartas)
                print(f'------------Nueva Carta: {nv_carta[0]}{nv_carta[1]}---------')
                misCartas.append( nv_carta )
                mostrar_cartas_usuario(misCartas)
            #Validar que el usuario no se pase de 21
            if validar_21(misCartas):
                nueva_apuesta =  input('Desea realizar nueva apuesta: S/N >> ') 
            else:
                nueva_apuesta = 'N'
        
        if not validar_21(misCartas):
            print('---------------PERDISTE-------------')
        mostrar_cartas_usuario(misCartas)
    else:
        print('\nMínimo son 2 jugadores\n')
    


jugar()

'''
Cantidad de Jugadores: __
Cada jugador setará representado por una lista
*Apostar
'''
