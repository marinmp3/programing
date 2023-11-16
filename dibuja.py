
def patronFila(simbolo,ancho):
    return simbolo*ancho
def cuadradoUno(simbolo,altura,ancho):
    dibujo = ""
    for fila in range(altura):
        dibujo += patronFila(simbolo,ancho)
        dibujo += "\n"
        #print(f"El dibujo con {fila+1} filas: \n{dibujo}")
    return dibujo
def cuadradoDos(simbolo0,simbolo1,altura,ancho):
    dibujo = ""
    for fila in range(altura):
        if fila%2 == 0:
            dibujo += patronFila(simbolo0,ancho)
        else:
            dibujo += patronFila(simbolo1,ancho)
        dibujo += "\n"
        print(f"El dibujo con {fila+1} filas: \n{dibujo}")
    return dibujo
def piramideIzq(simbolo,altura):
    dibujo = ""
    patron = ""
    for fila in range(altura):
        patron += simbolo
        dibujo += patron
        dibujo += "\n"
        print(f"El dibujo con {fila+1} filas: \n{dibujo}")
    return dibujo
def piramideIzqDos(simbolo,altura):
    dibujo = ""
    for fila in range(altura):
        dibujo += patronFila(simbolo,fila+1)
        dibujo += "\n"
        #print(f"El dibujo con {fila+1} filas: \n{dibujo}")
    return dibujo
def piramideDer(simbolo,altura):
    dibujo = ""
    for fila in range(altura):
        patron = patronFila(" ",altura-(fila+1)) + patronFila(simbolo,fila+1)
        dibujo += patron + "\n"
        print(f"El dibujo con {fila+1} filas: \n{dibujo}")
    return dibujo
def piramide(simbolo,altura):
    dibujo = ""
    patron = "X"
    for fila in range(altura):
        dibujo += patronFila(" ",altura-(fila+1)) + patron
        dibujo += "\n"
        print(f"El dibujo con {fila+1} filas: \n{dibujo}")
        patron += simbolo*2
    return dibujo

def dibujarPiramideEspacios(simbolo,altura):
    dibujo = ""
    patron = "X"
    espacios = " "
    for fila in range(altura):
        dibujo += patronFila(" ",altura-(fila+1)) + patron
        dibujo += "\n"
        print(f"El dibujo con {fila+1} filas: \n{dibujo}")
        patron += simbolo*2
    return dibujo

def dibujarCuadrado(altura):
    num_filas = 5
    for fila in range(altura):
        if fila == 0 or fila == num_filas - 1:
        # Imprimir la línea completa de 'X' en la primera y última fila
            print("X" * (2 * num_filas - 1))
        else:
        # Imprimir 'X' en la primera posición y la última posición
            print("X" + " " * (2 * num_filas - 3) + "X")



# ---------- Código principal ----------
"""
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
XXXXXXXXXX
"""
#print(cuadradoUno('X',5,10))
"""
XXXXXXXXXX
----------
XXXXXXXXXX
----------
XXXXXXXXXX
"""
#print(cuadradoDos("X","-",5,10))
"""
X
XX
XXX
XXXX
XXXXX
"""
#print(piramideIzqDos("X",5))
"""
    X
   XX
  XXX
 XXXX
XXXXX
"""
#print(piramideDer("X",5))
"""
    X
   XXX
  XXXXX
 XXXXXXX
XXXXXXXXX
"""
# print(piramide("X",5))

#     X
#    X X 
#   X X X
#  X X X X
# X X X X X

print(dibujarPiramideEspacios("X",5))

#  XXXXXXXXXX
# X          X
# X          X
# X          X
#  XXXXXXXXXX

print(dibujarCuadrado(altura=5))
