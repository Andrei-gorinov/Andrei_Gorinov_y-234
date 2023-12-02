def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def divide_fractions(a, b, c, d):
    numerator = a * d
    denominator = b * c
    gcd_val = gcd(numerator, denominator)

    numerator //= gcd_val
    denominator //= gcd_val

    return numerator, denominator

def read_matrix(filename):
    matrix = []

    try:
        with open(filename, 'r') as file:
            for line in file:
                row = [int(num) for num in line.strip().split()]
                matrix.append(row)

        return matrix

    except FileNotFoundError:
        print("Файл не найден")
        return None

def write_matrix(matrix, filename):
    try:
        with open(filename, 'w') as file:
            for row in matrix:
                file.write(' '.join(str(num) for num in row))
                file.write('\n')

        print("Результаты успешно записаны в файл")

    except:
        print("Ошибка при записи в файл")

# Чтение матрицы из файла
input_filename = "ФИО_группа_vvod.txt"
matrix = read_matrix(input_filename)

if matrix is not None:
    # Операции с матрицей (пример)
    result = divide_fractions(matrix[0][0], matrix[0][1], matrix[1][0], matrix[1][1])

    # Запись результата в файл
    output_filename = "ФИО_группа_vivod.txt"
    write_matrix([list(result)], output_filename)
