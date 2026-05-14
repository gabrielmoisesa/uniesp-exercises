nums = []
soma = 0

for i in range(1, 6):
    num = int(input(f"Digite o número {i}: "))
    nums.append(num)

for num in nums:
    soma += num

print("O valor da soma total é:", soma)