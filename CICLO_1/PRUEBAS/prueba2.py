import random

columnas = int(input('Cantidad de columnas: '))
filas = int(input('Cantidad de filas: '))
k = int(input('Escalar: '))

matrizA = []

for i in range(filas):
    fila = []
    for j in range(columnas):
        dato = random.randint(1,50)
        fila.append(dato)
    matrizA.append(fila)


matrizR = []

for i in range(len(matrizA)):
    fila = matrizA[i]
    fila2 = []
    for j in range(len(fila)):
        dato = matrizA[i][j] * k
        fila2.append(dato)
    matrizR.append(fila2)

print(f"Matriz principal: {matrizA}")
print(f"Producto escalar: {matrizR}")