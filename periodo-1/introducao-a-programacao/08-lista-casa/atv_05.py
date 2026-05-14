nums = []

for i in range (1, 9):
  num = float(input(f"Digite o número {i}: "))
  nums.append(num)

is_there_repetitive = False

for num in nums:
  if nums.count(num) > 1:
    is_there_repetitive = True

if is_there_repetitive:
  print("Existem números repetidos.")
else:
  print("Não existem números repetidos.")