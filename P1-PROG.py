import random

def realizarFuncion(seleccion):
    while seleccion.lower() == "dar de comer":
        print(comer()) #tiene sentido usar parámetros específicos como "saciedadComer" en este caso? Sería mejor hacerlo con "global"?
        # print(comer(saciedadComer=saciedad, felicidadComer=felicidad, numCacas=numCacas, introNombre=introNombre, iteracionComer=iteraciones, pesoComer=peso, edadComer=edad))
        break
    while seleccion.lower() == f"jugar con {introNombre}":
        print(jugar())
        break
    while seleccion.lower() == "limpiar cacas":
        print(limpiarCaca())
        break
    while seleccion.lower() == "ver info":
        print(verInfo())
        break
    while seleccion.lower() == "curar":
        print(curar())
        break
    while seleccion.lower() == "visitar tienda":
        print(visitarTienda())
        break
    return seleccion

def comer(): #saciedadComer, felicidadComer, numCacas, introNombre, iteraciones,pesoComer, edadComer
    global saciedad, felicidad, numCacas, iteraciones, peso, edad, salud # debería añadir la variable "dinero" si no se va a efectuar en esta función?
    if numCacas > 0:
        print(f"¡Limpia a {introNombre} antes de comer!")
    elif numCacas == 0:
        if saciedad == 4:
            print (f"¡{introNombre} está lleno!")
    while saciedad < 4:
        eleccionComida = input("Elige si quieres darle dulce o comida: ")
        if eleccionComida.lower() == "dulce":
            if salud == enfermo:
                print (f"{introNombre} no puede comer dulces estando enfermo...")
            elif salud != enfermo:
                saciedad += 1
                felicidad += 1
                iteraciones += 1
                peso+=2
                edad+=1
            return f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n|{salud}|"
        elif eleccionComida.lower() == "comida":
            saciedad += 1
            iteraciones += 1
            peso+=1
            edad+=1
            return f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n|{salud}|"
        else:
            print("Opción no válida. Introduce 'dulce' o 'comida'.")

def jugar():
    global saciedad, felicidad, numCacas, iteraciones, peso, edad, dinero, salud    
    while saciedad==0:
        print(f"¡{introNombre} está cansado, dale de comer primero!")
        break
    if  numCacas>2:
        print(f"Antes de jugar limpia a {introNombre}...")
    while numCacas<=2:
        felicidad += 1
        saciedad -= 1
        iteraciones += 1
        edad+=1
        peso-=1
        dineroGanado = random.randrange(100,200)
        dinero+=dineroGanado
        return f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n|{salud}|"
    
def limpiarCaca():
    global saciedad, felicidad, numCacas, iteraciones, peso, edad
    while True:
        numCacas=0
        iteraciones+=1
        edad+=1
        return f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n|{salud}|"
        
def verInfo():
    global saciedad, felicidad, numCacas, salud, iteraciones, salud, edad
    iteraciones+=1
    edad+=1
    print (f"Se llama {introNombre}, pesa {peso} L, tiene {dinero} G, tiene {edad} años")
    return f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n|{salud}|"

def curar():
    global saciedad, felicidad, numCacas, iteraciones, peso, edad, salud
    if numCacas>0:
        print(f"Primero limpia a {introNombre}")
    elif numCacas == 0 and salud==enfermo:
        enfermo == salud #esto estaría bien expresado? 
        iteraciones+=1
        edad+=1
        return f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n|{salud}|"
    else:
        print (f"{introNombre} no está enfermo") 
def visitarTienda():
    global saciedad, felicidad, numCacas, iteraciones, salud, peso, edad, dinero
    listaObjetos = ["pelota","gorra","patines","skate","lápices","raquetas","botas","saxofón","collar","cometa"]
    for objeto in listaObjetos:
        precio = 50,200,500,900,100,350,400,1000,250,150
        

    objeto1= random.choice(listaObjetos) #especificar que no se repitan los objetos
    objeto2= random.choice(listaObjetos)
    objeto3= random.choice(listaObjetos)
    seleccionObjeto = input(f"Elige un objeto a comprar: \n● {objeto1} \n● {objeto2} \n● {objeto3} \n: ")
    while precio>dinero:
        seleccionObjeto = input(f"No tienes suficiente dinero. Prueba a jugar con {introNombre} o selecciona otro objeto: ")
        if dinero>precio:
            dinero-=precio
            iteraciones+=1
            edad+=1
            print(f"¡Has adquirido el objeto {seleccionObjeto}!\n(Has gastado {precio} G y te quedan {dinero} G)")

    nuevoObjeto = objeto
    if objeto in listaObjetos:
        posObjeto = listaObjetos.index(objeto)
        posNuevoObjeto = (posObjeto + numero) % len(listaObjetos)
        nuevoObjeto = listaObjetos[posNuevoObjeto]
        return nuevoObjeto
    
    return f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n|{salud}|" #esto me lo devuelve siempre o solo cuando se produzcan cambios en las variables?
    
# MAIN

for numero in range(4+1): #debería definir también en la función "if saciedad<4? (por ejemplo) Es decir, si lo puedo expresar de otra forma"
    saciedad = 0
    felicidad = 0

for numero in range(6+1):
    numCacas = 0

iteraciones = 0

for numero in range(99+1):
    peso = 1
    edad = 0

for numero in range(9999+1):
    dinero = 0

objetosObtenidos = []

salud = " 💪 " #Aclaración:  en un primer momento está sano
enfermo = "😷"

if iteraciones==3: #mejor while o if?
    numCacas+=1
    felicidad-=1

while numCacas >= 3: #mejor while o if?
    salud == enfermo

# while iteraciones==9:



estado = (f"\n|{saciedad} 🍰|\n|{felicidad} ♡ |\n|{numCacas} 💩|\n|{salud}|")
print(estado)

introNombre = input("¿Cómo quisieras llamar a tu nuevo STEMgotchi?: ")
while len(introNombre) >5:
    introNombre = input("Introduce un nombre válido: ")

while True:
    seleccion = input(f"\n¿Qué acción quieres realizar?: \n● Ver info \n● Dar de comer \n● Jugar con {introNombre} \n● Limpiar cacas \n● Curar \n● Visitar tienda \n: ")
    realizarFuncion(seleccion)


    




