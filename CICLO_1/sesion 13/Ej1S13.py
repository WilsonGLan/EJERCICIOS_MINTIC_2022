# 1. GENERAR LA MATRIZ CON f filas, c columnas de numeros aleatorios
# 2. sumar los elementos de la fila 2
# 3. sumar los elementos de la comuna 1

import random

columnas = int(input('Cantidad de columnas: '))
filas = int(input('Cantidad de filas: '))

matrizA = []

for i in range(filas):
    fila = []
    for j in range(columnas):
        dato = random.randint(1,(filas*columnas)+1)
        fila.append(dato)
    matrizA.append(fila)

matrizB = []

for i in range(filas):
    fila = []
    for j in range(columnas):
        dato = random.randint(1,(filas*columnas)+1)
        fila.append(dato)
    matrizB.append(fila)

print(matrizA)
print(matrizB)

matrizS = []

suma = 0
for i in range(columnas):
    fila = []
    for j in range(filas):
        suma = matrizA[i][j] + matrizB[i][j]
        fila.append(suma)
    matrizS.append(fila)

print(matrizS)
