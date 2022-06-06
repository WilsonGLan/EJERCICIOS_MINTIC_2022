n = 0
m = -1
cont = 0
num_n = []
p_x_s = []
dosis = 0

while n <= 0:
    n = int(input())

while m < 0:
    m = int(input())

while n > cont:
    medicamentos = int(input())
    if medicamentos > 0:
        num_n.append(medicamentos)
        cont += 1

for i in range(m):
    a, b, c = input().split()
    sucursal = int(a)
    sistolica = int(b)
    diastolica = int(c)