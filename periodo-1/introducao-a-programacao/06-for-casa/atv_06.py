highest_number = 0

for i in range(1, 9):
  num = int(input(f"{i} - Digite um número inteiro: "))

  if num > highest_number:
    highest_number = num

print("O maior número digitado foi", highest_number)