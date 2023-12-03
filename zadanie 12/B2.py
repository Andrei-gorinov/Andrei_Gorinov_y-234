def find_second_largest():
    largest = -float('inf')
    second_largest = -float('inf')
    while True:
        number = int(input("Введите число (0 для завершения): "))
        if number == 0:
            break
        if number > largest:
            second_largest = largest
            largest = number
        elif number > second_largest:
            second_largest = number
    return second_largest

# Пример использования
result = find_second_largest()
print("Второе по величине число в последовательности: ", result)
