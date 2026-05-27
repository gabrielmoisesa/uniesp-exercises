from atv_01 import create_list

print("Digite os nomes dos produtos:")
produtos_nomes = create_list(12)
print("Digite a quantidade de estoque dos produtos:")
produtos_qtd_estoque = create_list(12, int)

maior_estoque = [produtos_nomes[0], produtos_qtd_estoque[0]]
menor_estoque = [produtos_nomes[0], produtos_qtd_estoque[0]]
total_estoque = 0

print("Produtos com estoque menor que 5:")
for i in range(12):
  nome = produtos_nomes[i]
  estoque = produtos_qtd_estoque[i]

  if estoque < 5:
    print("\nProduto:", nome)
    print("Estoque:", estoque)
  
  if estoque > maior_estoque[1]:
    maior_estoque = [nome, estoque]
  
  if estoque < menor_estoque[1]:
    menor_estoque = [nome, estoque]
  
  total_estoque += estoque

print(f"\nProduto com maior estoque: {maior_estoque[0]}, {maior_estoque[1]}")
print(f"Produto com menor estoque: {menor_estoque[0]}, {menor_estoque[1]}")
print("Quantidade total de itens no estoque:", total_estoque)

