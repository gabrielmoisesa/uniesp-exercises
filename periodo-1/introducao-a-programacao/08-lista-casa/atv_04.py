nums = []

for i in range (1, 11):
  num = float(input(f"Digite o número {i}: "))
  nums.append(num)

nums_positives = []
nums_negatives = []
nums_zeros = []

for num in nums:
  if num > 0:
    nums_positives.append(num)
  elif num < 0:
    nums_negatives.append(num)
  else:
    nums_zeros.append(num)

print("Lista de números:", nums)
print("Quantidade de positivos:",len(nums_positives))
print("Quantidade de negativos:",len(nums_negatives))
print("Quantidade de zeros:",len(nums_zeros))