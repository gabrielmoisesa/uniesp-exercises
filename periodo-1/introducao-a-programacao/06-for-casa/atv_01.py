num = int(input("Digite um número inteiro: "))

for i in range(1, 11):
  if num % i == 0:
    print(i, "é divisor de", num)
