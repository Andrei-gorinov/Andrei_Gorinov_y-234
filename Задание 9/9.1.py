def F(matrix, k):
    count = 0
    max_el = None
    for row in matrix:
        for el in row:
            if el % k == 0:
                count += 1
                if max_el is None or el > max_el:
                    max_el = el
    return count, max_el
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
k = 2

count, max_el = F(matrix, k)

print(count, max_el)
