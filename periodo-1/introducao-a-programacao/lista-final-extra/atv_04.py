from atv_01 import create_list, get_average

nums = create_list(15, int)
pares_especiais = []

for num in nums:
  if num % 2 == 0 and num > 10:
    pares_especiais.append(num)

print("Soma dos pares especiais:", sum(pares_especiais))
print("Quantidade de números somados:", len(pares_especiais))
print("Média:", get_average(pares_especiais))