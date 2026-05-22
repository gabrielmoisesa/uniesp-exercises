from atv_01 import create_matrix, print_matrix_table

def get_students_average(students_matrix):
  students_average = []

  for student in students_matrix:
    grades_sum = 0
    average = 0

    for grade in student:
      grades_sum += grade

    average = grades_sum / len(student)
    students_average.append(average)
  
  return students_average

if __name__ == "__main__":
  matriz = create_matrix(4, 3, float)

  print_matrix_table(matriz)
  print("Média dos alunos:", get_students_average(matriz))
