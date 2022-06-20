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
#   Archivo de texto llamado nuevo.txt con numeros
#   Ahora vamos a leer la información del archivo usando la función read().
#   read() Lee todo el archivo
def ejemplo1():
    try:
        miarchivo=open("nuevo.txt")
        linea=miarchivo.read()
        print("===================================")
        print("      abrio bien ejemplo 1"         )
        print(linea)
        print("===================================")
    except:
        print("Archivo no encontrado")
ejemplo1()
#   En el siguiente ejemplo, vamos a hacer que el programa
#   lea una línea al tiempo es decir una a la vez.
#   readline() Lee linea por linea
def ejemplo2():
    try:
        miArchivo = open('matrizAsignacion.txt', 'r')
        linea = miArchivo.readline()
        print("===================================")
        print("      abrio bien ejemplo 2"         )
        print(linea)
        print("Lei la primera línea. Vamos a la segunda")
        linea = miArchivo.readline()
        print(linea)
        miArchivo.close()
        print("===================================")
    except IOError:
        print("Archivo no encontrado")
#ejemplo2()