n = int(input("Por favor ingrese el valor de la máxima potencia: "))
a = int(input("Por favor ingrese el valor del número base: "))
contador = 1
s = 0
while contador <= n:
    s = s + (a**contador)
    contador += 1

print(f"El resultado de la sumatoria es {s} ")