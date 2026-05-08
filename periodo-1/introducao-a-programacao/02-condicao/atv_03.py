salario = float(input("Digite seu salário: "))

if salario > 2000:
    print("Você recebe acima de R$2000,00.")
elif salario <= 2000:
    print("Você recebe R$2000,00 ou menos.")
else:
    print("Salário inválido!")
