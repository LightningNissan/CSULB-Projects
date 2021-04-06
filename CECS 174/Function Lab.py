import random

def costOfGas() :
    print()

    mpg1 = float(input("Enter Car 1's Mileage: "))
    mpg2 = float(input("Enter Car 2's Mileage: "))
    
    cpg1 = float(input("Enter Car 1's Average Gas Cost Per Gallon: "))
    cpg2 = float(input("Car 2's Average Fuel CPG: "))

    drivenMiles = float(input("How many miles do you drive a month: ")) 

    totalCost1 = ((drivenMiles * 12) * cpg1) / mpg1
    totalCost2 = ((drivenMiles * 12) * cpg2) / mpg2 
    
    if (mpg1 or mpg2 or cpg1 or cpg2 or drivenMiles) < 0 :
        print("Error: Inputs Are Negative")
    else :
        if totalCost1 > totalCost2 :
            savings = totalCost1 - totalCost2 
            print("Car 2 will save $", "{:.2f}".format(savings), " in a year", sep = "")
        elif totalCost1 < totalCost2 :
            savings = totalCost2 - totalCost1
            print("Car 1 will save $", "{:.2f}".format(savings), " in a year", sep = "")
        elif totalCost1 == totalCost2 :
            print("The two cars cost the same")

def usedValue() :
    print()
    
    price = float(input("Enter original car price: "))
    years = int(input("Enter number of years: "))

    if (price or years) < 0 :
        print("Error: Inputs Are Negative")

    for i in range(1, 1 + years) :
        price -= (0.18 * price)
        print("Year ", i, " value: $", "{:.2f}".format(price), sep = "")  

def stoppingDistance() :
    print()
    
    speed1 = int(input("Enter initial speed: "))
    tireCondition1 = int(input("Enter tire condition ( 1 = New, 2 = Good , 3 = Poor ): ")) 

    if speed1 < 0 :
        print("Error: Inputs Are Negative")
    elif tireCondition1 != (1 or 2 or 3) :
        print("Error: Inputs Are Not 1, 2, Or 3")

    if tireCondition1 == 1 :
        fC = 0.8
        tireCondition2 = "new"
    elif tireCondition1 == 2 :
        fC = 0.6 
        tireCondition2 = "good"
    elif tireCondition1 == 3 :
        fC = 0.5 
        tireCondition2 = "poor"

    velocity = speed1 * 5280 / 3600 
    distance = velocity ** 2 / (2 * fC * 32.174)

    print("At", speed1, "miles per hour with", tireCondition2, "tires, the car will stop in", "{:.2f}".format(distance), "feet away") 
    
def mainMenu() :
    while True :
        print() 
        print("Main Menu:")
        print(" 1. Cost of Gas")    
        print(" 2. Used Value")
        print(" 3. Stopping Distance")
        print(" 4. Quit \n") 

        function = int(input("Choose a function from the list: \n")) 

        if function == 1 :
            costOfGas()
        elif function == 2 :
            usedValue()
        elif function == 3 :
            stoppingDistance()
        elif function == 4 :
            break
        
def main() :
    mainMenu()

main() 


 
