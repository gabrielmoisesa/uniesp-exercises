nums = []

for i in range (1, 9):
  num = int(input(f"Digite o número {i}: "))
  nums.append(num)

greatest_number = nums[0]
greatest_number_position = 0

for i in range(len(nums)):
  if nums[i] > greatest_number:
    greatest_number = nums[i]
    greatest_number_position = i

print("Maior número:", greatest_number)
print("Posição:", greatest_number_position)
