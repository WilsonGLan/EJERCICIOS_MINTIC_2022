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

ruta = "data.csv"

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

def main():
    # Arreglos de datos que se obtienen de la funcion
    pacientes, centrales, columnas= leerArchivo()

    # Obtiene los indices de las columnas utilizadas en el proceso
    i_gender = columnas.index('gender')
    i_branch = columnas.index('id_branch')
    i_ps = columnas.index('systolic_pressure')
    i_pd = columnas.index('diastolic_pressure')
    i_qm = columnas.index('medicine_quantity')
    hombres = 0
    mujeres = 0
    len_pacientes = len(pacientes)
    cant_med = 0

    # Capturar la central ingresada como Entrada
    input_central= int(input())
    #
    for i in range(len_pacientes):
        if int(pacientes[i][i_branch]) == input_central:
            entrega= False
            sis, dia = int(pacientes[i][i_ps]), int(pacientes[i][i_pd])
            if sis < 91 and dia < 63:
                entrega= True
            elif 162 <= sis < 188 and 105 <= dia < 119:
                entrega= True
            elif 188 <= sis < 201 and 119 <= dia < 126:
                entrega= True
            elif 201 <= sis < 214 and 126 <= dia < 146:
                entrega= True
            elif sis >= 214 and dia >= 146:
                entrega= True
            elif sis >= 152 and dia < 77:
                entrega= True
            else:
                entrega= False

            if entrega:
                if pacientes[i][i_gender]=='m':
                    hombres += 1
                else :
                    mujeres += 1

                # Acumula Cantidad Total de Medicamentos solicitados por el Cliente
                cant_med += int(pacientes[i][i_qm])

    # Salidas esperadas
    print(f"{input_central} {centrales[input_central-1]}")
    print("scheduled patients")
    print(f'male {hombres}')
    print(f'female {mujeres}')
    print(f'total {hombres+mujeres}')
    print('scheduled medicine quantity')
    print('mean {:.2f}'.format(cant_med/(hombres+mujeres)))
    print(f'total {cant_med}')

if __name__=='__main__':
    main()