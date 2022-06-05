"""
Cada ejemplo y actividad será definida como un bloque independiente.
Si-Sino-Finsi
Recuerda que los condicionales múltiples y anidados nos permiten evaluar múltiples casos. 
El condicional Si-Sino-Si-Finsi tiene la siguiente estructura:

    Si (condición) Entonces
        instrucción(es)
    Sino Si
        instrucción(es)
    Fin Si

En Python, esto se escribe un poco diferente y la estructura general depende de las tabulaciónes. 
Por ejemplo:
"""

x = int(input("Por favor ingresa un número: "))
if x < 0:
    print('El número es Negativo')
elif x > 0:
    print('El número es positivo')
elif x == 0:
    print('El número es cero')


# Actividad 1
# Escribe el código que imprima un comando dada la luz del semáforo
    print("Actividad 1")
    #Verde = Siga
    #Amarillo = Precaución
    #Rojo = Pare

luz = input("Cual luz da el semaforo: (verde, amarillo, rojo) ")

if luz == 'verde':
    print("Siga")
elif luz == 'amarillo':
    print("Precaucion")
elif luz == 'rojo':
    print("Pare")

# Para ejecutar cada actividad, debes poner en comentarios todas las lineas de los bloques anteriores o si lo prefieres
# crear otro programa python


# Actividad 2
# Escribe el código que basado en la actividad 1 y una variable que nos indica si hay peaton o no (hayPeaton), imprima:
    print("Actividad 2")
    #Verde -------- Si hay peaton - Pare, Sino - Siga
    #Amarillo ----------- Si hay peaton - Pare, Sino - Precaución
    #Rojo = Pare

luz = input("Cual luz da el semaforo: (verde, amarillo, rojo) ")
hayPeaton = input("Si hay peaton digite SI, en caso contrario digite NO: ")

if luz == 'verde':
    if hayPeaton == 'SI':
        print("Pare")
    else:
        print("Siga")
elif luz == 'amarillo':
    if hayPeaton == 'SI':
        print("Pare")
    else:
        print("Precaucion")
elif luz == 'rojo':
    print("Pare")


# Para ejecutar cada actividad, debes poner en comentarios todas las lineas de los bloques anteriores o si lo prefieres
# crear otro programa python




# Actividad 3
# Escribe el código para dos numeros a y b, el usuario va a seleccionar una opcion: 
    print("Actividad 3")
    #1 para sumar, 2 para multiplicar, 3 para restar (a-b) y 4 para dividir (a/b) y 
    #retornar el resultado de la operación indicada.

a = 10
b = 5

print("1. Suma.")
print("2. Multiplicacion.")
print("3. Resta.")
print("4. Division.")

opcion = int(input("Digite el numero que corresponda a la operacion escogida: "))

if opcion == 1:
    operacion = "suma"
    resultado = a+b
elif opcion == 2:
    operacion = "multiplicacion"
    resultado = a*b
elif opcion == 3:
    operacion = "resta"
    resultado = a-b
elif opcion == 4:
    operacion = "division"
    resultado = a/b

print(f"El resultado de la {operacion} entre {a} y {b} es {resultado}")

# Para ejecutar cada actividad, debes poner en comentarios todas las lineas de los bloques anteriores o si lo prefieres
# crear otro programa python