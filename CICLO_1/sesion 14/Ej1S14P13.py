
#Plantilla basica de manejo de errores


while True:
    try:
        x = int(input("Ingresa un número entero: "))
        break

    except ValueError:
        print("Error en los datos, debe ser un número entero")