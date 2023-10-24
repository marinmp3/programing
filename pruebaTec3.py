import random

# 1: Recuento
# Recuenta los planetas en los que has estado [NO utilizar la función len()]:  
# Ejemplo de ejecución: 
# He estado en 9 planetas

# 2: Recuerdos
# Muestra por pantalla sus nombres indicando su orden:
# Ejemplo de ejecución: 
# El planeta número 1 fue Vulcano.
# El planeta número 2 fue Kronos.
# El planeta número 3 fue Bajor.

listaPlanetas = ["Vulcano","Kronos","Bajor","Ferenginar","Romulus","Remus","Risa","Pacifica","Andoria"]
print (listaPlanetas,end = "|")

contadorPlaneta = 0
for planeta in listaPlanetas:
    print (f"\nEl planeta {contadorPlaneta} fue {planeta}")
    contadorPlaneta += 1
print(f"\nHe estado en {contadorPlaneta} planetas")


# for planeta in listaPlanetas:
#         listaPlanetas[0] = ("El primer planeta fue Vulcano")
#         listaPlanetas[1] = ("El segundo planeta fue Kronos")
#         listaPlanetas[2] = ("El tercer planeta fue Bajor")
#         listaPlanetas[3] = ("El cuarto planeta fue Ferenginar")
#         listaPlanetas[4] = ("El quinto planeta fue Romulus")
#         listaPlanetas[5] = ("El sexto planeta fue Remus")
#         listaPlanetas[6] = ("El séptimo planeta fue Risa")
#         listaPlanetas[7] = ("El octavo planeta fue Pacífica")
#         listaPlanetas[8] = ("El noveno planeta fue Vulcano")

# 3. Adivina adivinanza
# Te gusta jugar a que te digan un planeta y tu tengas que contestar su número en tu lista de planetas visitados.
# Crea el juego: Pregunta aleatoriamente por uno de los planetas. Solicita por consola que te digan en qué posición fue visitado. Comprueba si han contestado correctamente. En caso de no contestar correctamente sigue preguntando.

# def solicitarPlaneta():

# input("¡Juguemos a adivinar el planeta!: ")


planetaAleatorio = random.choice(listaPlanetas)
print(planetaAleatorio)
frase = input("¿En qué lugar fue visitado?: ")



# Ejemplo de ejecución: 
# 	¿Kronos fue el planeta número… ? 1
# 	Lo siento, pero te has equivocado, prueba otra vez: 5
# 	Lo siento, pero te has equivocado, prueba otra vez: 2
# 	Respuesta correcta.