num_count = 1
final_sum = 0

while num_count <= 5:
    user_num = float(input(f"Digite o {num_count}° número: "))
    final_sum = final_sum + user_num
    num_count += 1

print(final_sum)