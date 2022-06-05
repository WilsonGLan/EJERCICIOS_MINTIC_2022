import random
def numAleatorio():
    while True:
        numA = random.randint(100, 130)
        if numA != 110 or numA != 115 or numA != 120:
            break
    return numA

def numeros():
    conteo = 0
    viene = "par"
    while True:
        aleatorio = numAleatorio()
        #print(aleatorio)
        if conteo < 10:
            if int(aleatorio) % 2 == 0 and str(viene) == "par":
                print(aleatorio)
                conteo += 1
                viene = "impar"
            elif int(aleatorio) % 2 != 0 and str(viene) == "impar":
                print(aleatorio)
                conteo += 1
                viene = "par"
        elif conteo == 10:
            break
numeros()
