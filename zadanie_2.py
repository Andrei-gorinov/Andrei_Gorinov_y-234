import math
x=14.26
y=-1.22
z=3.5*10**(-2)
s=((2*(math.cos(x-(2/3))))/(1/2+(math.sin(y)**2)))*(1+((z**2)/(3-(z**2/5))))
print(s)#номер1
x=0.4*10**4
y=-0.875
z=-0.475*10**(-3)
s=abs((math.cos(x)-math.cos(y))**(1+2*(math.sin(y)**2)))*(1+z+((z**2)/2)+((z**3)/3)+((z**4)/4))
print(s)#номер4
x=0.1722
y=6.33
z=3.25*10**(-4)
s=5*(math.atan(x))-((1/4*(math.acos(x)))*((x+3*abs(x-y)+x**2)/(abs(x-y)*z+x**2)))
print(s)#номер7
