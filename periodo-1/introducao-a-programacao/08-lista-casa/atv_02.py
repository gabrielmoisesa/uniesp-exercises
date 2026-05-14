nums = []

for i in range (1, 11):
  num = float(input(f"Digite o número {i}: "))
  nums.append(num)

nums_even = []
nums_odd = []

for num in nums:
  if num % 2 == 0:
    nums_even.append(num)
  else:
    nums_odd.append(num)

print("Lista original:", nums)
print("Pares:", nums_even)
print("Ímpares:", nums_odd)
