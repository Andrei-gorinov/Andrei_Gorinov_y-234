print("Курс Основы программирования начался")#1


a=16823#2
b=12302
c=3092
print((a*b)%c)


print("Напишите имя")#3
name=str(input())
if name == ("Иван"):
    print("Иванам тут не место!")
    exit()
    
print("Напишите возраст")
age=int(input())

if age >= 16 and age < 75:
    print("Поздравляем вы поступили во ВГУИТ")
    
elif age < 16 and age > 0:
        print("Сначала нужно окончить школу!")
        print("До универа вам осталось:",16-age,"года")
        
elif age <= 0:
             print("Тебе бы сначала родиться...")
             
else: print("Ты слишком стар для этого...")


print("Напишите кол-во секунд")#4
sec = int(input())
print(sec//86400, (sec%86400)//3600, ((sec%86400)%3600)//60,(((sec%86400)%3600)%60))


print("Напишите число")#5
n=int(input())
print(n + n**2 + n**3 + n**4 + n**5)


print("Напишите значения a и b")#6
a=int(input())
b=int(input())
c=b
b=a
a=c
print("a-",a," b-",b)


print("Дайте значение Num:")#7
num=int(input())

if num%2 == 0:
    print ("Num четное")
      
else: print("Num не четное")
    
