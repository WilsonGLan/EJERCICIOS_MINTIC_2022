palabra = input("Ingrese una palabra: ")
cont = 0

for i in range(len(palabra)):
    letra = palabra[i]
    if palabra[i] == 'a':
        break
    else:
       cont += 1

print(f"Hay {cont} letras")