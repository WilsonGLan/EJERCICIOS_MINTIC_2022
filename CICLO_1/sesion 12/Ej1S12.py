# SUMANDO MATRICES

# 1. Con dos funciones
import random

mA = []
mB = []

def matriz():
    matriz =[]  # SE DEFINE LA MATRIZ VACIA
    filas = 3
    columnas = 3
    for i in range(filas):
        Fila = []
        for j in range(columnas):
            dato = random.randint(1,20)
            Fila.append(dato)
        matriz.append(Fila)
    return matriz

def sumarMatriz(mUno, mDos):
    matrizSuma =[]  # SE DEFINE LA MATRIZ VACIA
    filas = 3
    columnas = 3
    for i in range(filas):
        Fila = []
        for j in range(columnas):
            dato = mUno[i][j] + mDos[i][j]
            Fila.append(dato)
        matrizSuma.append(Fila)
    return matrizSuma

mA = matriz()[:]
print(mA)
mB = matriz()[:]
print(mB)
print(sumarMatriz(mA,mB))

print("============================")


# 2. Una sola función recursiva
mA = []
mB = []
mS = []

def matriz(suma,mUno, mDos):
    matriz =[]  # SE DEFINE LA MATRIZ VACIA
    filas = 3
    columnas = 3
    for i in range(filas):
        Fila = []
        for j in range(columnas):
            if suma == 0:
                dato = random.randint(1,20)
            else:
                dato = mUno[i][j] + mDos[i][j]
            Fila.append(dato)
        matriz.append(Fila)
    return matriz

mA = matriz(0, mA, mB)
print(mA)
mB = matriz(0, mA, mB)
print(mB)
mS = matriz(1, mA, mB)
print(mS)


'''
matriz1 =[]  # SE DEFINE LA MATRIZ VACIA
filas = 3
columnas = 3
for i in range(filas):
    Fila = []
    for j in range(columnas):
        dato = random.randint(1,20)
        Fila.append(dato)
    matriz1.append(Fila)
print(matriz1)


matriz2 =[]  # SE DEFINE LA MATRIZ VACIA
filas = 3
columnas = 3
for i in range(filas):
    Fila = []
    for j in range(columnas):
        dato = random.randint(1,20)
        Fila.append(dato)
    matriz2.append(Fila)
print(matriz2)

matrizSuma =[]  # SE DEFINE LA MATRIZ VACIA
filas = 3
columnas = 3
for i in range(filas):
    Fila = []
    for j in range(columnas):
        dato = matriz1[i][j] + matriz2[i][j]
        Fila.append(dato)
    matrizSuma.append(Fila)
print(matrizSuma)
'''


'''
for i in range(3):
    fila = []
    for j in range(3):
        dato = 0
        if i == j:
            dato = 1
        fila.append(dato)
    matriz.append(fila)

print(matriz)

matriz =[] 
filas = int(input("Numero de filas: "))
columnas = int(input("Numero de columnas: "))

for i in range(filas):
    Fila = []
    for j in range(columnas):
        dato = random.randint(1,20)
        Fila.append(dato)
    matriz.append(Fila)
print(matriz)
'''