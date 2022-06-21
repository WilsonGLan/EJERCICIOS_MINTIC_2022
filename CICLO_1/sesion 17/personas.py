file = open("D:/00_CURSOS/MINTIC/PROGRAMACION_BASICA/EJERCICIOS_MINTIC_2022/CICLO_1/sesion 17/Personas.txt", "r")
diccionario = []
for linea in file:
    pal =linea.split(";")
    elemento = {
        "id":pal[0],
        "nombre":pal[1],
        "apellido":pal[2],
        "nacimiento":pal[3]
    }
    diccionario.append(elemento)
file.close()
print(diccionario)