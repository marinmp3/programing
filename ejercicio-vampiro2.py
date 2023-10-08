# """

# Eres un vampiro con más de 1000 años pero una despensa de tamaño limitado compuesta por botes 
# de 3 y 5 litros.
# Necesitas mantener al día tus depósitos de sangre y para eso llevas un control exhaustivo de 
# los botes que tienes vacíos de cada tipo de cada tipo.
# ¿Lo malo? Que cuando vas a robar sangre solo puedes hacerlo en garrafas de 7 litros...

# Crea un programa que solicite el número de botes que tienes vacíos y cuántas garrafas has comprado
# y una función que devuelva True o False dependiendo de si te has pasado o no comprando garrafas.

# Empezando a rellenar por los botes de 5 litros debes calcular: 
# - Si no te has pasado comprando: 
#     - ¿Cuántos botes de 5 litros (de los que tenías vacíos has rellenado)?
#     - ¿Cuántos botes de 3 litros (de los que tenías vacíos has rellenado)?
#     - Si algún bote se ha quedado a medias, cuántos litros le faltan.
# - Si te has pasado comprando:
#     - ¿Cuántos litros han sobrado?

# [NOTA: Para hacer una división exacta (quedándonos solo con el cociente) se usa // en vez de /]
# """

def mePasé():
    capacidadBotes = botesVacios*8
    capacidadGarrafas = numeroGarrafas*7
    mePasé=(capacidadGarrafas>capacidadBotes)
    if capacidadGarrafas<capacidadBotes:
        mePasé=False
        return mePasé
    
def ejercicioVampiro2(capacidadBotes,capacidadGarrafas):
    if mePasé==False:
        botes5Litros = capacidadBotes/5
        botes3Litros = capacidadBotes/3
        boteAMedias = capacidadGarrafas//capacidadBotes 
        return f"He rellenado {botes5Litros} botes de 5 litros, {botes3Litros} botes de 3 litros y me sobran {boteAMedias} litros"

    elif mePasé==True:
        litrosDeMas = capacidadBotes//capacidadGarrafas
        print (f"No tengo espacio para {litrosDeMas}")

botesVacios = int(input("¿Cúantos botes vacíos tengo?: "))
numeroGarrafas = int(input("¿Cúantas garrafas he comprado?: "))
# print (ejercicioVampiro2(mePasé)) ?
# print (mePasé()) ?
# print (ejercicioVampiro2(capacidadBotes="",capacidadGarrafas="")) ?


