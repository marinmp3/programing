
matriz = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]

def sumarNumCentrales(matriz, filElegida, colElegida):
    suma = 0
    posicionNum = len(matrizfilElegida(colElegida))
    for filElegida in matriz:
        suma+=posicionNum
        posicionNum+=1
    return suma

print(matriz)
print("sumar todos los elementos de la diagonal en la matriz: ")
print (sumarNumCentrales(matriz,filElegida=0,colElegida=0))

#imprimir la matriz
def imprimirMatriz():
    for fila in range(len(matriz1)): # las filas se suelen escribir como "i" y las columnas como "j", de iterador (i) y la cifra posterior (j)
        for columnas in range(len(matriz1[fila])):
            print(matriz1[fila][columnas],end=" ")
        print()

# def imprimirMAtriz2:
#     for lista in matriz:
#         for elemento in lista:
#             print(matriz1[fila][columnas],end=" ")
    

# sumar todos los elementos de una matriz
# de esta forma se controlan las posicones

def sumarMatriz(matriz):
    for nfila in range (len(matriz)): #se uiliza range() para recorrer la matriz, junto a len()
        for nCol in range(len(matriz[nfila])):
            suma += matriz[nfila][nCol]
    return suma 
    
print (sumarMatriz(matriz))

#para controlar los números:

def sumarColumna2(matriz):
    suma = 0
    for fil in matriz:
        for col in fil:
            suma+=col
    return suma

#for lista in matriz: --> es lo mismo que con fil y col, pero con variables "lista". También se puede usar para imprimir la matriz.
    # for elemento in lista:
    #     print(elemento)

# sumar solo los elementos de la fila indicada

def sumarFila(matriz1,numFilaElegida):
    suma = 0
    # for nFila in range(len(matriz1)):
    #     if nFila == numFilaElegida:
    for nCol in range(len(matriz1[numFilaElegida])):
        suma += matriz1[numFilaElegida][nCol]
    return suma

print (sumarFila())

# sumar solo los elementos de la columna indicada

def sumarColumna(matriz1,filElegida,colElegida):
    suma = 0
    for nFil in range(len(matriz1)):
        suma+=matriz1[nFil][colElegida] #no puedo sumar columnas sin tener en cuenta el nº de fila
    # o
    for fila in matriz1:
        suma += fila[colElegida]
    for columna in matriz1[filElegida]:
        suma += columna
    return suma
    
print (sumarColumna())


#sumar solo los elementos que están en posiciones pares [0,0]

def sumarPares():
    par = numero%2==0
    for numero in len(matriz1):
        suma = numero+len(matriz1[par])
        return suma

print(sumarPares())

# sumar los elementos de las posciones impares

def sumarImpares():
    for numero in len(matriz1):
        if numero%2!=0:
            impar = numero
            suma = numero+len(matriz1[impar])
            return suma
        

print (sumarImpares())
        

# dada otra matriz, sumar solo los elementos que hay en la posición indicada

# def sumarNumerosInput():
#     for numero in matriz2(fila[numerosIndicados]):
#         suma = num1+num2
#         return suma
    
# print(sumarNumerosInput())

# sumar los elementos centrales en una matriz de 4*4(se encuentran en diagonal) ej: 1 2 3 4
    #                                                                               5 6 7 8
    #                                                                               9 10 11 12
    #                                                                               13 14 15 16

# rellenar matriz por filas
def rellenarMatrizPorFilas(numColumnas):
    matriz = []
    fila = []
    # construimos la fila, que va a tener la forma [0,1,2,3...]
    for num in range(numColumnas):
        fila.append(num)

    #Introducimos la fila a la matriz
    for contFilas in range(numColumnas):
        # fila = [contFilas]*numColumnas - ya está hecha arriba
        matriz.append(fila)
    return matriz

nFil = 3
nCol = 3

print("crear matriz por filas: ")
print(rellenarMatrizPorFilas(nFil,nCol))


#--------------------------------------------------------------------------------------------------------------------------------------

lista = [1,2,3]
print (f"imprimo la lista: {lista}")
print(f"Imprimo el elemento 2 de la lista: {lista[1]}")

matriz = [[1,2,3],[4,5,6]]
print (f"Imprimo la matriz: {matriz}")
print (f"imprimo el elemento 2 de la lista: {matriz[1]}")
print(f"Imprimo el elemento [2,1] de la lista de matrices: {matriz[1][0]}") #del segundo elemento (lista2) quiero el primer elemento

#EJ1:
# Imprimir por filas la matriz. 1 2 3
#                               4 5 6
#                               7 8 9

matriz1 = [[1,2,3],[4,5,6],[7,8,9]]
print(f"Imprimo la matriz en filas: {matriz1}")


# para que haya un salto de líneas entre filas
# for fila in matriz1:

# # print(matriz1[fila][columnas],end=" ")


# # Imprimir por columnas la matriz. 1 4 7
# #                                  2 5 8
# #                                  3 6 9

# matriz2 = [[f"\n1,4,7"],[f"\n2,5,8"],[f"\n3,6,9"]]
# print(f"Imprimo la matriz en columnas: {matriz2}")

num1= int(input("Introduce el número 1: "))
num2 = int(input("Ahora el 2: "))
numerosIndicados = num1,num2

#crear una matriz de ceros

nFil = 3
nCol = 3

matriz= []
for contador in range(nFil):
    matriz.append([0]*nCol)
    #fila = [0*nCol]
    #matriz.append(fila)
print(matriz)


# con python

matriz = []
matriz = [[0] *nCol for fil in range(nFil)]
print(matriz)

# crear una matriz solo con un símbolo indicado

matriz = []
matriz = ["-" * nCol for fil in range(nFil)]
print(matriz)

# crear una matriz con los numeros del 1 a n (tq n = tamaMatriz)
nFil = 10
tamaMatriz = nFil

matriz = []
matriz = [[0] * nCol for fil in range(tamaMatriz)]
print(matriz)

#forma corregida
matriz = []
contador = 1
for contFilas in range(nFil):
    fila = []
    for contColumnas in range (nCol):
        fila.append(contador)
        contador+=1
    matriz.append(fila)
print(matriz)

# crear una matriz con cada fila su número de fila

# crear una matriz con cada columna de su número de columna

# crear una matriz con 0s en las posiciones pares y 1s en las impares.
