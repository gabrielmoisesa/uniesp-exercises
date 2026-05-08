turno_usuario = input("Em que turno você estuda? (M - Matutino / V - Vespertino / N - Noturno): ").lower().strip()

if turno_usuario == "m":
    print("Bom Dia!")
elif turno_usuario == "v":
    print("Boa Tarde!")
elif turno_usuario == "n":
    print("Boa Noite!")
else:
    print("Valor Inválido!")
