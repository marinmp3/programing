"""
Nos hemos encontrado un tesoro mágico en la guarida de un 
temible dragón. 
A los dragones les encantan las cosas que brillan y por eso 
prefería tener muchísimas monedas antes que pocas pero de 
mayor cantidad, por eso tenía un total de 4765 Knuts.

Cada Sickle son 29 Knuts.
Cada Galeón son 17 Sicles.

#1. Calcula matemáticamente el valor con el número mínimo de
Galeones, Sickles y Knuts posibles. [Utilizando el módulo]

#2. Con solo 493 Knuts representa en forma de marcador 
                            *marcador puntuacion papel reloj*
el proceso de ir añadiendo Knuts hasta llegar a 29 y que estos
se conviertan en una moneda de Sickle y el proceso de ir 
consiguiendo Sickles hasta llegar al Galeón.
""" 

# Funciones 1
def calculoDivisa():
    knuts = 4765
    sickle = knuts//29
    galeon = sickle//17
    restoSickles = knuts%sickle
    restoGaleones = sickle%galeon
    return (f"En 4765 knuts hay {sickle} sickles y {galeon} galeones, sobrando {restoSickles} sickles y {restoGaleones} galeones")

    
#Código 1
print (calculoDivisa())

# # Funciones 2
# def marcador():
#     knut = 493
#     sickle = 29
#     galeon = 17
#     return f"{galeon}:{sickle}:{knut}"
# # Funciones 2
#     while knut==29:
#         sickle = 1
#     while sickle+17:
#         galeon = 1
#     for knut in range(1,493+1):
#         print (f"{galeon}:{sickle}:{knut}")

# Código 2
print(marcador())
# Código 2
print(marcador())




