nums = []

for i in range(1, 8):
    num = float(input(f"Digite o número {i}: "))
    nums.append(num)

least_number = nums[0]

for num in nums:
    if num < least_number:
        least_number = num

print(least_number)