matriz = []

def createMatrix(size):
  for i in range(size):
    list = []
    print()
    print(f"Linha {i}")

    for j in range(size):
      num = int(input(f"{j} - Digite um valor: "))
      list.append(num)

    matriz.append(list)

def printMatrixTable(matrix):
  for l in matrix:
    print(l)

createMatrix(3)
print()
printMatrixTable(matriz)