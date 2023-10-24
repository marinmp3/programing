# Queremos entrar en una casa embrujada. Esta casa está embrujada, pero no es malvada. Le gustan las personas, sobre todo si están vivas, y por eso toda persona que quiera pasar miedo a su costa debe superar una serie de pruebas previas para ver si es lo suficientemente valiente:
# a su costa debe superar una serie de pruebas previas para ver si es lo suficientemente valiente:

# Prueba número #1: Las escaleras.
# ¿Sabéis cuántas escaleras tiene la entrada de la casa? No lo sabe ni ella. Pero lo que si sabemos es que adora su escalón número trece y todos sus múltiplos, así que no deja que nadie los pise.
# Genera aleatoriamente el número de escalones que tiene la casa entre 50 y 150 (ambos incluidos) e indica qué escalones debemos saltarnos para poder llegar a la puerta de entrada.
# Ejemplo de ejecución:
# 	Hay 73 escalones, no podemos pisar los escalones 13, 26, 39, 52 y 65


# Prueba número #2: El ojo de la puerta.
# La puerta tiene un ojo-timbre que odia que lo pulsen cuando está abierto (a nadie le gusta que le metan el dedo en el ojo) por eso hay que conseguir que se cierre antes de tocar. Para eso hay que marearlo girando 5 veces delante de él, mientras haces una cuenta atrás.
# Ejemplo de ejecución:
# 	Tengo que girar 5 veces.
# 	Tengo que girar 4 veces.
# 	Tengo que girar 3 veces.
# 		     …
# 	¡Ya he girado suficiente!
# 	  ¡Pobre ojo mareado!



# EXTRA [1p] - Prueba número #3: Contraseña.
# A la casa le encantan los bichos y su bicho favorito es la ARAÑA, así que hasta que no escribamos la contraseña ARAÑA con nuestra propia sangre en un folio, es muy probable que no nos deje entrar y nos vuelva a preguntar infinitamente por la contraseña.
# Ejemplo de ejecución:
# 	Contraseña: LOMBRIZ
# 	Es incorrecta.
# 	Contraseña: GRILLO
# 	Es incorrecta.
# 	…
# 	Contraseña: ARAÑA
# 	¡Puede comenzar tu aventura!

# -------------------------------------
#1

#funcion

import random
def multiplo13():
    multiplo13 = 13,26,39,52,65
    numEscalones = random.randrange(50,150+1)
    return (f"\nLa casa tiene {numEscalones} escalones y no podemos pisar los escalones {multiplo13}")

#codigo
print(multiplo13())

"""
#para definir el multiplo de 13 con un bucle for:
    # for escalon in range (1,numEscalones+1):
    #if escalon%13 == 0:
    #   print (f"No pises el escalon {escalon}")        

    #minEscalones = 50
    #maxEscalones = 150 (refactorizado,se añade dentro de randrange)

#o simplemente
#numEscalones = random.randrange(13,150+1,13) aunque no puede imprimir todos los escalones

"""
 

       
#2
#funcion
print("\n Giro 5 veces")
for numero in range (5,1-1,-1):
    print(numero,end= "...")

# for numero in range (5,-1):
#     while numero == 5:
#         print ("Me quedan 5 giros")
#         if numero == 4:
#             print ("Me quedan 4 giros")
#         elif numero == 3:
#             print ("Me quedan 3 giros")
#         elif numero == 2:
#             print ("Me quedan 2 giro")
#         elif numero == 1:
#             print ("Me quedan 1 giro")
#         elif numero == 0:
#   
#          print ("¡Ya he girado suficiente!, pobre ojo mareado!")

"""
print(numero)

CORRECCIÓN 2 con for
for vuelta in range (5,0,-1):
    #print(f"quedan {vuelta} vueltas por dar")

CORRECCIÓN 2 con while
vueltas = 5
while vueltas > 0:
    #print(f"quedan {vueltas} vueltas por dar...")
    #vueltas -= 1

"""  

#EXTRA: Contraseña

contrasenia = "ARAÑA"
confirmContrasenia = input("\nescribe la contraseña: " )
while confirmContrasenia !=contrasenia:
    confirmContrasenia = input("te has equivocado,vuelve a escribirla: " )





"""
Prueba número #1: El tiempo corre.
¿Sabéis cuántos tiempo tienes para pasar las pruebas de entrada en la casa? 
No lo sabe ni la propia casa. Pero lo que si sabemos es que esta comprendido 
entre 450 y 240, ambos incluidos, genéralo aleatoriamente.
Cuando falten multiplos de 50 segundos para tener que salir suena una alarma,
al igual que los 10 últimos segundos.

Ejemplo de ejecución:
	Tienes 327 segundos.
	…
	Quedan 300 segundos.
	Quedan 250 segundos.
	Quedan 200 segundos.
	…
Quedan 10 … 9 … 8 … 7 … 2 … 1… ¡FUERA!
"""

tiempoSalida = 450
tiempoLlegada = 240
tiempoPruebas = random.randrange(tiempoLlegada,tiempoSalida+1)
print(f"tenemos {tiempoPruebas} segundos para llegar")

for segundo in range (tiempoPruebas,0-1,-1):
    if segundo%50 == 0:
        print (f"quedan {segundo} segundos")  
for segundo in range (10,1-1,-1):
        print(end=f"¡alerta! quedan {segundo} segundos")
        while segundo<1:
            print("FUERA")