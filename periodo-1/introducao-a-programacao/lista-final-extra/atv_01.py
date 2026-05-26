def create_list(size, type=str):
  list = []

  for i in range(1, size + 1):
    if type == int:
      item = int(input(f"{i} - Digite um número inteiro: "))
    elif type == float:
      item = float(input(f"{i} - Digite um número decimal: "))
    else:
      item = input(f"{i} - Digite um texto: ")
    
    list.append(item)
  
  print()
  return list

def get_average(averages):
  if len(averages) > 0:
    return sum(averages) / len(averages)
  else:
    return 0

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
  notas_alunos = create_list(10, float)
  media_turma = get_average(notas_alunos)
  maior_nota = get_biggest_number(notas_alunos)
  menor_nota = get_lowest_number(notas_alunos)
  qtd_acima_da_media = len(get_above_average(notas_alunos, media_turma))
  
  qtd_abaixo_de_cinco = 0

  for n in notas_alunos:
    if n < 5:
      qtd_abaixo_de_cinco += 1
  
  print(f"""
  Média da turma: {media_turma}
  Maior nota: {maior_nota}
  Menor nota: {menor_nota}
  Quantidade de alunos acima da média: {qtd_acima_da_media}
  Quantidade de alunos abaixo de 5: {qtd_abaixo_de_cinco}
  """
  )
