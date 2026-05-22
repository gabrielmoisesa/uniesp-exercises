def verificar_situacao(media):
  if media >= 7:
    print("Aprovado!")
  else:
    print("Reprovado!")

verificar_situacao(float(input("Digite a média: ")))
