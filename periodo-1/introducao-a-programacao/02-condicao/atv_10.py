num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

if num1 > num2:
    print(num1, "é maior que", num2)
elif num1 < num2:
    print(num1, "é menor que", num2)
elif num1 == num2:
    print(num1, "é igual a", num2)
else:
    print("Erro!")
