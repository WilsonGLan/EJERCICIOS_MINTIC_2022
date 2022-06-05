n = int(input("Cuantos números va a ingresar?: "))
valores = [n]
c = [n]

for i in range(1,n+1):
    print(f"Ingrese el número {i}")
    valores.append(int(input()))
    c.append(valores[i] * valores[i])

for j in range(1,n+1):
    print (f"El numero {valores[j]} elevado al cuadrado es: {c[j]}")
