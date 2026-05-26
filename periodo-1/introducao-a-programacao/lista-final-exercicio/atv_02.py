from atv_01 import create_list

def situacao_aluno(media):
  if media >= 7:
    return "Aprovado"
  elif media >= 5 and media < 7:
    return "Recuperação"
  else:
    return "Reprovado"

nomes = create_list(8)
medias = create_list(8, float)

print("Relatório final:")

for i in range(8):
  print("\nNome do aluno:", nomes[i])
  print("Média:", medias[i])
  print(f"Situação: {situacao_aluno(medias[i])}")