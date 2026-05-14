nums = []

for i in range (1, 11):
  num = float(input(f"Digite o número {i}: "))
  nums.append(num)

num_to_search = float(input("Digite um número para buscar: "))
num_search_count = nums.count(num_to_search)

print(f"O número {num_to_search} aparece {num_search_count} vezes.")