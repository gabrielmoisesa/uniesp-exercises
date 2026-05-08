valor_hora = float(input("Digite o valor da sua hora: "))
qtd_hora = int(input("Digite a quantidade de horas trabalhadas no mês: "))

salario_bruto = valor_hora * qtd_hora
desconto_INSS = salario_bruto * 0.1
desconto_FGTS = salario_bruto * 0.11

if salario_bruto <= 900:
    valor_IR = 0
    desconto_IR = salario_bruto * (valor_IR / 100)
    desconto_total = desconto_IR + desconto_INSS + desconto_FGTS
    salario_liquido = salario_bruto - desconto_total

    print("Salário Bruto:", "R$", salario_bruto)
    print("IR", "(" + str(valor_IR) + "%):", "R$", desconto_IR)
    print("INSS (10%):", "R$", desconto_INSS)
    print("FGTS (11%):", "R$", desconto_FGTS)
    print("Total de descontos:", "R$", desconto_total)
    print("Salário Líquido:", "R$", salario_liquido)
elif salario_bruto > 900 and salario_bruto <= 1500:
    valor_IR = 5
    desconto_IR = salario_bruto * (valor_IR / 100)
    desconto_total = desconto_IR + desconto_INSS + desconto_FGTS
    salario_liquido = salario_bruto - desconto_total

    print("Salário Bruto:", "R$", salario_bruto)
    print("IR", "(" + str(valor_IR) + "%):", "R$", desconto_IR)
    print("INSS (10%):", "R$", desconto_INSS)
    print("FGTS (11%):", "R$", desconto_FGTS)
    print("Total de descontos:", "R$", desconto_total)
    print("Salário Líquido:", "R$", salario_liquido)
elif salario_bruto > 1500 and salario_bruto <= 2500:
    valor_IR = 10
    desconto_IR = salario_bruto * (valor_IR / 100)
    desconto_total = desconto_IR + desconto_INSS + desconto_FGTS
    salario_liquido = salario_bruto - desconto_total

    print("Salário Bruto:", "R$", salario_bruto)
    print("IR", "(" + str(valor_IR) + "%):", "R$", desconto_IR)
    print("INSS (10%):", "R$", desconto_INSS)
    print("FGTS (11%):", "R$", desconto_FGTS)
    print("Total de descontos:", "R$", desconto_total)
    print("Salário Líquido:", "R$", salario_liquido)
elif salario_bruto > 2500:
    valor_IR = 20
    desconto_IR = salario_bruto * (valor_IR / 100)
    desconto_total = desconto_IR + desconto_INSS + desconto_FGTS
    salario_liquido = salario_bruto - desconto_total

    print("Salário Bruto:", "R$", salario_bruto)
    print("IR", "(" + str(valor_IR) + "%):", "R$", desconto_IR)
    print("INSS (10%):", "R$", desconto_INSS)
    print("FGTS (11%):", "R$", desconto_FGTS)
    print("Total de descontos:", "R$", desconto_total)
    print("Salário Líquido:", "R$", salario_liquido)
else:
    print("Erro!")