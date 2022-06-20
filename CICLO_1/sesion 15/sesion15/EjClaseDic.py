#
#  MANEJO DE DICCIONARIOS : Es un tipo de coleccion , los elementos se guardan desordenados
#  su principal caracteristica es que cada elemento esta conformado por un par
#  clave : valor donde los valores estan separados por comas
#
# diccionario ={} # Inicializarla vacia
# diccionario={"azul":"blue" , "rojo":"red" , "verde":"green" , "amarillo":"yellow" } # se pueden inicializar con datos
# print(len(diccionario))
# color = diccionario["amarillo"]
# print(color)
# diccionario["nuevo"]=100 # para ageregar un dato o valor al diccionario. clave nueva = valor nuevo
# print(diccionario) # para imprimir el diccionario
# print(diccionario["rojo"]) # para imprimir el valor de una clave especifica
# diccionario["azul"]="BLUE" # para modificar un valor de una clave
# print(diccionario) # para imprimir el diccionario
# del(diccionario["verde"]) # para eliminar un valor del diccionario
# # Armar una agenda usando diccionarios y listas
# # la clave del diccionario es el nombre de la persona
# # el valor es una lista la cual almacena : edad , estatura
# agenda={"Hugo":[25,1.45] , "Paco":[30,1.65] , "Luis":[68,1.80] } # diccionarios donde el valor es una lista
# print(agenda)
# dicagenda={"Hugo":{"Edad":25,"Estatura":1.45} , "Paco":{"Edad":34,"Estatura":1.55} , "Luis":{"Edad":5,"Estatura":1.05} } # diccionarios donde el valor es otro diccionario
# print(dicagenda)

#================================================================================================

#
#  MANEJO DE DICCIONARIOS : Es un tipo de coleccion , los elementos se guardan desordenados
#  su principal caracteristica es que cada elemento esta conformado por un par
#  clave : valor donde los valores estan separados por comas
#
# diccionario ={} # Inicializarla vacia
# diccionario={"azul":"blue" , "rojo":"red" , "verde":"green" , "amarillo":"yellow" } # se pueden inicializar con datos
# print(len(diccionario))
# print(diccionario)
# color = diccionario["amarillo"]
# print(color)
# diccionario["nuevo"]=100 # para ageregar un dato o valor al diccionario. clave nueva = valor nuevo
# print(diccionario) # para imprimir el diccionario
# print(diccionario["rojo"]) # para imprimir el valor de una clave especifica
# diccionario["azul"]="BLUE" # para modificar un valor de una clave
# print(diccionario) # para imprimir el diccionario
# del(diccionario["verde"]) # para eliminar un valor del diccionario
# print(diccionario) # para imprimir el diccionario
# # Armar una agenda usando diccionarios y listas
# # la clave del diccionario es el nombre de la persona
# # el valor es una lista la cual almacena : edad , estatura
# agenda={"Hugo":[25,1.45] , "Paco":[30,1.65] , "Luis":[68,1.80] } # diccionarios donde el valor es una lista
# print(agenda)
# dicagenda={"Hugo":{"Edad":25,"Estatura":1.45} , "Paco":{"Edad":34,"Estatura":1.55} , "Luis":{"Edad":5,"Estatura":1.05} } # diccionarios donde el valor es otro diccionario
# print(dicagenda)


#================================================================================================================================   ======================

#
#  MANEJO DE DICCIONARIOS : Es un tipo de coleccion , los elementos se guardan desordenados
#  su principal caracteristica es que cada elemento esta conformado por un par
#  clave : valor donde los valores estan separados por comas
#
diccionario ={} # Inicializarla vacia
diccionario={"azul":"blue" , "rojo":"red" , "verde":"green" , "amarillo":"yellow" } # se pueden inicializar con datos
print(len(diccionario))
print(diccionario)
color = diccionario["amarillo"]
print(color)
diccionario["nuevo"]=100 # para ageregar un dato o valor al diccionario. clave nueva = valor nuevo
print(diccionario) # para imprimir el diccionario
print(diccionario["rojo"]) # para imprimir el valor de una clave especifica
diccionario["azul"]="BLUE" # para modificar un valor de una clave
print(diccionario) # para imprimir el diccionario
del(diccionario["verde"]) # para eliminar un valor del diccionario
print(diccionario) # para imprimir el diccionario
# Armar una agenda usando diccionarios y listas
# la clave del diccionario es el nombre de la persona
# el valor es una lista la cual almacena : edad , estatura
agenda={"Hugo":[25,1.45] , "Paco":[30,1.65] , "Luis":[68,1.80] } # diccionarios donde el valor es una lista
print(agenda)
dicagenda={"Hugo":{"Edad":25,"Estatura":1.45} , "Paco":{"Edad":34,"Estatura":1.55} , "Luis":{"Edad":5,"Estatura":1.05} } # diccionarios donde el valor es otro diccionario
print(dicagenda)
datos = agenda["Hugo"]
print(datos)
EdadHugo = datos[0]
print(EdadHugo)
datos = dicagenda["Hugo"]
print(datos)
EdadHugo = datos["Edad"]
print(EdadHugo)
