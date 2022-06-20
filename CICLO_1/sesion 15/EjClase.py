"""
Manejo de archivos
Vamos ahora a trabajar tanto con archivos de texto como binarios.
En Python, la función open() retorna un objeto tipo archivo. La función recibe dos parámetros que
incluyen el nombre del archivo y el segundo es la forma en la que se abrirá el archivo,
el modo (leer, leer y escribir, etc).
Los siguientes 'modos' pueden ser combinados dependiendo de la operación que se desee realizar.
Por ejemplo, para leer y escribir un archivo de texto sin eliminar el archivo existente se podría usar
'r+' y para abrir un archivo binario para lectura usaríamos 'rb'
Modo    Descripción
'r'     Abrir el archivo en modo lectura, este es el valor por defecto
'w'     Abrir el archivo para escritura, eliminará cualquier archivo existente con el mismo nombre
'x'     Crear el archivo, si existe uno con el mismo nombre sacará un error
'a'     Abrir el archivo para escribir. Todo lo escrito se adicionará al final del archivo
'b'     Abrir en modo binario
't'     Abrir en modo texto, este es el valor por defecto
'+'     Abrir para lectura y escritura
"""
ruta = "D:/00_CURSOS/MINTIC/PROGRAMACION_BASICA/EJERCICIOS_MINTIC_2022/CICLO_1/sesion 15/nuevo.txt"
#   Archivo de texto llamado nuevo.txt con numeros
#   Ahora vamos a leer la información del archivo usando la función read().
#   read() Lee todo el archivo
# def ejemplo1():
#     try:
#         miarchivo=open(ruta,"r")
#         linea=miarchivo.read()
#         print("===================================")
#         print("      abrio bien ejemplo 1"         )
#         print(linea)
#         print("===================================")
#     except:
#         print("Archivo no encontrado")
# ejemplo1()

#   En el siguiente ejemplo, vamos a hacer que el programa
#   lea una línea al tiempo es decir una a la vez.
#   readline() Lee linea por linea
# def ejemplo2():
#     try:
#         miArchivo = open(ruta, 'r')
#         linea = miArchivo.readline()
#         print("===================================")
#         print("      abrio bien ejemplo 2"         )
#         print(linea)
#         print("Lei la primera línea. Vamos a la segunda")
#         linea = miArchivo.readline()
#         print(linea)
#         miArchivo.close()
#         print("===================================")
#     except IOError:
#         print("Archivo no encontrado")
# ejemplo2()

#   En el siguiente ejemplo, vamos a hacer que el programa lea un archivo
#   y cree una lista con todas las lineas
#   readlines() : Crea una lista

# def ejemplo3():
#     try:
#         miArchivo = open(ruta, 'r')
#         linea = miArchivo.readlines()
#         print("===================================")
#         print("      abrio bien ejemplo 3"         )
#         print(linea)
#         miArchivo.close()
#         print("===================================")
#     except IOError:
#         print('Archivo no encontrado')
# ejemplo3()

#   En el siguiente ejemplo, vamos a hacer que el programa lea una línea al tiempo.
#   y cree una matriz
def ejemplo4():
    try:
        matriz = []
        miArchivo = open(ruta, 'r')
        print("===================================")
        print("      abrio bien ejemplo 4"         )
        linea = miArchivo.readline()
        fila = linea.rstrip('\n').split(',')
        matriz.append(fila)
        print(matriz)
        while linea:
            linea = miArchivo.readline()
            if linea:
                fila = linea.rstrip('\n').split(',')
                matriz.append(fila)
        print(matriz)
        miArchivo.close()
        print("===================================")
    except IOError:
        print("Archivo no encontrado")
ejemplo4()

