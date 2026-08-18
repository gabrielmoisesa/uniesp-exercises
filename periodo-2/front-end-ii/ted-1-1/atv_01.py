alturasFeminino = []
alturasMasculino = []

for i in range(15):
    genero = input("\nInforme o gênero: ")
    altura = float(input("Informe a altura: "))

    if (genero == "feminino"):
        alturasFeminino.append(altura)
    elif (genero == "masculino"):
        alturasMasculino.append(altura)
    else:
        print("Gênero inválido!")
        continue

maiorAlturaFeminino = max(alturasFeminino)
maiorAlturaMasculino = max(alturasMasculino)
maiorAlturaTotal = 0

if (maiorAlturaFeminino < maiorAlturaMasculino):
    maiorAlturaTotal = maiorAlturaMasculino
else:
    maiorAlturaTotal = maiorAlturaFeminino

menorAlturaFeminino = min(alturasFeminino)
menorAlturaMasculino = min(alturasMasculino)
menorAlturaTotal = 0

if (menorAlturaFeminino < menorAlturaMasculino):
    menorAlturaTotal = menorAlturaFeminino
else:
    menorAlturaTotal = menorAlturaMasculino

mediaAlturaMasculino = (sum(alturasMasculino)) / len(alturasMasculino)

print(f"\nMaior altura do grupo: {maiorAlturaTotal}")
print(f"Menor altura do grupo: {menorAlturaTotal}")

print(f"Média de altura do gênero Masculino: {mediaAlturaMasculino}")

print(f"Número de pessoas do gênero Feminino: {len(alturasFeminino)}")