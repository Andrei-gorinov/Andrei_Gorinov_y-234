print("Напишите имя")
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
