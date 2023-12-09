def get_odd_numbers(arr):
    odd_numbers = []
    
    for num in arr:
        if num % 2 != 0:
            odd_numbers.append(num)
    
    if len(odd_numbers) == 0:
        print("В исходном массиве нет нечетных чисел.")
    else:
        odd_numbers.sort(reverse=True)
        print("Массив из нечетных чисел в порядке убывания: ", odd_numbers)

# Пример вызова функции
array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
get_odd_numbers(array)
