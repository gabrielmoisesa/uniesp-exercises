user_num = float(input("Digite o 1° número: "))
num_count = 2
final_sum = user_num

while user_num != 0:
    user_num = float(input(f"Digite o {num_count}° número: "))
    final_sum = final_sum + user_num
    num_count += 1

print(final_sum)