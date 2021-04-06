from math import *
import math 

def displayPi() :
    list = [pi]

    print() 

    for num in range(1, 6) :
        piExp = pi  
        piExp **= num
        print(piExp, end = "")

    print() 

    for num in range(3) :
        print("{:<30s}".format("****************"), end = "")

    print()
    list.pop(0) 
    
    for num in range(1, 6) :
        piExp = pi  
        piExp **= num
        piExp = round(piExp, 6) 
        list.append(piExp)
        print("{:^15f}".format(list[num - 1]), end = "")
    
    print()  
    list.clear()  
    piExp = 0   
    
    for num in range(1, 6) :
        piExp += pi   
        piExp = round(piExp, 6)
        list.append(piExp)
        print("{:^15f}".format(list[num - 1]), end = "")

displayPi()
print()
print() 

############################################################################################ 

sinOrCos = input("Do you want the sin or cos? \n")
angle = float(input("What angle do you want? ")) 

r = angle * (pi / 180)  


def s() :
    s = 0 
    f = 1  
    
    for i in range(8) :
        coef = (- 1) ** i
        num = r ** (i * 2 + 1)
        denom = i * 2 + 1

        if denom == 1 :
            s += r 
        else : 
            for i in range(1, 1 + denom) :
                f *= i
            denom = f
            s += coef * (num / denom)
            
            
    print(s, "Theirs", sin(r))

def c():
    c = 1
    f = 1
    
    for i in range(8) :
        coef = (- 1) ** i
        num = r ** (i * 2)
        denom = i * 2
        
        if denom != 0 :    
            for i in range(1, 1 + denom) :
                f *= i   
            denom = f  
            c += coef * (num / denom) 
            
    print(c, "Theirs", cos(r))

if sinOrCos == "sin" :
    s()
elif sinOrCos == "cos" :
    c()  
 
# def main() :
    # displayPi()
    
 
# main() 

      

    
    
    


