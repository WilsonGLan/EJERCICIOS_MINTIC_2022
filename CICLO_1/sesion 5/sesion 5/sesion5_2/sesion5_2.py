# Diseñar 3 opciones:
#
#   1. Leer un número de 4 dígitos, mostrar el dígito mayor e 
#      informar si es par o impar.
#   2. Leer dos números de 3 dígitos cada uno, formar un tercer número 
#      con el mayor del primero y el menor del segundo.
#   3. Leer un número de 3 dígitos y formar el mayor número posible 
#      con sus cifras.
#   
# Luego crea un menú con las tres opciones.

# Menu de opciones:
print("1. Leer numero de 4 digitos y mostrar digito mayor")
print("2. Leer numero de 3 digitos y combinar sus valores")
print("3. Leer numero de 3 digitos y formar el numero mayor de sus valores")

# Lee la opcion deseada
  # Ejecuta el bloque de codigo de acuerdo a la opcion elegida
opcion = int(input())

if opcion == 1:  
  numero = int(input("Por favor ingrese el numero de 4 digitos: "))
  cuarto = numero//1000
  residuo_cuatro = numero % 1000
  tercero = residuo_cuatro // 100
  residuo_tres = residuo_cuatro % 100
  segundo = residuo_tres // 10
  primero = residuo_tres % 10

  if cuarto >= tercero:
    mayor1 = cuarto
  else:
    mayor1 = tercero

  if segundo >= primero:
    mayor2 = segundo
  else:
    mayor2 = primero

  if mayor1 >= mayor2:
    mayor = mayor1    
  else:
    mayor = mayor2

  if mayor % 2 == 0:
    print(f"El numero mayor es {mayor} y es par")
  else:
    print(f"El numero mayor es {mayor} y es impar")

  

elif opcion == 2:
  numero1 = int(input("Por favor ingrese el primer numero de 3 digitos: "))
  numero2 = int(input("Por favor ingrese el segundo numero de 3 digitos: "))

  primero_uno = numero1 // 100
  primero_res_uno = numero1 % 100
  primero_dos = primero_res_uno // 10
  primero_tres = primero_res_uno % 10

  segundo_uno = numero2 // 100
  segundo_res_uno = numero2 % 100
  segundo_dos = segundo_res_uno // 10
  segundo_tres = segundo_res_uno % 10

  if primero_uno >= primero_dos:
    mayor_primero = primero_uno
  elif primero_dos >= primero_tres:
    mayor_primero = primero_dos
  else:
    mayor_primero = primero_tres

  if segundo_uno <= segundo_dos:
    menor_segundo = segundo_uno
  elif segundo_dos <= segundo_tres:
    menor_segundo = segundo_dos
  else:
    menor_segundo = segundo_tres

  print(mayor_primero*10+menor_segundo)
  
elif opcion == 3:
  numero = int(input("Por favor ingrese un numero de 3 digitos: "))  
  numero1 = numero // 100  
  numero2 = (numero % 100) // 10
  numero3 = (numero % 100) % 10

  if numero1 >= numero2:
    if numero1 >= numero3:
      mayor = numero1
      if numero2 >= numero3:
        medio = numero2
        menor = numero3
      else:
        medio = numero3
        menor = numero2
    else:
      mayor = numero3
      medio = numero1
      menor = numero2
  elif numero2 >= numero3:
    mayor = numero2
    if numero1 >= numero3:
      medio = numero1
      menor = numero3
    else:
      medio = numero3
      menor = numero1
  else:
    mayor = numero3
    medio = numero2
    menor = numero1
  
  print(f"El numero mayor posible es {mayor}{medio}{menor}")


# Observe que el programa finaliza una vez se ejecute la opcion deseada

