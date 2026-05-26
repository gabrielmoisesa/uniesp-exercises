def create_list(size, type=str):
  list = []

  for i in range(1, size + 1):
    if type == int:
      item = int(input(f"{i} - Digite um número inteiro: "))
    elif type == float:
      item = int(input(f"{i} - Digite um número decimal: "))
    else:
      item = input(f"{i} - Digite um texto: ")
    
    list.append(item)
  
  print()
  return list

def get_average(averages):
  return sum(averages) / len(averages)

def get_biggest_number(numbers):
  biggest_num = numbers[0]

  for i in numbers:
    if i > biggest_num:
      biggest_num = i
  
  return biggest_num

if __name__ == "__main__":
  notas = create_list(5, float)
  print(get_biggest_number(notas))