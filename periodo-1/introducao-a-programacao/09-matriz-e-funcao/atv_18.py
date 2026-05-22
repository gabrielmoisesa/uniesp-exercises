def verificar_positivo(num):
  if num > 0:
    print(num, "é positivo!")
  elif num < 0:
    print(num, "é negativo!")
  else:
    print(num, "é zero!")

verificar_positivo(float(input("Digite um número: ")))