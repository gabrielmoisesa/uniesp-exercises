nota = float(input("Digite sua nota: "))

if nota >= 7 and nota <= 10:
    print("Você foi aprovado!")
elif nota < 7 and nota >= 0:
    print("Você foi reprovado!")
else:
    print("Nota inválida!")
