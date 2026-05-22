from atv_01 import create_matrix, print_matrix_table

matriz = create_matrix(3, 3)
print_matrix_table(matriz)

print("Somas:")
for l in matriz:
  print(sum(l))
