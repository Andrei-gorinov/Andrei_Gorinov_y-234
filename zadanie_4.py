a=int(input())#1
b=int(input())
while a<=b:
    print(a)
    a=a+1

a=int(input())#2
b=int(input())
if a<b:
    while a<=b:
        print(a)
        a=a+1
else:
    while b<=a:
        print(a)
        a=a-1


a=int(input())#3
b=int(input())
while a>=b:
    if a%2!=0:
        print(a)
    a=a-1


print("введите кол-во n")#4
n=int(input())
b=0
while n>0:
    print("введите число №",n)
    a=int(input())
    b=b+a
    n=n-1

print(b)


print("введите число n")#5
n=int(input())
b=0
while n>0:
    a=n**3
    b=b+a
    n=n-1

print(b)

print("введите число n")#6
n=int(input())
b=1
while n>0:
    b=b*n
    n=n-1

print(b)

print("введите число n")#7
n=int(input())
b=1
c=0
v=1
while v<=n:
    b=b*v
    c=b+c
    v=v+1

print(c)


n = int(input())#8
for i in range(1, n + 1):
    for j in range(1, i + 1):
        print(j,end="")
    print()


a=1#9
b=1
print("введите N")
n=int(input())
c=0
e=2
while c<n-2:
    d=a+b
    a=b
    b=d
    c=c+1
    e=e+b
print("Сумма",e)
