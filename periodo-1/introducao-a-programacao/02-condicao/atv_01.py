idade = int(input("Digite sua idade: "))

if idade >= 16:
    print("Você pode votar!")
elif idade < 16:
    print("Você não pode votar!")
else:
    print("Idade inválida!")