# Calcular el fibonacci de un número

N = int(input("Cual es el número limite: "))
number1 = 0
number2 = 1
number3 = 0

for i in range(N):
    print(number3)
    number3 = number1 + number2
    number2 = number1
    number1 = number3
