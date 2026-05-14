grades = []

for i in range (1, 7):
  grade = float(input(f"Digite a nota {i}: "))
  grades.append(grade)

grades_sum = 0

for grade in grades:
  grades_sum += grade

grades_average = grades_sum / len(grades)
grades_above_average = []

for i in range(len(grades)):
  if grades[i] > grades_average:
    grades_above_average.append(grades[i])

print("Notas:", grades)
print("Média da turma:", grades_average)
print("Notas acima da média:", grades_above_average)
