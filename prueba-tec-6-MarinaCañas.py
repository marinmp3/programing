# Tenemos un texto cifrado que obviamente queremos descifrar y es muy fácil hacerlo, basta con fijarse en la segunda (2) letra de cada palabra de longitud mayor a cinco (5).

# ¿El problema? Que es un latazo.

# ¿La solución? Hacer un programa que lo automatice.

#1 [2,5p] .- La comprobación de la longitud de la palabra deberá realizarse en una función a la que se le pase 
#como atributo la palabra y que devuelva su longitud. [NO usar len()]

# #2 [2,5p] .- Se dejarán de pedir palabras cuando se introduzca la palabra FIN. (también puedo usar "While:True,sin embargo no me interesa usar break")

# #3 [2,5p] .- Si la palabra es mayor de cinco (5) letras, se almacenará la segunda (2) letra.

def solicitarPalabraYGuardar():
    listaLetras = []
    numMinimoLetrasPalabra = 5
    posicionLetraBuscada = 1
    palabra = input("Dime una palabra: ")

    while palabra != "FIN":
        numLetras = 0
        for letra in palabra:
            numLetras += 1
        print(numLetras)
        
        if numLetras >= numMinimoLetrasPalabra:
            segundaLetra = palabra[posicionLetraBuscada]
            guardarLetra(segundaLetra,listaLetras)

        palabra = input("Dime otra palabra (o escribe 'FIN' para salir): ")
        mostrarFraseOculta(listaLetras)

def guardarLetra(letra,listaLetras):
    listaLetras.append(letra)
    print(letra)

def mostrarFraseOculta(listaLetras):
    frase_oculta = '| '.join(listaLetras)  # Unir las letras en una cadena
    print(f"La frase oculta es: {frase_oculta}")

print (solicitarPalabraYGuardar())

# #4 [2,5p] .- Dada la frase Es común que lo elegante, sea tan temeroso como eterna es cualquier vida, almacenada en una lista . Obtén la frase oculta.


def solicitarPalabraYGuardar():
    listaLetras = []
    listaFrase = ["Es","común","que","lo","elegante","sea","tan","temeroso","como","eterna","es","cualquier","vida"]
    
    for palabra in listaFrase:
        numLetras = 0
        for letra in palabra:
            numLetras += 1
        print(numLetras)
        
        if numLetras >= 5:
            segundaLetra = palabra[1]
            guardarLetra(segundaLetra,listaLetras)

        mostrarFraseOculta(listaLetras)

def guardarLetra(letra,listaLetras):
    listaLetras.append(letra)
    print(letra)

def mostrarFraseOculta(listaLetras):
    frase_oculta = '|'.join(listaLetras)  # Unir las letras en una cadena
    print(f"La frase oculta es: {frase_oculta}")

print (solicitarPalabraYGuardar())




