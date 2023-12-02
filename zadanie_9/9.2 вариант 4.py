def replace_elements(matrix):
    n = len(matrix)
    for i in range(n):
        for j in range(n):
            if matrix[i][j] < 0:
                matrix[i][j] = 0
            elif matrix[i][j] > 0:
                matrix[i][j] = 1

def print_lower_triangle(matrix):
    n = len(matrix)
    for i in range(n):
        for j in range(i + 1):
            print(matrix[i][j], end=' ')
        print()

def read_matrix_from_file(file_name):
    matrix = []
    with open(file_name, 'r') as file:
        for line in file:
            row = [int(num) for num in line.split()]
            matrix.append(row)
    return matrix

def write_matrix_to_file(matrix, file_name):
    with open(file_name, 'w') as file:
        for row in matrix:
            line = ' '.join(map(str, row))
            file.write(line + '\n')

input_file_name = 'ФИО_группа_vvod.txt'
output_file_name = 'ФИО_группа_vivod.txt'

matrix = read_matrix_from_file(input_file_name)

replace_elements(matrix)
write_matrix_to_file(matrix, output_file_name)

print("Матрица после замены элементов:")
for row in matrix:
    print(row)

print("Нижняя треугольная матрица:")
print_lower_triangle(matrix)
