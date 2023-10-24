palabra = "vanpiro"
lista = ["v","a","n","p","i","r","o"]

listaNum = [0,1,2,3,5,6,7]

frase =         '''el vampiro
                 es 
                bonito'''


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

#con una lista de enteros:
print(f"la lista de números es de tipo {type(listaNum)}")
print(f"cada elemento de la lista es {type(lista[0])}")

#podemos sumar a una psocion un valor
listaNum[0] += 10
print(listaNum)

#podemos cambier el valor de una posición
listaNum[0] = 0
print(listaNum)

# pero no puede sumar un nuevo valor
# listaNum += 10 
 
# aunque sí podemos usar .APPEND para añadir cualquier valor a la lista
listaNum.append(10)
print(listaNum)

lista.append("M")
print(lista)

#¿podemos sumar un valor a una posición de string? Con .append() sí, porque Python es un lenguaje no tipado
lista.append(10)
print(lista)

# manualmente no
# lista[0] += 10
# print(lista)

#la fucnión LEN() muestra la longitud
print(f"la longitud de la lista es de {len(listaNum)} números")
print(f"la lista tiene una longitud de {len(lista)} caracteres")

#len(lista) devuelve el tamaño de la lista, pero como emppieza en 0, la última posición es -1 el tamaño de la lista

print(f"La lista tiene {len(listaNum)-1} números")

del lista[len(lista)-1]

nombreAnimal = lista[0:6] #selecciona de 0 hasta 6
print(nombreAnimal)

# Vampiro!= 8 letras || ¡qué guay! = 9 letras
nombreAnimal = lista[0 : len(lista)-9+1]
print(nombreAnimal)