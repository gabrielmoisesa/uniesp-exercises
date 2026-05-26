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

if __name__ == "__main__":
  notas = create_list(5, float)
  print(get_average(notas))