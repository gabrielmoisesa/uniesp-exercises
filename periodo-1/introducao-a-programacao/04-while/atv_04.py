user_password = input("Digite a senha: ")
correct_password = "1234"

while user_password != correct_password:
    print("Senha incorreta!")
    user_password = input("Digite a senha novamente: ")