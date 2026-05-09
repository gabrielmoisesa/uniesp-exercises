num = int(input("Digite um número inteiro: "))
antecessor = num - 1
mult = num
fatorial = 1

for i in range(num):
  if antecessor > 0:
    fatorial = fatorial * mult * antecessor
    mult -= 2
    antecessor -= 2

print("O fatorial de", num, "é:", fatorial)