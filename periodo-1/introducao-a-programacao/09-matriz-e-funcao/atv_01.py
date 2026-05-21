matriz = []

for i in range(3):
  lista = []

  print(f"Linha {i}")
  for j in range(3):
    num = int(input(f"{j} - Digite um valor: "))
    lista.append(num)

  matriz.append(lista)

for l in matriz:
  print(l)
