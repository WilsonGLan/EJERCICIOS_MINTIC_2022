#Buscar un número ingresado por un usuario

import random


N = int(input("Escriba N: "))
V = []
for i in range(N):
    V.append(random.randint(1,N))

X = int(input("Escriba X: "))
pos = 0
existe = False
print(V)

while pos < N and existe == False:
    if V[pos] == X:
        existe = True
    else:
        pos += 1

if existe == True:
    print("Encontrado")
else:
    print("No encontrado")
