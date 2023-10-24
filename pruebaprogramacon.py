pokemon1=(input("introduce el nombre del primer pokemon"))
tipo1=(input("introduce el tipo del pokemon"))
nivel1=(input("introduce el nivel del pokemon"))
tipo1==" agua" or tipo1==" fuego" or tipo1==" planta"
nivel1==(0-50)

pokemon2=(input("introduce el nombre del segundo pokemon"))
tipo2=(input("introduce el tipo del pokemon"))
nivel2=(input("introduce el nivel del pokemon"))
tipo2==" agua" or tipo2==" fuego" or tipo2==" planta"
nivel2==(0-50)

ganador=True

if tipo1 == tipo2 and nivel1<nivel2:
    ganador=pokemon2
elif tipo1 != tipo2 and tipo1=="fuego":
    ganador==pokemon1
elif nivel2>=10(nivel1):
    ganador==pokemon2
    
else:
    ganador==pokemon1


print (f"{ganador}¿Cómo se genera la frase aleatoria?")


import random

def fraseAleatoria():
    frases = [
        "¡El ganador de la batalla es increible!",
        "¡La victoria ha sido para el mejor Pokémon!",
        "¡Nuestro ganador a triunfado en la batalla!",
        "¡Enhorabuena al Pokémon ganador!",
        "¿Quién ganará la próxima vez?"
    ]
    fraseElegida = random.choice(frases)
    return fraseElegida


def batallaJusta(tipo1=tipo2):
    return ("La batalla fue justa")

if batallaJusta:False
print("La batalla no fue justa")





















