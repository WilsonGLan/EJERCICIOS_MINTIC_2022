"""
Mientras Que

Como vimos anteriormente, en Python, el ciclo Mientras Que se maneja con "while". 

Por ejemplo:
"""


'''
i = 1
while i < 6:
    print(i)
    i += 1
'''



print("actividad1")
# Continuemos integrando los conceptos que hemos visto hasta el momento. 
# Ahora vamos a elaborar un algoritmo que pida un número al usuario, e imprima todos los números pares desde 2 hasta el número. 

# Comentar las instrucciones anteriores para ejecutar las siguientes


print("actividad2")
#Escribe el código un ciclo para obtener el número de dígitos de un número ingresado por el usuario.

# Comentar las instrucciones anteriores para ejecutar las siguientes    
    
'''
numero = int(input("Ingrese el número a evaluar: "))
cociente = numero
contador = 0

while  cociente > 0:
    cociente = cociente // 10
    contador += 1

print(f"El número {numero} tiene {contador} digitos")
'''

print("actividad3")
#Escribe el código que solicite números al usuario hasta que éste ingrese -1.
#Cuando se ingrese -1, el programa debe imprimir el promedio de todos los números ingresados hasta ese momento (sin contar con el -1).

# Comentar las instrucciones anteriores para ejecutar las siguientes 

finalizar = False
contador = 0
acumulador = 0

while finalizar == False:
    numero = int(input("Por favor ingrese un número: "))
    if numero == -1:
        finalizar = True
        if contador > 0:
            promedio = acumulador / contador
            print(f"El promedio de los {contador} ingresados es: {promedio} ")
        else:
            print("No ha ingresado ningun numero")
    else:
        acumulador = numero + acumulador
        contador +=1
