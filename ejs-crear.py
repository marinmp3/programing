#FUNCIONES
def ejercicio3():
    numPalabras = int(input("¿Cuántas palabras tendrá la lista?: "))
    palabrasEnLista = 5
    numPalabraEnLista = numPalabras%palabrasEnLista
    palabra = listaPalabras[numPalabraEnLista]
    return(palabra*numPalabras)

def ejercicio4():
    listaNumeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
    for numero in listaNumeros:
        return numero

def ejercicio5():
    listaNumeros = [1,2,3,4,5,6,7,8,9,10]
    if num1 and num2 in listaNumeros:
        print(listaNumeros.sort(key=num1))
    return ejercicio5()

# 1.-
# Crea una lista de 5 palabras directamente en el código.
print("Ejercicio 1")
listaPalabras = ["menta","fresa","vainilla","choco","mango"]
for palabra in listaPalabras:
    print(palabra)

# 2.-
# Crea una lista de 5 palabras, solicitándolas por consola. 
print("Ejercicio 2")

# 3.-
# Solicita de cuántas palabras quieres que sea una lista.
# Crea una lista de ese número de palabras, solicitándolas por consola.
print("Ejercicio 3")
print(ejercicio3())

# 4.-
# Crea una lista que contenga los números del 1 al 20
print("Ejercicio 4")
print(ejercicio4())

# 5.-
# Solicita dos números por consola.
# Crea una lista que contenga los números comprendidos entre esos dos, ambos incluidos.
# Asegurate de que funcione aunque el primer numero introducido sea menor que el primero.
num1 = int(input("Dime un número (del 1 al 10): "))
num2 = int(input("Dime otro número: "))
print(ejercicio5())