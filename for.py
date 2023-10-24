#funciones
#For en Pyhton equivale a "Foreach" en otros lenguajes de programación
#FOREACH: para cada elemento de una lista, hago lo que ponga
# dentro del FOR.

#creamos una lista de monstruos
monstruos = ["vampiro", "zombie", "cococabra", "bruja", "fantasma"]
# for cadaElemento in unaLista: "hacemos algo"
for monstruo in monstruos:
    print(f"{monstruo}s!¡Qué miedo!", end =" ")

#10+1 porque queremos llegar hasta 10, y así vemos hasta que número llegará

print("\nImprimo: for numero in range(1,10+1):")
for numero in range(1,10+1):
    print(numero,end =" ")

print("\nImprimo: for numero in range 0,1,2...:")
for numero in range(10):
    print(numero,end =" -- ")

print("\n Imprimo numeros impares hasta el 10")   
for numero in range(1,10+1,2):
    print(numero,end = " ")

print("\nImprimo numeros pares hasta el 10")
for numero in range(0,10+1,2):
    print(numero,end = " ")

print("\n Imprimo los numeros del 10 al 1")
for numero in range (10,1-1,-1): #(si vamos cuenta atrás, el end debe ser un º negativo)
    print(numero,end=" -- ")

# un str por dentro es una lista,
monstruo = "bruja" # monstruo = ['b','r','u','j','a']

print ("\nImprimo cada letra de monstruo(bruja)")
for letra in monstruo:
    print(letra)

print("\n Deletreo cada letra de cada monstruo")
for monstruo in monstruos:
    print(f"¡{monstruo}, que miedo!")
    for letra in monstruo:
        print(letra)

print("\nCalculo la hora")
for hora in range (1,60+1,1):
    print(hora,end=":")
for minuto in range(1,60+1,1):
    print(minuto,end=":")
for segundo in range(1,60+1,1):
    print(segundo,end=":")