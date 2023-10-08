# """
# Eres un vampiro con más de 1000 años pero tienes una despensa de tamaño limitado compuesta por botes 
# de 3 y 5 litros.
# Necesitas mantener al día tus depósitos de sangre y para eso llevas un control exhaustivo de 
# los botes que tienes vacíos de cada tipo.
# ¿Lo malo? Que cuando vas a robar sangre solo puedes hacerlo en garrafas de 7 litros...

# Crea un programa que solicite el número de botes que tienes vacíos y cuántas garrafas has comprado
# y una función que devuelva True o False dependiendo de si te has pasado o no comprando garrafas.

def mePasé():
    capacidadBotes = botesVacios*8
    capacidadGarrafas = numeroGarrafas*7
    mePasé=(capacidadGarrafas>capacidadBotes)
    if capacidadGarrafas<capacidadBotes:
        mePasé=False
        return mePasé
      
botesVacios = int(input("¿Cúantos botes vacíos tengo?: "))
numeroGarrafas = int(input("¿Cúantas garrafas he comprado?: "))
print(mePasé())