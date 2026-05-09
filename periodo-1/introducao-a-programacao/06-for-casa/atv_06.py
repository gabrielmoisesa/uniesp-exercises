highest_number = int(input(f"1 - Digite um número inteiro: "))

for i in range(2, 9):
  num = int(input(f"{i} - Digite um número inteiro: "))

  if num > highest_number:
    highest_number = num

print("O maior número digitado foi", highest_number)