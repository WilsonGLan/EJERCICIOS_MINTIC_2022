"""
Matrices o vectores bidimensionales

En Python podemos trabajar los arreglos bidimensionales como listas de listas, es decir, cada elemento de la lista es una lista.

Nota Existe una librería en Python que maneja tanto vectores como matrices llamada numpy. 
Esta librería está por fuera del alcance de este curso pero puedes investigarla.

Veamos un ejemplo:
"""
# def ejemplo1():
#     a = [[1, 2, 3, 4, 5],
#      [6, 7, 8, 9, 0]]
#     print(a)

# ejemplo1()

#O podemos recorrer todos los elementos e imprimir como una matriz
# def ejemplo2():
#     a = [[1, 2, 3, 4, 5],
#      [6, 7, 8, 9, 0]]
#     for i in range(len(a)):
#         for j in range(len(a[i])):
#             print(a[i][j], end=' ')
#         print()

# ejemplo2()

#Actividad 1
#
#Vamos a escribir un funcion matriz que llene una matriz de 5 filas y 10 columnas con números enteros entre 1 y 100
#aleatorios, imprima los valores máximo y mínimo y sus posiciones dentro de la matriz.

#actividad1()

from random import randint
f = 5
c = 10

def llenarMatriz():
    matriz = []

    for i in range(f):
        filas = []
        for j in range(c):
            filas.append(randint(1,100))
        matriz.append(filas)
    
    return matriz


def mayor(matriz):
    mayor = matriz[0][0]
    posicionf = posicionc = 0
    for i in range(f):
        for j in range(c):
            if mayor <= matriz[i][j]:
                mayor = matriz[i][j]
                posicionf = i
                posicionc = j
    return mayor, posicionf, posicionc

def menor(matriz):
    menor = matriz[0][0]
    posicionf = posicionc = 0
    for i in range(f):
        for j in range(c):
            if menor >= matriz[i][j]:
                menor = matriz[i][j]
                posicionf = i
                posicionc = j
    return menor, posicionf, posicionc

matrizR = llenarMatriz()
print(matrizR)
menorFinal, menorf, menorc = menor(matrizR)
mayorFinal, mayorf, mayorc = mayor(matrizR)

print(f"El mayor de la matriz es {mayorFinal} su posición corresponde en la fila {mayorf} y en la columna {mayorc}")
print(f"El menor de la matriz es {menorFinal} su posición corresponde en la fila {menorf} y en la columna {menorc}")

#Actividad 2
#
#El producto escalar de un número real, x , y una matriz A es la matriz xA. 
#Cada elemento de la matriz xA es x veces su elemento correspondiente en A.
#
#Diseñemos una funcion escalar(matriz, escalar) que dada matriz[n][m] y un escalar, 
#imprima el producto escalar de la matriz.

#actividad2()