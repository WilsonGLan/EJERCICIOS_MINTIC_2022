numero = int(input("Por favor ingrese un número mayor a 0: "))
acumulador = 1

while(acumulador <= numero):
    if acumulador % 2 == 0:
        print(acumulador)
    if acumulador == 10:
        break
    acumulador += 1