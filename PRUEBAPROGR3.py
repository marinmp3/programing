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

# multiplo13 = 13,26,39,52,65
# numEscalones = random.randrange(50,150+1)
# for numero in multiplo13:
#     print (f"la casa tiene {numEscalones} escalones y no podemos pisar los escalones {multiplo13}")
       
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
#             print ("¡Ya he girado suficiente!, pobre ojo mareado!")
 	    
# print(numero)