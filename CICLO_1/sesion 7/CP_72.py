numero = int(input("Por favor ingrese un número: "))
contador = 0

while(numero > 0):
    digito = numero % 10
    numero = numero // 10
    if digito == 4:
        continue
    else:
        contador +=1
print(f"La cantidad de digitos es {contador} sin contar el 4")
