strNum = "930657899"
strBuscamos = "3"

encontrado = False
for pos in len(strNum):
# vuelta 0 -> [9]30657899 == [3]4
# vuelta 1 -> 9[3]0657899 == [3]4
# vuelta 2 -> 93[0]657899 == [3]4
#...
# vuelta 6 -> 93065[7]899 == 3[4]
    print(f"vuelta {pos} -> Estamos en e número {strNum[pos]}")
    if strNum[pos] == strBuscamos[0]:
        encontrado = True
        print(F"el número {strNum[pos]} es igual al rimer numero que buscamos {strBuscamos}")
            # strNum[pos+1] == strBuscamos[0+1]
            # strNum[pos+2] == strBuscamos[0+2]
        for posBuscando in range(len(strBuscamos)):
            # strNum[pos+posBuscando] == strBuscamos[posBuscando]
            (F"el número strNum[pos+posBuscando] es {strNum[pos+posBuscando]}")
            (F"el número strNum[pos+posBuscando] es {strBuscamos[pos+posBuscando]}")
            if (strNum[pos+posBuscando] != strBuscamos[posBuscando]):
                encontrado=False
            print(f"Encontrado = {encontrado}")
            #strNum[pos+posBuscando] == strBuscamos[posBuscando]
        
print(encontrado)
