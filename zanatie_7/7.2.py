array = [2, 5, 8, 7, 10]
odd_array = []
for num in array:
if num % 2 != 0:
odd_array.append(num)
if len(odd_array) > 0:
odd_array.sort(reverse=True)
print("Массив с нечетными числами в порядке убывания:", odd_array)
else:
print("В исходном массиве нет нечетных чисел.")
