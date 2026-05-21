from atv_01 import create_matrix

def get_matrix_even_amount(matrix):
  even_counter = 0

  for l in matrix:
    for v in l:
      if v % 2 == 0:
        even_counter += 1
  
  return even_counter

if __name__ == "__main__":
  matriz = create_matrix(3, 3)
  matriz_pares = get_matrix_even_amount(matriz)

  print(f"Existem {matriz_pares} números pares na matriz.")
