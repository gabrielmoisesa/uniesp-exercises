num = int(input("Digite um número inteiro: "))
ctd_divisor = 0

for i in range(1, 11):
  if num % i == 0:
    ctd_divisor += 1

print(num, "possui", ctd_divisor, "divisores.")
