n = int(input("Cantidad de notas: "))
sum = 0

for c in range(n):
    nota = int(input("Nota: "))
    sum += nota

prom = sum / n
print(prom)