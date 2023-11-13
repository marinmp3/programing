#FUNCIONES
#2 - al empezar a hacer la fucnion 3 no sé por quá ha dejado de fucnionarme la uñtima parte del 2, antes funcionaba.
def rellenarLista(numNombresSolicitar):
    lista = []
    for num in range(numNombresSolicitar):
        nombre = input(f"Introduce el nombre del piloto {num+1}: ")
        lista.append(nombre)
    return lista

def encontrarPiloto(lista,elementoABuscar):
    print(listaPilotos)
    encontrado = False
    for elemento in lista:
        if elemento == elementoABuscar:
            encontrado = True
    return encontrado

#3 - crearNuevaLista() crea una lista de pilotos nueva, recorre la lista anterior y los copia a la nueva. Si el piloto se repite en la primera lista, no lo pasa a la segunda duplicado.
# he intentado sacar el piloto repitido con la varible posición y pilotoRepetido, pero no he podido hacer más.

def crearNuevaLista(listaConRepetidos):
    nuevaListaPilotos = []
    for elemento in listaConRepetidos:
        if not pilotoEstaEnLista(nuevaListaPilotos,elemento):
            nuevaListaPilotos.append(elemento) 
    return nuevaListaPilotos

#4

def buscarOcurrencias(lista,elementoABuscar):
    numOcurrencias = 0
    for elemento in lista:
        if elemento == elementoABuscar:
            numOcurrencias+=1
    return numOcurrencias


# #1 [2,5p] .- Vamos a almacenar en una lista el nombre de los pilotos que han quedado en el podio en las últimas carreras.
# Para ello: Solicita el número de grandes premios sobre los que se va a guardar la información y almacena los nombres pertinentes, teniendo en cuenta que por cada gran premio hay tres pilotos que consiguen el podio.

#MAIN
listaPilotos = []

pilotosEnPodio = 3
pedirNumPremios = int(input("Introduce el número de Grandes Premios registrados: "))

pilotosAIntroducir = pilotosEnPodio*pedirNumPremios
print(f"Deberás introducir {pilotosAIntroducir} pilotos")

numPiloto = 0
while numPiloto != pilotosAIntroducir:
    pilotosRegistrados = input(f"Introduce al piloto {numPiloto+1}: ")
    numPiloto+=1
    listaPilotos.append(pilotosRegistrados)

rellenarLista(listaPilotos)

piloto = input("Qué piloto quieres buscar en la lista?: ")
pilotoEstaEnLista = estaEnLista(listaPilotos,piloto)
print(f"el piloto está en la lista? {pilotoEstaEnLista}: ")

listaNueva = crearNuevaLista(listaPilotos)
print(listaNueva)

piloto = input("qué piloto quieres saber cuantas veces ha cosneguido podio?: ")
numPodios = buscarOcurrencias(listaPilotos,piloto)
print(f"el piloto {piloto} ha agnado podio {numPodios} veces")

# #2 [2,5p] .- Crea una función a la que le pases la lista de pilotos y el nombre de un piloto y que devuelva si ese piloto está o no en la lista.	

print(rellenarLista())

# #3 [2,5p] .- Crea una nueva lista, utilizando la lista con los nombres de los pilotos, pero sin repetir ninguno.

print(crearNuevaLista())

# #4 [2,5p] .- Mostrando la lista con los nombres de los pilotos que han estado en el podio (sin repetir nombres), solicita por consola que se escriba uno de los nombres y devuelve cuántas veces ha obtenido podio.

print()