import math

num = int(input("Digite um número inteiro: "))

if num < 2:
  print(num, "não é primo")
else:
  rq_num = int(math.sqrt(num))
  primo = True

  for i in range(2, rq_num + 1):
    if num % i == 0:
      primo = False
  
  if primo:
    print(num, "é primo")
  else:
    print(num, "não é primo")