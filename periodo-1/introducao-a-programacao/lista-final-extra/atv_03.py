from atv_01 import create_list

lista_sequencia = create_list(10, int)

contador_sequencia = 1
maior_sequencia = 1

for i in range(9):
  if lista_sequencia[i] > lista_sequencia[i - 1]:
    contador_sequencia += 1
  else:
    contador_sequencia = 1
  
  if contador_sequencia > maior_sequencia:
    maior_sequencia = contador_sequencia

print(maior_sequencia)