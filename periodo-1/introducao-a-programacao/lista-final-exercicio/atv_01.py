def createList(size, type=str):
  list = []

  for i in range(1, size + 1):
    if type == int:
      item = int(input(f"{i} - Digite um número inteiro: "))
    elif type == float:
      item = int(input(f"{i} - Digite um número decimal: "))
    else:
      item = input(f"{i} - Digite um texto: ")
    
    list.append(item)
  
  return list