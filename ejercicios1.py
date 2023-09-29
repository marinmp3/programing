
# Ejercicios input/print

#1. Solicita por teclado una palabra e imprimela de nuevo. 
#2. Solicita por teclado una palabra y repítela 5 veces.
#3. Solicita por teclado una palabra y repítela 5 veces separándola por espacios.
#4. Solicita una palabra y un número. Repite la palabra tantas veces como indique el número.
#5. Solicita una palabra y un número. Muestra por pantalla: "Tengo <numero> <palabra>s".



#10. Solicita por teclado dos numeros y la palabra 'suma' o 'resta'. Realiza la operación correspondiente.

numero1=(int(input("Dime un numero")))
numero2=(int(input("Dime un numero")))
operacion=input("introduce suma o resta")
if operacion=="suma":
    resultado= numero1+numero2
elif operacion=="resta":
    resultado = numero1-numero2
else:
    print(f"La {operacion} es igual a {resultado}")

#6. Solicita por teclado un número y multiplícalo por 0.
numero=(int(input("Dime un numero")))
print(numero*0)

#7. Solicita por teclado dos números y multiplícalos entre sí.
numero1=(int(input("Dime un numero")))
numero2=(int(input("Dime un numero")))
print (int(numero1*numero2))
#8. Solicita por teclado dos números y escribe true si el primero es mayor.
num1=int(input("introduce un número"))
num2=int(input("introduce otro número"))
if (num1>num2):
    print("true")
#9. Solicita por teclado un número y escribe true si es par.


#9.1. Solicita por teclado un número y escribe true si es multiplo de 5.


# Ejercicios booleanos - condicionales.
#11. Solicita por teclado dos numeros. Escribe "El primer número es mayor" o "El primer número es menor" segun corresponda.

num1=int(input("introduce un número"))
num2=int(input("introduce otro número"))
if num1>num2:
    print("El primer número es mayor")
if num1<num2:
    print("El primer número es menor")

#12. Solicita por teclado dos numeros. Escribe "Has ganado" si el segundo número menos el primero da un valor positivo.

num1=int(input("introduce un número"))
num2=int(input("introduce otro número"))
if (num2-num1>=0):
    print("Has ganado")

#0. Solicita por teclado un color. Guardalo para más tarde.
color=(input("Dime un color [Será utilizado más tarde]"))
print(color)

#13. Solicita por teclado un color. Si coincide con el color del ejercicio #0 escribe "¿Cómo sabías que era mi color favorito?"
otroColor = input("Dime un color")
if color == otroColor:
    print(f"¿Cómo sabías que mi color favorito era el {color}?") 

#14. Solicita por teclado un día de la semana y un número. Si el número coincide con su día de la semana o el día introducido es viernes escribe "¡Has ganado!"
diaSemana=input("dime un día de la semana")
num=int(input("dime un numero"))
# otra forma
esGanador = False
if diaSemana=="viernes":
    print("Has ganado!")
elif diaSemana=="lunes" and num==1:
   esGanador = True
elif diaSemana=="martes" and num==2:
    esGanador = True
elif diaSemana=="miércoles" and num==3:
    print("HAs ganado!")
elif diaSemana=="jueves" and num==4:
    print("HAs ganado!")
elif diaSemana=="viernes" and num==5:
    print("HAs ganado!")
else:
    print("perdiste")

#otra forma más corta
esGanador=diaSemana=="viernes" or (diaSemana=="lunes" and num==1) or (diaSemana=="martes" and num==2) or (diaSemana=="miercoles" and num==3) or (diaSemana=="jueves" and num==4) or (diaSemana=="sábado" and num==6) or (diaSemana=="domingo" and num==7)
esGanador=True


#15. Solicita por teclado tres núemros. Si los dos primeros son mayores que el tercero, escribe "Mayores"; si los dos son menores que el tercero, escribe "Menores"; para cualquier otro caso, escribe "¿Iguales?"



