nums = []

for i in range (1, 11):
  num = float(input(f"Digite o número {i}: "))
  nums.append(num)

even_sum = 0
odd_sum = 0

for num in nums:
  if num % 2 == 0:
    even_sum += num
  else:
    odd_sum += num

print("Lista de números:", nums)
print("Soma dos pares:", even_sum)
print("Soma dos ímpares:", odd_sum)
