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

def get_lowest_number(numbers):
  lowest_num = numbers[0]

  for i in numbers:
    if i < lowest_num:
      lowest_num = i
  
  return lowest_num

def get_above_average(numbers, average):
  above_average = []

  for i in numbers:
    if i > average:
      above_average.append(i)
  
  return above_average

if __name__ == "__main__":
  notas = create_list(5, float)
  print(get_above_average(notas, 7))