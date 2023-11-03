# Tenemos un texto cifrado que obviamente queremos descifrar y es muy fácil hacerlo, basta con fijarse en la segunda (2) letra de cada palabra de longitud mayor a cinco (5).

# ¿El problema? Que es un latazo.

# ¿La solución? Hacer un programa que lo automatice.

#1 [2,5p] .- La comprobación de la longitud de la palabra deberá realizarse en una función a la que se le pase 
#como atributo la palabra y que devuelva su longitud. [NO usar len()]

def solicitarPalabra():
    palabra = input("Introduce una palabra: ")
    return palabra

def comprobarLong():
    numLetras = 0
    for letras in palabraIntroducida:
        numLetras +=1    
    return numLetras

palabraIntroducida = input("Introduce una palabra: ")    
print(comprobarLong())
			                                                                              
# #2 [2,5p] .- Se dejarán de pedir palabras cuando se introduzca la palabra FIN.

def ejercicio2():
    print(solicitarPalabra())
    while palabraIntroducida != "FIN":
        return(input("Introduce otra palabra: "))
    
print (ejercicio2())

# Ej.						
# Introduce una palabra: Pato		
# Introduce una palabra: FIN		


				
# #3 [2,5p] .- Si la palabra es mayor de cinco (5) letras, se almacenará la segunda (2) letra.
print(solicitarPalabra())
def ejercicio3():
    for numLetras in palabraIntroducida:
        while numLetras>5:
            print(numLetras[2])

print(
    ejercicio3())

# en este punto el código ya no se ejecuta, lo que dejo es lo que he intentado hacer.

# Ej. 						
# 	Introduce una palabra: Pato		
# []
# 	Introduce una palabra: Paloma	
# [a]
# 	Introduce una palabra: Perrete	
# [ae]

# El programa final tiene que tener el siguiente aspecto:

# Introduce una palabra: Pato
# Introduce una palabra: Paloma
# Introduce una palabra: Perrete
# Introduce una palabra: FIN

# La frase oculta es: ae



# #4 [2,5p] .- Dada la frase Es común que lo elegante, sea tan temeroso como eterna es cualquier vida, almacenada en una lista . Obtén la frase oculta.

