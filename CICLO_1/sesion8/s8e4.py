numero = 0

while numero != -1:
    numero = int(input("Ingrese un numero: "))
    if numero == -1:
        break
    f = 1
    for i in range(1,numero+1):
        f = f*i
    print(f"El factorial es: {f}")