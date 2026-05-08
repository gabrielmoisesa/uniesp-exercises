ctd_positivo = 0
ctd_negativo = 0
ctd_zeros = 0

for i in range(10):
    num = int(input("Digite um número inteiro: "))

    if num > 0:
        ctd_positivo += 1
    elif num < 0:
        ctd_negativo += 1
    elif num == 0:
        ctd_zeros += 1
    else:
        print("Erro!")

print("Quantidade de positivos:", ctd_positivo)
print("Quantidade de negativos:", ctd_negativo)
print("Quantidade de zeros:", ctd_zeros)
