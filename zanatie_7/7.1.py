array = [4, 10, 5, 8, 2]
max_element = array[0]
max_index = 0
for i in range(1, len(array)):
if array[i] > max_element:
max_element = array[i]
max_index = i
print("Максимальный элемент:", max_element)
print("Порядковый номер максимального элемента:", max_index)
