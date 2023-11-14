# 26.-
# Comprueba, sin utilizar funciones propias de listas/string/for, si un número de teléfono introducido tiene el prefijo de Granada o no.

def ejSugerido():
    listaTlfno = "958349870"
    print(listaTlfno)
    if listaTlfno[0]== "9" and listaTlfno[1] == "5" and listaTlfno [2] == "8" :
        print("Es un número de teléfono de Granada")
    else: 
        return("No es un número de  Granada")
print(ejSugerido())

def ejSugeridoConInput():
    tlfno = (input("Introduce un número de 9 cifras: "))
    if tlfno[0]     == "9" and tlfno[1] == "5" and tlfno [2] == "8" :
        print("Es un número de teléfono de Granada")
    else: 
        return("No es un número de  Granada")
print(ejSugeridoConInput()) 

# 27.-
# Similar al 26 ->
# Comprueba, sin utilizar funciones propias de listas, si un número o un texto introducido está contenido en otro número o texto propio del programa.
# +++ Crear un función a la que le pases dos listas y te devuelva si una contiene a la otra o no.

strNum = "930657899"
strBuscamos = "3"

encontrado = False
for pos in len(strNum):
# vuelta 0 -> [9]30657899 == [3]4
# vuelta 1 -> 9[3]0657899 == [3]4
# vuelta 2 -> 93[0]657899 == [3]4
#...
# vuelta 6 -> 93065[7]899 == 3[4]
    print(f"vuelta {pos} -> Estamos en e número {strNum[pos]}")
    if strNum[pos] == strBuscamos[0]:
        print(F"el número {strNum[pos]} es igual al rimer numero que buscamos {strBuscamos}")
            # strNum[pos+1] == strBuscamos[0+1]
            # strNum[pos+2] == strBuscamos[0+2]
        for posBuscando in range(len(strBuscamos)):
            # strNum[pos+posBuscando] == strBuscamos[posBuscando]
            (F"el número strNum[pos+posBuscando] es {strNum[pos+posBuscando]}")
            (F"el número strNum[pos+posBuscando] es {strBuscamos[pos+posBuscando]}")
            #strNum[pos+posBuscando] == strBuscamos[posBuscando]
        encontrado = True
print(encontrado)

strNum = "930657899"
strBuscamos = "3"