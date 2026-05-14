maiores_idade = []

for i in range(1, 6):
    idade = int(input(f"Digite a idade {i}: "))

    if idade >= 18:
        maiores_idade.append(idade)

print(len(maiores_idade), "pessoas são maiores de idade", maiores_idade)