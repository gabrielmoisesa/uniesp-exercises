def create_matrix(row_size, column_size, numeric_type=int):
  matrix = []

  for i in range(row_size):
    list = []
    print()
    print(f"Linha {i}")

    for j in range(column_size):
      if numeric_type == float:
        num = float(input(f"{j} - Digite um valor: "))
      else:
        num = int(input(f"{j} - Digite um valor: "))
      list.append(num)
      
    matrix.append(list)

  print()
  return matrix

def print_matrix_table(matrix):
  for l in matrix:
    print(l)

if __name__ == "__main__":
  matriz = create_matrix(3, 3)
  print()
  print_matrix_table(matriz)