matriz = []

def createMatrix(row_size, column_size):
  for i in range(row_size):
    list = []
    print()
    print(f"Linha {i}")

    for j in range(column_size):
      num = int(input(f"{j} - Digite um valor: "))
      list.append(num)

    matriz.append(list)

def printMatrixTable(matrix):
  for l in matrix:
    print(l)

createMatrix(3, 3)
print()
printMatrixTable(matriz)