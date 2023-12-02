def find_rows_with_extreme_sums(matrix):
    if not matrix:
        return []
        
    max_sum_row = 0
    min_sum_row = 0
    max_sum = sum(matrix[0])
    min_sum = sum(matrix[0])

    for i in range(1, len(matrix)):
        row_sum = sum(matrix[i])

        if row_sum > max_sum:
            max_sum = row_sum
            max_sum_row = i
        elif row_sum < min_sum:
            min_sum = row_sum
            min_sum_row = i

    return max_sum_row, min_sum_row, max_sum, min_sum


# Пример использования функции
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

max_sum_row, min_sum_row, max_sum, min_sum = find_rows_with_extreme_sums(matrix)

print("Строка с наибольшей суммой элементов:", matrix[max_sum_row])
print("Сумма элементов строки:", max_sum)
print("Строка с наименьшей суммой элементов:", matrix[min_sum_row])
print("Сумма элементов строки:", min_sum)
