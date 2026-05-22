def verificar_idade(idade):
  if idade >= 18:
    print("Maior de idade")
  else:
    print("Menor de idade")

user_age = int(input("Digite sua idade: "))
verificar_idade(user_age)