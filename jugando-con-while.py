# """
# Estás organizando una fiesta de Halloween y quieres calcular cuántos dulces necesitas comprar
# para los niños que vendrán a tu casa.

# Cada niño podrá llevarse 5 dulces y esperas la llegada de un máximo de 20 niños (si vienen más
# de 20 niños ponemos un cartel en la puerta que ponga: ¡No podemos comprar tantos dulces!)
# [Crea variables para almacenar estas cantidades]

# Crea un programa que solicite el número de niños que asistirán y calcula la cantidad total de 
# dulces que necesitas comprar. 
# [El cálculo se realizará en una función]

# Si vienen más de 20 niños 

import random

#funciones

def cantidadDulces():
    numeroNiños = int(input("¿Cuántos niños vienen?: ")) #cuidado con la ñ
    numeroDulces = numeroNiños*5
    if numeroNiños >20:
        print("¡No podemos comprar tantos dulces!")
    
    elif numeroNiños >0 and numeroNiños <=20:
        return (f"Necesitamos comprar {numeroDulces} dulces")
    
    else:
        print("¿Qué valor es ese? :v")

print (cantidadDulces())

# Utilizando random.choice

# numeroNiños = random.randrage(numeroMaxNiños)
#numeroMaxNiños = 50
# numeroDulces = 500
# numeroMaxDulces = 5

"CASO 1: Tenemos 500 dulces y vamos a repartirlos"
# esDulce = True
# while (esDulce): (es una variable que siempre se va a cumplir)
#     print("Mhmmmmm")
# para salir de un while(true) hacemos ctrl+c

# while numeroDulces>0:
#     print(f"¡Hola ente! ¡Cuántos caramelos quieres?")
#     numDulcesNiño = random.randrange(numeroMaxDulces+1) (+1 porque empieza desde 0)
#     print (f"¡Quiero {numDulcesNiño} dulces!")
#     numeroNiños = numeroNiños + 1 
#     numeroNiños += 1
#     numDulces = numDulces - numDulcesNiño
#     numDulces -= numDulcesNiño
#print(f"Nos han visitado {numNiños} y nos quedan {numDulces} dulces")