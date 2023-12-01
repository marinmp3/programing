
# 0


#2
def rellenarMatrizStringNumeros(nFilas,nColumnas):
    matriz = []
    for contFilas in range(nFilas):
        fila = []
        for contColumnas in range(nColumnas):
            elemento = f"{contFilas},{contColumnas}"
            fila.append(elemento)
        matriz.append(fila)
    return matriz


#3
def imprimirMatriz(matriz):
    for nFila in range(len(matriz)):
        for nColumna in range(len(matriz[nFila])):
            print(matriz[nFila][nColumna], end = " ")
        print()

#4 
def comprobarNum(matriz,num):
    estaDisp = False
    for lista in matriz:
        for num in lista:
            if num == seleccion:
                estaDisp = True
    return f"El número {num} está disponible"
    
#5
def cambiarNumIniciales(matriz,num,iniciales):
    for nFil in range(len(matriz)):
        for nCol in range(len(matriz[nFil])):
            if matriz[nFil][nCol] == num:
                matriz[nFil][nCol] = iniciales
    return matriz





# MAIN --------------------------------------------------------------------------------------------------------------------------------------------
#0
print("En la matriz se sortean cartas de Pokémon legendarios")

#2
print("Rellenando una matriz de 10x10:")
matriz = rellenarMatrizStringNumeros(10,10)
imprimirMatriz(matriz)

#1
seleccion = int(input("Elige un número del 0 al 99 y te diremos si ha salido premiado: "))

inicialCliente = input("Escribe las dos iniciales de tu nombre: ")
for numero in matriz[seleccion]:
    numero==inicialCliente

# while numero in matriz:

#3
print (f"Imprimo la matriz:")
print(imprimirMatriz(matriz))

#4
print("Compruebo si sigue estando disponible: ")
print(comprobarNum(matriz,seleccion))

#5
nFil = 10
nCol = 10
print ("Cambiamos el número seleccionado por las iniciales del cliente: ")
print(cambiarNumIniciales(matriz,seleccion,inicialCliente))





