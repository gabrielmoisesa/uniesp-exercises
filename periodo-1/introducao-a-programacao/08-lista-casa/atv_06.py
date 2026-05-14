nums = []

for i in range (1, 8):
  num = int(input(f"Digite o número {i}: "))
  nums.append(num)

nums_inverted = []

for i in range(len(nums)):
  i_reverse = (len(nums) - 1) - i
  nums_inverted.append(nums[i_reverse])

print("Lista original:", nums)
print("Lista invertida:", nums_inverted)