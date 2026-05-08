num = int(input("Digite um número inteiro: "))
current_num = num
multiplicador = 1
num_max = num * 10

while current_num <= num_max:
    print(current_num)
    multiplicador += 1
    current_num = num * multiplicador
    
