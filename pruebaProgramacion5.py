
import random

#FUNCIONES

def dibujarLinea(simbolo):
    numRepeticionesSimbolos = pregunta3
    print(simbolo*numRepeticionesSimbolos)


def dibujaCamino():
    numFilas = pregunta2
    for fila in range (numFilas):
        if fila%2 == 0:
            dibujarLinea((listaSimbolos[fila])*pregunta3)
        else:
            dibujarLinea((listaSimbolos[fila])*pregunta3)


#CÓDIGO

listaSimbolos = ["X","-",".",":","^"]
numSimbolos = int(input("¿Cuántos símbolos distintos tendrá el diseño?: "))
print(f"El diseño tiene {numSimbolos} símbolos distintos, sobre una lista de {len(listaSimbolos)} símbolos")

pregunta2 = int(input("¿Cúantas veces se repite el diseño?: "))

pregunta3 = int(input("¿Cúantas veces se repite cada símbolo en la fila?: "))

print(dibujarLinea(simbolo=random.choice(listaSimbolos)))
print(dibujaCamino())


# Hace muchos años, cuando Ciudad Esmeralda era una ciudad vulgar, en la que no era todo de su ahora característico color verde, se lanzó a concurso el diseño del camino de baldosas que conduciría a su magistral entrada.

#      El diseño ganador del concurso fue: 
# XXXXXXXXXX
# ----------
# XXXXXXXXXX
# ----------
# XXXXXXXXXX
# ----------

# El diseño corrió a cargo de un Winkie muy amigable que desgraciadamente fue castigado por la bruja del oeste por participar en el concurso.

# Crea el código:
# Pregunta por consola cuántos símbolos distintos quiere que tenga el diseño. 
# En el ejemplo: 2 (El primer dibujo sería la “X” y el segundo el “-”)
# Guarda en una lista tantos símbolos distintos como te haya indicado el apartado anterior. Solicítalos por consola.
# En el ejemplo: [“X”,”-”]
# Pregunta cuántas veces quieres que se repita el diseño y cuántas veces se repite el símbolo en cada fila.
# En el ejemplo: Se repite 3 veces (El diseño es una fila de X, otra de -) y las filas son de 10 símbolos.
# Crea una función que DIBUJE  el diseño.
# EXTRA: Crea una función  que DEVUELVA el diseño en formato string para ser dibujado desde el código principal.