contador_par = 0
contador_impar = 0

for i in range(10):
  num = int(input("Digite um número inteiro: "))

  if num % 2 == 0:
    contador_par += 1
    print(num, "é par!")
  else:
    contador_impar += 1
    print(num, "é ímpar!")

print("Quantidade de números pares:", contador_par)
print("Quantidade de números ímpares:", contador_impar)