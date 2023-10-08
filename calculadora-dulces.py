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

def cantidadDulces():
    numeroNiños = int(input("¿Cuántos niños vienen?: "))
    numeroNiños <=20
    if numeroNiños >20:
        print("¡No podemos comprar tantos dulces!")
    numeroDulces = numeroNiños*5
    return f"Necesitamos comprar {numeroDulces} dulces"

print (cantidadDulces())

    
