from atv_01 import create_matrix

def get_matrix_max(matrix):
  greatest_number = matrix[0][0]

  for l in matrix:
    for v in l:
      if v > greatest_number:
        greatest_number = v
  
  return greatest_number


if __name__ == "__main__":
  matriz = create_matrix(3, 3)
  maior_valor = get_matrix_max(matriz)

  print(f"O maior valor da matriz é {maior_valor}")
