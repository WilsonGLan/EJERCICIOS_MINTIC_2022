ejecutar = True
contador = 0
sumaIca = 0
contVerde = contAmarillo = contNaranja = contRojo = contMorado = contMarron = 0

while ejecutar == True:
    C = float(input())
    contador += 1
    if C >= 0.125 and C < 0.165:
        ICA = round((150-101)/(0.164-0.125)*(C-0.125)+101,2)
    elif C >= 0.165 and C < 0.205:
        ICA = round((200-151)/(0.204-0.165)*(C-0.165)+151,2)
    elif C >= 0.205 and C < 0.405:
        ICA = round((300-201)/(0.404-0.205)*(C-0.205)+201,2)
    elif C >= 0.405 and C < 0.505:
        ICA = round((400-301)/(0.504-0.405)*(C-0.405)+301,2)
    elif C >= 0.505 and C < 0.605:
        ICA = round((500-401)/(0.604-0.505)*(C-0.505)+401,2)
    else:
        continue

    sumaIca += ICA

    if ICA >= 0 and ICA <= 50:
        alarma = "verde"
        contVerde += 1
    elif ICA > 50 and ICA <= 100:
        alarma = "amarillo"
        contAmarillo += 1
    elif ICA > 100 and ICA <= 150:
        alarma = "naranja"
        contNaranja += 1
        ejecutar = False
        break
    elif ICA > 150 and ICA <= 200:
        alarma = "rojo"
        contRojo += 1
    elif ICA > 200 and ICA <= 300:
        alarma = "morado"
        contMorado += 1
    elif ICA > 300:
        alarma = "marron"
        contMarron += 1

promedio = sumaIca / contador

if promedio >= 0 and promedio <= 50:
    af = "verde"
elif promedio > 50 and promedio <= 100:
    af = "amarillo"
elif promedio > 100 and promedio <= 150:
    af = "naranja"
elif promedio > 150 and promedio <= 200:
    af = "rojo"
elif promedio > 200 and promedio <= 300:
    af = "morado"
elif promedio > 300:
    af = "marron"


verde = (contVerde*100)/contador
amarillo = (contAmarillo*100)/contador
naranja = (contNaranja*100)/contador
rojo = (contRojo*100)/contador
morado = (contMorado*100)/contador
marron = (contMarron*100)/contador

print(contador)
print('{0:.2f}'.format(promedio), af)
print(f"verde {verde:.2f}%")
print(f"amarillo {amarillo:.2f}%")
print(f"naranja {naranja:.2f}%")
print(f"rojo {rojo:.2f}%")
print(f"morado {morado:.2f}%")
print(f"marron {marron:.2f}%")
