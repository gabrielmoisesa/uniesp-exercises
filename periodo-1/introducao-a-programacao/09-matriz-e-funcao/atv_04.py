from atv_01 import create_matrix

def get_matrix_min(matrix):
  lowest_number = matrix[0][0]

  for l in matrix:
    for v in l:
      if v < lowest_number:
        lowest_number = v
  
  return lowest_number


if __name__ == "__main__":
  matriz = create_matrix(3, 3)
  menor_valor = get_matrix_min(matriz)

  print(f"O menor valor da matriz é {menor_valor}")
