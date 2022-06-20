



while True:
    try:
        x = int(input("Ingresa un número entero: "))
        break

    except ValueError:
        print("Error en los datos, debe ser un número entero")

#===================================================================

#
# Manejo de excepcione
#
# La declaración try funciona de la siguiente manera:
# Primero, se ejecuta la cláusula try (la(s) linea(s) entre
#         las palabras reservadas try y la except).
# Si no ocurre ninguna excepción, la cláusula except se omite y la
#         ejecución de la cláusula try finaliza.
# Si ocurre una excepción durante la ejecución de la cláusula try
#         el resto de la cláusula se omite. Entonces,
#         si el tipo de excepción coincide con la excepción indicada
#         después de la except, la cláusula except se ejecuta,
#         y la ejecución continua después de la try.
# Si ocurre una excepción que no coincide con la indicada en la cláusula except
#         se pasa a los try más externos; si no se encuentra un gestor,
#         se genera una unhandled exception (excepción no gestionada)
#         y la ejecución se interrumpe con un mensaje como el que se muestra arriba.
def except1():
    while True:
        try:
            x = int(input("Please enter a number: "))
            break
        except:
            print("Error digite solo numero.")
#except1()
# Los gestores de excepciones no se encargan solamente de las excepciones
# que ocurren en el bloque try,
# también gestionan las excepciones que ocurren dentro de las funciones
# que se llaman (inclusive indirectamente) dentro del bloque try. Por ejemplo:
def divisioncero():
    x = 1/0
def except2():
    try:
        divisioncero()
    except ZeroDivisionError as err:
        print('Error division entre cero.', err)
#except2()
# EXCEPCIONES MULTIPLES
# Gracias a los identificadores de errores podemos crear múltiples comprobaciones,
# siempre que dejemos en último lugar la excepción por defecto
# Excepcion que engloba cualquier tipo de error
# (si la pusiéramos al principio las demas excepciones nunca se ejecutarían):
def except3():
    try:
        n = float(input("Introduce un número divisor: "))
        5/n
    except TypeError:
        print("No se puede dividir el número entre una cadena")
    except ValueError:
        print("Debes introducir una cadena que sea un número")
    except ZeroDivisionError:
        print("No se puede dividir por cero, prueba otro número")
    except (ValueError, TypeError):
        print("Ha ocurrido un error")
    except Exception as e:
        print("Ha ocurrido un error no previsto", type(e).__name__ )
#except3()
# CUANDO NO SE COLOCA IDENTIFICADOR DE ERRORES
# Una sentencia except sin niguna excepción especificada atrapara a
# todos los errores. Estos deben utilizarse con errores inesperados
# y esconder errores de programación.
def except4():
    try:
        string = "Hola"
        print(string / 0)
    except:
        print("Ha ocurrido un error")
#except4()
# Finally:
# Para asegurar que algún código se ejecute no importar cuál error ocurra,
# puedes utilizar la sentencia finally. La sentencia finally se coloca en el
# fondo de una sentencia try/except. El código dentro de una sentencia
# finally siempre se ejecuta luego del código en los bloques
# try y posiblemente en los bloques except también.
def except5():
    try:
        print("Hola")
        print(1/0)
    except ZeroDivisionError:
        print("División entre cero")
    finally:
        print("Este código se ejecutara sin importar nada")
#except5()
# Uso de ELSE
# Dicho bloque se ejecutará si no ha ocurrido ninguna excepción.
# Fíjate en la diferencia entre los siguientes códigos.
def NoExcept():
    try:
        # Forzamos una excepción al dividir entre 0
        # Entra en except, ha ocurrido una excepción
        # NO ENTRA EN EL ELSE
        x = 2/0
    except:
        print("Entra en except, ha ocurrido una excepción")
    else:
        print("Entra en else, no ha ocurrido ninguna excepción")
# Sin embargo en el siguiente código la división se puede
# realizar sin problema, por lo que el bloque except no se ejecuta
# pero el else si es ejecutado.
# Entra en else, no ha ocurrido ninguna excepción
def ExceptElse():
    try:
        # La división puede realizarse sin problema
        x = 2/2
    except:
        print("Entra en except, ha ocurrido una excepción")
    else:
        print("Entra en else, no ha ocurrido ninguna excepción")
#================================================================================
# Uso de finally
# Dicho bloque se ejecuta siempre, haya o no haya habido excepción.
# Este bloque se suele usar si queremos ejecutar algún tipo de acción de limpieza.
# Si por ejemplo estamos escribiendo datos en un fichero pero ocurre una excepción,
# tal vez queramos borrar el contenido que hemos escrito con anterioridad,
# para no dejar datos inconsistenes en el fichero.
#================================================================================
def Exceptfinally():
    try:
        # Forzamos excepción
        x = 2/0
    except:
        # Se entra ya que ha habido una excepción
        print("Entra en except, ha ocurrido una excepción")
    finally:
        # También entra porque FINALLA ES EJECUTADO SIEMPRE
        print("Entra en finally, se ejecuta el bloque finally")
#Exceptfinally()
# Ejemplos de finally
# Un ejemplo muy típico de excepciones es en el manejo de ficheros.
# Se intenta abrir, pero se captura una posible excepción.
# De hecho si entras en la documentación de open se indica que
# OSError es lanzada si el fichero no puede ser abierto.
def Except6():
    try:
        with open('fichero.txt') as file:
            read_data = file.read()
    except OSError:
        # Se entra aquí si no pudo ser abierto
        print('No se pudo abrir')
def Except7():
    try:
        # Se fuerza excepción
        x = 2/0
    except:
        print("Entra en except, ha ocurrido una excepción")
    else:
        print("Entra en el else, no ha ocurrido ninguna excepción")
    finally:
        print("Entra en finally SIEMPRE, se ejecuta el bloque finally")
# =========================================================================