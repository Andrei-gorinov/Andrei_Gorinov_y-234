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

# Пример использования функций
matrix = [
    [-1, 2, -3],
    [4, -5, 6],
    [-7, 8, -9]
]

replace_elements(matrix)
print("Матрица после замены элементов:")
for row in matrix:
    print(row)

print("Нижняя треугольная матрица:")
print_lower_triangle(matrix)
