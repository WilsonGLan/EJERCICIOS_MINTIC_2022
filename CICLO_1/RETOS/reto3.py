n = 0
m = -1
cont = 0
num_n = []
p_x_s = []
dosis = 0
existencias = []

def mayor(existencias):
    max = existencias[0]
    for i in range(len(existencias)):
        if max <= existencias[i]:
            max = existencias[i]
            suc = i+1
    print(f"{suc} {max}")

def menor(existencias):
    min = existencias[0]
    for i in range(len(existencias)):
        if min >= existencias[i]:
            min = existencias[i]
            suc = i+1
    print(f"{suc} {min}")

def proporcion(existencias,num_n):
    for i in range(len(existencias)):
        porcentaje = 100 - ((existencias[i]*100) / num_n[i])
        print(f"{i+1} {porcentaje:.2f}%")

def evaluar_dosis(sucursal,total_dosis, dosis):
    inventario = total_dosis-dosis
    existencias.insert(sucursal,inventario)
    existencias.pop(sucursal+1)

def evaluar_categoria(suc,num_dosis):
    for i in range(len(num_n)):
        if suc-1 == i:
            evaluar_dosis(i,existencias[i],num_dosis)

def evaluar_presion(suc,s,d):
    if s < 72 and d < 65:
        evaluar_categoria(suc,4)
    elif s >= 72 and s < 107 and d >= 65 and d < 73:
        evaluar_categoria(suc,0)
    elif s >= 107 and s < 124 and d >= 73 and d < 81:
        evaluar_categoria(suc,0)
    elif s >= 124 and s < 138 and d >= 81 and d < 93:
        evaluar_categoria(suc,2)
    elif s >= 138 and s < 156 and d >= 93 and d < 102:
        evaluar_categoria(suc,4)
    elif s >= 156 and s < 175 and d >= 102 and d < 114:
        evaluar_categoria(suc,8)
    elif s >= 175 and d >= 114:
        evaluar_categoria(suc,16)
    elif s >= 136 and d < 92:
        evaluar_categoria(suc,12)

while n <= 0:
    a, b = input().split()
    n = int(a)
    m = int(b)

while n > cont:
    medicamentos = int(input())
    if medicamentos > 0:
        num_n.append(medicamentos)
        cont += 1

existencias = num_n[:]

for i in range(m):
    sucursal, sistolica, diastolica = input().split()
    evaluar_presion(int(sucursal),int(sistolica),int(diastolica))

menor(existencias)
mayor(existencias)
proporcion(existencias, num_n)


