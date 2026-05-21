def createMatrix(row_size, column_size):
  matrix = []

  for i in range(row_size):
    list = []
    print()
    print(f"Linha {i}")

    for j in range(column_size):
      num = int(input(f"{j} - Digite um valor: "))
      list.append(num)
      
    matrix.append(list)

  print()
  return matrix

def printMatrixTable(matrix):
  for l in matrix:
    print(l)

if __name__ == "__main__":
  matriz = createMatrix(3, 3)
  print()
  printMatrixTable(matriz)