import random
import sys 

def costOfGas() : 
    mpg1 = float(input("Enter Car 1's Mileage: "))
    mpg2 = float(input("Enter Car 2's Mileage: "))
    
    cpg1 = float(input("Enter Car 1's Average Gas Cost Per Gallon: "))
    cpg2 = float(input("Car 2's Average Fuel CPG: "))

    drivenMiles = float(input("How many miles do you drive a month: ")) 

    totalCost1 = ((drivenMiles * 12) * cpg1) / mpg1
    totalCost2 = ((drivenMiles * 12
                   ) * cpg2) / mpg2 
    
    if (mpg1 or mpg2 or cpg1 or cpg2 or drivenMiles) < 0 :
        print("Error > Inputs Are Negative")
    else :
        if totalCost1 > totalCost2 :
            savings = totalCost1 - totalCost2 
            print("Car 2 will save $", "{:.2f}".format(savings), " in a year", sep = "")
        elif totalCost1 < totalCost2 :
            savings = totalCost2 - totalCost1
            print("Car 1 will save $", "{:.2f}".format(savings), " in a year", sep = "")
        elif totalCost1 == totalCost2 :
            print("The two cars cost the same")

def numberGuess() :
    print()
    print()
    print() 
    print("You have 3 tries to guess my number")
    print("Please enter an integer number between 1 and 10")

    randomNum = random.randint(1, 10)
    
    print(randomNum) 
    
    num1 = int(input("Input your guess "))

    if num1 > randomNum :
        print("Lower")
    elif num1 < randomNum :
        print("Higher")
    else :
        print("Horray")
        sys.exit() 

    num2 = int(input("Input your second guess "))

    if num2 > randomNum :
        print("Lower")
    elif num2 < randomNum :
        print("Higher")
    else :
        print("Horray")
        sys.exit() 

    num3 = int(input("Input your last guess "))

    if num3 > randomNum or num3 < randomNum :
        print("Sorry you lose")
    else :
        print("Horray")

def flowChart() :
    print()
    print()
    print()
    
    var1 = 1 + 2j 

    if type(var1) == int :
        print("Type of the variable is Integer")
    elif type(var1) == float :
        print("Type of the variable is Float") 
    elif type(var1) == complex :
        print("Type of the variable is Complex") 
    elif type(var1) == bool :
        print("Type of the variable is Bool") 
    elif type(var1) == str :
        print("Type of the variable is String") 
    elif type(var1) == tuple :
        print("Type of the variable is Tuple") 
    elif type(var1) == dict :
        print("Type of the variable is Dictionaries") 
    elif type(var1) == list :
        print("Type of the variable is List")
    else :
        print("Type of the variable is Unknown")        
    
def main() :
    costOfGas()
    numberGuess() 
    flowChart() 

main() 


