from atv_01 import create_matrix, print_matrix_table

def get_matrix_main_diagonal(matrix):
  main_diagonal = []

  for i in range(len(matrix)):
    main_diagonal.append(matrix[i][i])
  
  return main_diagonal

if __name__ == "__main__":
  matriz = create_matrix(3, 3)
  diagonal_principal = get_matrix_main_diagonal(matriz)

  print_matrix_table(matriz)
  print("Os valores da diagonal principal da matriz são:", diagonal_principal)