lowest_number = int(input(f"1 - Digite um número inteiro: "))

for i in range(2, 9):
  num = int(input(f"{i} - Digite um número inteiro: "))

  if num < lowest_number:
    lowest_number = num

print("O menor número digitado foi", lowest_number)