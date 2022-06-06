"""
Vectores/Listas

Como vimos en la parte teórica, los vectores son una estructura de dato organizada que nos permite 
almacenar información. Una de las implementaciones más utilizadas es Python son las listas (List). 

Nota: En Python hay algunas diferencias menores entre un arreglo (array) y una lista, 
pero por ahora vamos a asumir que son lo mismo.

Vamos a ver una definición de esta estructura en Python. Para crear una lista, utilizamos los corchetes 
y separamos los valores de nuestra estructura con una coma. 

Por ejemplo, en la siguiente instrucción estamos creando una lista llamada a con los valores 1, 3, 2, 5, 2.
"""

# def ejemplo1():
#     a = [1, 3, 2, 5, 2]
#     print(a)

# ejemplo1()

#Las listas no necesariamente tienen que ser de números, también pueden ser de texto:
# def ejemplo2():
#     nombres = ["María", "Juan","Andrés"]
#     print(nombres)

#ejemplo2()

#Aquí van algunas funciones útiles cuando trabajamos con listas.
#    append(x) - inserta un nuevo valor x al final de la lista
#    remove(x) - remueve el primer valor X de la lista
#    pop([i]) - remueve el valor en la posición i. pop() remueve el último valor de la lista
#    len(x) - permite calcular el tamaño de una lista
#
# Ahora, veamoslas en acción
# def ejemplo3():
#     nombres = ["María", "Juan","Andrés"]
#     nombres.append("Jorge")
#     print(nombres)
#     print(len(nombres))

#     nombres.remove("Juan")
#     print(nombres)
#     print(len(nombres))

#     nombres.pop(2)
#     print(nombres)
#     print(len(nombres))
#ejemplo3()

#Actividad 1

# Usando el conocimiento de ciclos, crea una funcion numeros que tenga una lista con los numeros pares del 1 al 10 
# y usa un ciclo para que los imprima

# def numeros():
#     print("imprimiendo pares")
#     pares = [1,2,3,4,5,6,7,8,9,10]
#     for i in range(1,len(pares)+1,2):
#         print("par: ",pares[i])

# numeros()
#actividad1()

#Actividad 2
#
#Escribamos un programa que nos permita crear una lista de 6 números aleatorios entre 1 y 20 en Python, y 
#creemos dos funciones que reciban la lista como parámetro de la siguiente forma:
#
#    mayor(x) - Una función que imprima el número mayor valor de una lista x
#    primos(x) - Una función que imprima los números de la lista que son números primos

#actividad2()

import random

lista = []

def mayor():
    mayor = lista[0]
    for i in range(len(lista)):
        if i < len(lista)-1:
            a = lista[i+1]
        else:
            a = 0
        if mayor <= a:
            mayor = a
    return mayor

def primos():
    primos = []
    for i in range(len(lista)):
        if lista[i] >= 2:
            cont = 0
            for j in range(2,len(lista)+1):
                if lista[i]%j == 0 and lista[i] != j:
                    cont += 1
            if cont == 0:
                primos.append(lista[i])
    return primos

for i in range(6):
    lista.append(random.randint(1,20))

print(lista)
print("El mayor es: ", mayor())
print("Los primos son: ", primos())