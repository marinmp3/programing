


#4. Entrada: letra. Salida: true si es vocal
letra = input("Introduce una letra:")
print ("¿Es una vocal?")
print (letra == "a" or letra == "e" or letra == "i" or letra == "o" or letra == "u")



#5.Entrada: numero. Salida: true si está aprobada
numero = int(input("introduce tu nota:"))
print ("¿Está aprobado?")
print(numero >=5 and numero <=10)


# 1. Entrada: Numero. Salida: True si es mayor de edad.
# Para saber el tipo -> print(type(numero))

nombre = input("Introduce tu nombre:")
print ("Hola" + nombre)
#El input recoge el dato y lo guarda en nombre
#Existen dos tipos de =s en programación:
#  =  -> Asigna lo que hay a la izquierda a lo que hay a la derecha.
#       ej: numero = 5
#   ==  -> Es un igual LÓGICO. ¡Compara los valores que tiene a izq y der! Devuelve true si son iguales; o false, si son distintas.
# input siempre guarda el valor introducido como str. SI queremos que sea entero, hay que
# transfromarlo. int(input)...))
numero = input("introduce tu edad:")
print ("¿Es mayor de edad?")
print (int(numero) >= 18)
numero = input("introduce tu edad:")
print ("¿Es mayor de edad?")
print (int(numero) >= 18)


#2. Dice un día de la semana: si es fin de semana es verdadero, sino false
#   de la semana:
# CUIDADO: introducir la palabra tal cual se define en la variable, incluídos ESPACIOS.
#diadelasemana
#dia_semana
#diasSemana
diaSemana = input("Introduce un día de la semana:")
print ("¿Es fin de semana?")
print (diaSemana == "sábado" or diaSemana == "domingo")

#3. Entrada: numero. Salida: True si es positivo
numero = input ("introduce un número")
print(int(numero) >=0)

