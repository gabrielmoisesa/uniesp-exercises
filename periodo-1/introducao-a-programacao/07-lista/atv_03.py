precos = []
valor_total = 0

for i in range(1, 5):
    preco = int(input(f"Digite o preço do produto {i}: "))
    precos.append(preco)

for preco in precos:
    valor_total += preco

print("O valor total da compra é de:", valor_total)