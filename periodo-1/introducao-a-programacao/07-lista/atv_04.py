nums = []

for i in range(1, 6):
    num = float(input(f"Digite o número {i}: "))
    nums.append(num)

greater_than_ten = []

for num in nums:
    if num > 10:
        greater_than_ten.append(num)

print("Os números maiores do que 10 da lista:", nums, "são", greater_than_ten)