n = 0 #sucursales
k = 0 # tipos de medicamentos
m = -1   # pacientes
cont = 0
restantes = []
programadas = []
pacientes_x_suc = []
dosis = 0
existencias = []

def menorSuc1(s,matriz):
    menor = matriz[s][0]
    fila = []
    for i in range(n):
        if menor >= matriz[i][s]:
            menor = matriz[i][s]
        fila.append(matriz[i][s])
    return fila.index(menor)+1, menor

def mayorSuc1(s,matriz):
    mayor = matriz[s][0]
    fila = []
    for i in range(n):
        if mayor <= matriz[i][s]:
            mayor = matriz[i][s]
        fila.append(matriz[i][s])
    return fila.index(mayor)+1, mayor

def mayor(s,matriz):
    max = matriz[s][0]
    fila = matriz[s]
    for i in range(k):
        if max == matriz[s][i]:
            continue
        elif max < matriz[s][i]:
            max = matriz[s][i]
    numTM = fila.index(max)+1
    return numTM, max

def menor(s,matriz):
    min = matriz[s][0]
    fila = matriz[s]
    for i in range(k):
        if min == matriz[s][i]:
            continue
        elif min > matriz[s][i]:
            min = matriz[s][i]
    numTM = fila.index(min)+1
    return numTM, min

def calcularProgramadas(s,matriz):
    menorx, menory = menor(s,matriz)
    mayorx, mayory = mayor(s,matriz)
    suma = 0
    prom_pac = 0
    for i in range(k):
        suma += programadas[s][i]
    if pacientes_x_suc[s] == 0:
        prom_pac = 0
    else:
        prom_pac = suma / pacientes_x_suc[s]
    promedio = suma / k
    print(f"{menory:.2f} {promedio:.2f} {mayory:.2f}")
    print(f"{prom_pac:.2f}")


def evaluar_categoria(suc,tMed, mProg):
    restantes[suc-1][tMed-1] -= mProg
    programadas[suc-1][tMed-1] += mProg

def evaluar_presion(suc,tM, mS, s,d):
    if s < 72 and d < 65:
        evaluar_categoria(suc,tM, mS)
    elif s >= 72 and s < 107 and d >= 65 and d < 73:
        evaluar_categoria(suc,tM, 0)
    elif s >= 107 and s < 124 and d >= 73 and d < 81:
        evaluar_categoria(suc,tM, 0)
    elif s >= 124 and s < 138 and d >= 81 and d < 93:
        evaluar_categoria(suc,tM, mS)
    elif s >= 138 and s < 156 and d >= 93 and d < 102:
        evaluar_categoria(suc,tM, mS)
    elif s >= 156 and s < 175 and d >= 102 and d < 114:
        evaluar_categoria(suc,tM, mS)
    elif s >= 175 and d >= 114:
        evaluar_categoria(suc,tM, mS)
    elif s >= 136 and d < 92:
        evaluar_categoria(suc,tM, mS)

# recibe como entrada la cantidad de sucursales (n)
while n <= 0 or k <= 0:
    a, b, c = input().split()
    n = int(a)
    k = int(b)
    m = int(c)

# Se lee cantidad de existencias actuales de todos los tipos de medicamentos

for i in range(n):
    tipo_x_suc = []
    prog_x_suc = []
    pacientes_x_suc.append(0)
    medicamentos = input().split()
    for j in range(k):
        tipo_x_suc.append(int(medicamentos[j]))
        prog_x_suc.append(0)
    existencias.append(tipo_x_suc)
    programadas.append(prog_x_suc)

for i in range(n):
    fila = []
    for j in range(k):
        dato = existencias[i][j]
        fila.append(dato)
    restantes.append(fila)

for i in range(m):
    sucursal, tipoM, medSolic, sistolica, diastolica = input().split()
    if (int(sucursal) > 0 and int(sucursal) <= n) and (int(tipoM) > 0 and int(tipoM) <= k) and int(medSolic) >= 0:
        evaluar_presion(int(sucursal), int(tipoM), int(medSolic), int(sistolica),int(diastolica))
        pacientes_x_suc[int(sucursal)-1] += 1

for i in range(1,n+1):
    print(i)
    a, b = menor(i-1, restantes)
    print(f"{a} {b}")
    a, b = mayor(i-1, restantes)
    print(f"{a} {b}")
    calcularProgramadas(i-1, programadas)
a, b = menorSuc1(0,programadas)
print(f"{a} {b}")
a, b = mayorSuc1(0,programadas)
print(f"{a} {b}")