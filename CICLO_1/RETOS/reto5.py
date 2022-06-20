'''
el sistema debe leer la información del archivo data.csv, que contiene los siguientes campos / columnas:
●	first_name: El primer nombre del paciente.
●	last_name: El primer apellido del paciente.
●	gender: El género del paciente (‘m’ para hombres o ‘f’ para mujeres).
●	city_name: El nombre de la ciudad donde se encuentra la sucursal.
●	department_name: El nombre del departamento donde se encuentra la sucursal.
●	id_branch: El número identificador de la sucursal (entre 1 y 32).
●	medicine_type: El tipo de medicamento que la persona está solicitando (entre 1 y 20).
●	medicine_quantity: Cantidad de existencias que el paciente está solicitando.
●	systolic_pressure: El valor de la presión sistólica del paciente.
●	diastolic_pressure: El valor de la presión diastólica del paciente.

'''

ruta = "D:/00_CURSOS/MINTIC/PROGRAMACION_BASICA/EJERCICIOS_MINTIC_2022/CICLO_1/RETOS/data.csv"

def leerArchivo():
        with open(ruta, 'r') as datafile:
                linea= datafile.readline()
                encabezado= linea.rstrip('\n').split(',')
                matriz= []
                sucursales= [' ']*32
                linea = datafile.readline()
                while linea:
                        fila = linea.rstrip('\n').split(',')
                        sucursales[int(fila[5])-1]= fila[3]+ " " + fila[4]
                        matriz.append(fila)
                        linea = datafile.readline()
        return matriz, sucursales, encabezado