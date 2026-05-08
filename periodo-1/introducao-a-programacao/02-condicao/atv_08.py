faltas = int(input("Digite seu número de faltas: "))

if faltas > 10:
    print("Você está acima do limite de faltas.")
elif faltas <= 10 and faltas >= 0:
    print("Você está dentro do limite de faltas.")
else:
    print("Faltas inválidas!")
