media = 0

for i in range(1, 11):
  num = int(input(f"{i} - Digite um número inteiro: "))
  if num > 0:
    media += num

if media > 0:
  media = media / 10
  print("A média é:", media)
else:
  print("Não foi possível calcular a média.")