from atv_01 import create_matrix
from atv_05 import get_matrix_main_diagonal

matriz = create_matrix(3, 3)
diagonal_principal = get_matrix_main_diagonal(matriz)
soma_diagonal = sum(diagonal_principal)

print("A soma dos valores da diagonal principal é:", soma_diagonal)