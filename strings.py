# el str por dentro es un vector: v . a . m . p . i . r . o 
#triples comillas ''' para seleccionar como str largo
palabra = "vanpiro"
lista = ["v","a","n","p","i","r","o"]

frase =         '''el vampiro
                 es 
                bonito'''

#para recorrer la palabra podemos usar un bucle:
print("|", end="")
for letra in palabra:
    print(letra,end="--|")

print(f"\n{frase}")

#contador se suele llamar I, de iterador
#con la palabra[contador] accedemos a la posición de una letra.

"""
contador = 0
while contador<10:
    print(f"La letra {palabra[contador]} está en la posicón {contador}")
    contador += 1

"""

# palabra[3] = "m"
# print(palabra[0])

#con str no corrige el error porque no tiene permiso de edición. Para añadir algo a un str usamos += ""
palabra+="!"
print(palabra)

#hay que hacer una lista.
lista[2] = "m"
print(lista)

# Podemos añadir txt a la lista como si fuera str sin tener que añadirlo letra a letra con comillas.
lista += "!"
print(lista)

lista[7] += "¡Qué guay!"
print(lista)

#De qué tipo es cada una de las posiciones de las lista? Usamos type()
print(type(lista))
print(type(lista[0])) #[0] para seleccionar cada elemento de la lista