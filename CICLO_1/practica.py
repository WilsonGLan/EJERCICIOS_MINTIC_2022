# Hacer un programa que calcule el promedio de las notas de n estudiantes

n =  int(input("Cuantas notas va a ingresar: "))
c = 1
nota = 0
suma = 0

while c <= n:
    nota = float(input(f"Por favor ingrese la nota numero {c}: "))
    suma = nota + suma
    c += 1

prom = suma / n

print(f"El promedio de las notas es : {prom} ")
