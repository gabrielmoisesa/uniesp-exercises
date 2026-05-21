from atv_01 import create_matrix

def sum_matrix(matrix):
  total = 0

  for l in matrix:
    for v in l:
      total += v
  
  return total

if __name__ == "__main__":
  matriz = create_matrix(2, 3)
  soma = sum_matrix(matriz)

  print(f"Soma total da matriz: {soma}")