#   abrir un archivo para escritura modo = w
#   De sólo escritura (w). El archivo es truncado (vaciado) si existe, y si no se crea.
# def ejemplo5():
#     try:
#         miArchivo = open('nuevo.txt', 'w')
#         print("===================================")
#         print("      abrio bien ejemplo 5"         )
#         miArchivo.write("Hola esta es una linea nueva con copia")
#         miArchivo.close()
#         print("===================================")
#     except IOError:
#         print('Archivo no encontrado')
#ejemplo5()

#   abrir un archivo para lectura y escritura modo = r+
#   hay que tener en cuenta que cuando se escribe en el archivo EL CURSOR SE MUEVE O SE UBICA AL FINAL
#   Hay que volverlo a colocar en la posicion 0
#   seek(0)
# def ejemplo6():
#     try:
#         miArchivo = open('nuevo.txt', 'r+')
#         print("===================================")
#         print("      abrio bien ejemplo 6"         )
#         miArchivo.write("Hola esta es una linea nueva con copia de escritura y lectura")
#         miArchivo.seek(0) # Hay que volverlo a colocar AL CURSOR en la posicion 0
#         print(miArchivo.read())
#         miArchivo.close()
#         print("===================================")
#     except IOError:
#         print('Archivo no encontrado')
# ejemplo6()

#  Recorrer el archivo linea por linea
#  usanfo FOR
# def ejemplo7():
#     try:
#         miArchivo = open('nuevo.txt', 'r+')
#         print("===================================")
#         print("      abrio bien ejemplo 7"         )
#         for linea in miArchivo.readlines():
#             print(linea)
#         miArchivo.close()
#         print("===================================")
#     except IOError:
#         print('Archivo no encontrado')
# ejemplo7()
#  Pide los nombres de ciudades (una por una) y los va escribiendo en un archivo de texto
#  write
# ejemplo
#   calí
#   barranquilla
#   Bogotá
# se deja de escribir cuando el usuario digite cero
# def ejemplo8():
#     try:
#         with  open('ciudades.txt', 'w', encoding='utf-8') as miArchivo:
#             print("===================================")
#             print("      abrio bien ejemplo 8         ")
#             while True:
#                 ciudad = input("Digite el nombre de ciudad. Para terminar 0  ")
#                 if ciudad != "0":
#                     miArchivo.write(ciudad)
#                     miArchivo.write('\n')
#                 else:
#                     break
#             miArchivo.close()
#             print("===================================")
#     except IOError:
#         print('Archivo no encontrado')
# ejemplo8()
#  Pide datos y los va escribiendo en un archivo de texto
#  pero la idea es que escriba al final del archivo la nueva linea
#  write y modo = a
# def ejemplo9():
#     try:
#         with  open('ciudades.txt', 'a', encoding='utf-8') as miArchivo:
#             print("===================================")
#             print("      abrio bien ejemplo 9         ")
#             while True:
#                 ciudad = input("Digite el nombre de ciudad. Para terminar 0")
#                 if ciudad != "0":
#                     miArchivo.write(ciudad)
#                     miArchivo.write('\n')
#                 else:
#                     break
#             miArchivo.close()
#             print("===================================")
#     except IOError:
#         print('Archivo no encontrado')
# ejemplo9()
#  escribir en un archivo : listas , tuplas, ...
#  writelines : metodo usado para escribir en un archivo tipos de datos secuenciales
#  con el modo de apertuta = a . nos permite escribir y graba la informacion al final de la anterior
#  este mantiene el archivo PERSISTENCIA EN EL TIEMPO
# def ejemplo10():
#     try:
#         with  open('ciudades.txt', 'a', encoding='utf-8') as miArchivo:
#             print("===================================")
#             print("      abrio bien ejemplo 10         ")
#             lista = []
#             while True:
#                 ciudad = input("Digite el nombre de ciudad. Para terminar 0")
#                 if ciudad != "0":
#                     lista.append(ciudad+'\n')
#                 else:
#                     break
#             print(lista)
#             miArchivo.writelines(lista)
#             miArchivo.close()
#             print("===================================")
#     except IOError:
#         print('Archivo no encontrado')
# ejemplo10()