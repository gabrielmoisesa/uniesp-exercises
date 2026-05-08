valorProduto = float(input("Digite o valor do produto: "))
percentualDesconto = float(input("Digite o percentual de desconto (%): "))

valorDesconto = valorProduto * (percentualDesconto / 100)
precoFinal = valorProduto - valorDesconto

print("O produto custará:", "R$", precoFinal)
