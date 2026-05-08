salario = float(input("Digite seu salário: "))
percentual = float
novo_salario = float
valor_aumento = float

if salario <= 280:
    percentual = 20
    novo_salario = salario + (salario * (percentual / 100))
    valor_aumento = novo_salario - salario

    print("Salário antes do reajuste:", "R$", salario)
    print("Percentual de aumento:", str(percentual) + "%")
    print("Valor do aumento:", "R$", valor_aumento)
    print("Salário após o aumento:", "R$", novo_salario)
elif salario >= 280 and salario <= 700:
    percentual = 15
    novo_salario = salario + (salario * (percentual / 100))
    valor_aumento = novo_salario - salario

    print("Salário antes do reajuste:", "R$", salario)
    print("Percentual de aumento:", str(percentual) + "%")
    print("Valor do aumento:", "R$", valor_aumento)
    print("Salário após o aumento:", "R$", novo_salario)
elif salario >= 700 and salario <= 1500:
    percentual = 10
    novo_salario = salario + (salario * (percentual / 100))
    valor_aumento = novo_salario - salario

    print("Salário antes do reajuste:", "R$", salario)
    print("Percentual de aumento:", str(percentual) + "%")
    print("Valor do aumento:", "R$", valor_aumento)
    print("Salário após o aumento:", "R$", novo_salario)
elif salario >= 1500:
    percentual = 5
    novo_salario = salario + (salario * (percentual / 100))
    valor_aumento = novo_salario - salario

    print("Salário antes do reajuste:", "R$", salario)
    print("Percentual de aumento:", str(percentual) + "%")
    print("Valor do aumento:", "R$", valor_aumento)
    print("Salário após o aumento:", "R$", novo_salario)
else:
    print("Erro! Valor inválido.")
