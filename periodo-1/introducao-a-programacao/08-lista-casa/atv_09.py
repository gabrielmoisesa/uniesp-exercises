nums = []

for i in range (1, 9):
  num = float(input(f"Digite o número {i}: "))
  nums.append(num)

nums_greater_than_ten = []

for num in nums:
  if num > 10:
    nums_greater_than_ten.append(num)

print("Lista original:", nums)
print("Números maiores que 10:", nums_greater_than_ten)
