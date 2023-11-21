def realizarFuncion(seleccion):
    while seleccion.lower() == "dar de comer":
        print(comer(saciedadComer, felicidadComer=felicidad, numCacas=numCacas, introNombre=introNombre, iteracionComer=iteraciones))
        break
    while seleccion.lower() == f"jugar con {introNombre}":
        print(jugar(felicidadJugar=felicidad, saciedadJugar=saciedad, iteracionJugar=iteraciones, introNombre=introNombre, numCacas=numCacas))
        break
    while seleccion.lower() == "limpiar cacas":
        print(limpiarCaca(numCacas, iteraciones, felicidadCacas=felicidad))
        break
    # while seleccion.lower() == "ver info":
    #     print(verInfo())
    #     break
    # while seleccion.lower() == "curar":
    #     print(curar())
    #     break
    return seleccion

def comer(saciedadComer, felicidadComer, numCacas, introNombre, iteracionComer,salud):

    saciedad==saciedadComer
    felicidad==felicidadComer
    iteraciones==iteracionComer

    if numCacas > 0:
        return f"¡Limpia a {introNombre} antes de comer!"
    elif numCacas == 0:
        if saciedadComer == 4:
            return f"¡{introNombre} está lleno!"

        while saciedadComer < 4:
            eleccionComida = input("Elige si quieres darle dulce o comida: ")
            if eleccionComida.lower() == "dulce":
                saciedadComer += 1
                felicidadComer += 1
                iteracionComer += 1
                return f"\n|{saciedadComer} 🍰|\n|{felicidadComer} ♡ |\n|{numCacas} 💩|\n{salud}|"
            elif eleccionComida.lower() == "comida":
                saciedadComer += 1
                iteracionComer += 1
                return f"\n|{saciedadComer} 🍰|\n|{felicidadComer} ♡ |\n|{numCacas} 💩|\n{salud}|"
            else:
                print("Opción no válida. Introduce 'dulce' o 'comida'.")

def jugar(felicidadJugar,saciedadJugar,iteracionJugar,introNombre,numCacas,salud):
    # if saciedadJugar==0:
    #     print(f"¡{introNombre} está cansado, dale de comer primero!")
    if  numCacas>3:
        print(f"Antes de jugar limpia a {introNombre}...")
    while numCacas<=3:
        felicidadJugar += 1
        saciedadJugar -= 1
        iteracionJugar += 1
        return f"\n|{saciedadJugar} 🍰|\n|{felicidadJugar} ♡ |\n|{numCacas} 💩|\n{salud}|"
    
def limpiarCaca(numCacas,iteraciones,felicidadCacas,salud):
    while True:
        numCacas=0
        iteraciones+=1
        while iteraciones==3:
            numCacas+=1
            felicidadCacas-=1
            return f"\n|{saciedad} 🍰|\n|{felicidadCacas} ♡ |\n|{numCacas} 💩|\n{salud}|"
        
# def verInfo():
#     return {introNombre},{peso}

# def curar():
#     if numCacas>0:
#         print(f"Primero limpia a {introNombre}")
#     while numCacas == 0 and salud==enfermo:
#         salud == sano
        




# MAIN
saciedad = 0
felicidad = 0
numCacas = 0
iteraciones = 0
# salud = ""
# enfermo = "😷"
# sano = "💪"

# while numCacas == 3:
#     salud == "😷"
# else:
#     salud == "💪"



estado = (f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n{salud}|")
print(estado)

introNombre = input("¿Cómo quisieras llamar a tu nuevo STEMgotchi?: ")

while True:
    seleccion = input(f"\nElige entre las tres acciones: \n● Ver información \n● Dar de comer \n● Jugar con {introNombre} \n● Limpiar cacas \n Curar \n: ")
    realizarFuncion(seleccion)


    



