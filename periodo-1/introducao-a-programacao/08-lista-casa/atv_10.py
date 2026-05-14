student_names = []
student_grades = []

for i in range(1, 6):
  name = input(f"Digite o nome do aluno {i}: ")
  grade = float(input(f"Digite a nota do aluno {i}: "))
  print()

  student_names.append(name)
  student_grades.append(grade)

for i in range(len(student_names)):
  is_aproved = "Reprovado"
  
  if student_grades[i] >= 7:
    is_aproved = "Aprovado"
  
  print("Nome do aluno:", student_names[i])
  print("Nota:", student_grades[i])
  print("Situação:", is_aproved)
  print()