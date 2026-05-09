num = int(input("Digite um número inteiro: "))

for i in range(1, 21):
  mult = num * i
  if mult % 2 == 0:
    print(f"{num} * {i} = {mult}")
