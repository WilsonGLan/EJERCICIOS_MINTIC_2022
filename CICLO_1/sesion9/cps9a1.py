
def imprimaProducto(n,p):
    print(f"El producto {n} cuesta ${p}")

def caja():
    total = 0
    while True:
        nombre = input("Nombre del producto del producto: ")
        precio_producto = float(input("Precio: "))
        total += precio_producto
        imprimaProducto(nombre,precio_producto)
        continuar = input("Digite S para ingresar más productos o N para terminar: ")
        if continuar.upper() != 'S':
            print(f"El total de la compra es ${total}")
            break

caja()