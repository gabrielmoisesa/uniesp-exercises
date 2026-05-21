from atv_01 import createMatrix

def sumMatrix(matrix):
  total = 0

  for l in matrix:
    for v in l:
      total += v
  
  return total

if __name__ == "__main__":
  matriz = createMatrix(2, 3)
  soma = sumMatrix(matriz)

  print(f"Soma total da matriz: {soma}")