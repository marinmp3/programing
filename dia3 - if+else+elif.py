

nota = int(input("Introduce tu nota: "))
print("¿Qué nota tiene?")

#Si no asumimos nota válida:
#   "if nota >10 OR nota <0:"

if nota >10 or nota <0:
    print("Introduce una nota válida")
    
elif nota == 10 or nota == 9:
    print("Sobresaliente")
elif nota < 9 and nota >= 7:
    print ("Notable")
elif nota >= 6:
    print ("Bien")
elif nota >= 5:
    print("Aprobado")
    
else:
    print("Suspenso")
    
#SI asumimos nota válida(precondición/requisisto):
if nota <=10 and nota >= 9:
    print("Sobresaliente")




#1. Entrada: número. Salida: Ture si es nmayor de edad.
#Se puede escribir es "MayorEdad = edad >= 18"
#Es MayorEdad es de tipo bool.
edad = int(input("Introduce tu edad: "))
print("Es mayor de edad?")
EsMayorEdad = (edad >= 18)
print(EsMayorEdad)

#EsMayorEdad es de tipo bool.

print (type(EsMayorEdad))
if EsMayorEdad:
    print("Es mayor de edad")  
else:
    print("Es menor de edad")

#cuidado con la tab.    
print("Se imprime siempre")

#else:
    #print("Es menor de edad")

#else solo puede ir justamente debajo de "if".

#Sin la variable bool EsMayorEdad


edad = int(input("Introduce tu edad: "))
print("Es menor de edad?")
EsMenorEdad = not(edad >= 18)
print(EsMenorEdad)
print (type(EsMenorEdad))
if EsMenorEdad:
    print("Es menor de edad")



    
else:
    print("Es mayor de edad")
    
print("Se imprime siempre")
#else:
    #print("Es menor de edad")
#else solo puede ir justamente debajo de "if".

#Entrada: Numero. Salida: True si es positivo.
numero = int(input("Introduce un número"))
print("Es positivo?")
EsPositivo = (numero > 0)
if EsPositivo:
      print("Es un número positivo")
#Para expresar una condicion intermedia, entre if y else se usa ELIF.
elif numero == 0:
    print("Es 0")
    
else:
    print("Es un número negativo")

#está bien
#Tip: Crear todas las variables al principio (a veces en pyhton no se puede).
nota = int(input("Introduce tu nota: "))
print("¿Qué nota tiene?")
EsSuspenso = (nota < 5)
print(EsSuspenso)
print(type(EsSuspenso))
if EsSuspenso:
    print("Está suspenso")
elif nota == 5 or 6:
    print("Está aprobado")
elif nota == 7 or 8:
    print("Tiene notable")
else:
    print("Tiene sobresaliente")




