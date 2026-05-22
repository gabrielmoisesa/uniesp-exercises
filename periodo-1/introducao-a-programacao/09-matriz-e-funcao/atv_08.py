from atv_01 import create_matrix

def get_matrix_greater_than_ten(matrix):
  counter = 0

  for l in matrix:
    for v in l:
      if v > 10:
        counter += 1
  
  return counter

if __name__ == "__main__":
  matriz = create_matrix(3, 3)
  matriz_maiores_que_dez = get_matrix_greater_than_ten(matriz)

  print("Existem", matriz_maiores_que_dez, "número(s) maiores que 10 na matriz.")