def check_point_in_circle(x, y, a, b, R):
distance = math.sqrt((x - a)**2 + (y - b)**2)
if distance <= R:
return True
else:
return False

a = 0
b = 0
R = 5

p1, p2 = 2, 2
f1, f2 = 4, 4
l1, l2 = -2, -2

points = [(p1, p2), (f1, f2), (l1, l2)]
points_inside_circle = 0

for point in points:
x, y = point
if check_point_in_circle(x, y, a, b, R):
points_inside_circle += 1

print("Количество точек, лежащих внутри окружности:", points_inside_circle)
