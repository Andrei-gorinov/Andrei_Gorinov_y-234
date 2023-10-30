def replace_and_count(string):
    count = 0  # переменная для подсчета количества замен
    new_string = ""  # новая строка после замены

    for char in string:
        if char == "а":
            new_string += "о"
            count += 1
        else:
            new_string += char

    return count, len(new_string)


input_string = input("Введите строку: ")
replacement_count, string_length = replace_and_count(input_string)

print("Количество замен:", replacement_count)
print("Количество символов в строке:", string_length)
