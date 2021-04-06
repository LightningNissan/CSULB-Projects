def calcGrade() : 
    points = int(input("How many points did you earn in class? ")) 
    allPoints = int(input("How many points is the class out of ? ")) 

    grade = points / allPoints * 100 

    if grade >= 90 :
        print("You earned an A")
    elif grade >= 80 :
        print("You earned an B")
    elif grade >= 70 :
        print("You earned an C")
    elif grade >= 60 :
        print("You earned an D")
    elif grade >= 0 :
        print("You earned an F")

def menu() :
    print("1. The Father")
    print("2. The Mother")
    print("3. The Maiden")
    print("4. The Crone")
    print("5. The Warrior")
    print("6. The Smith")
    print("7. The Stranger") 
    print()
    
    selection = int(input("Which of the Seven New Gods would you like to lean about? "))  
    print()
    

    if selection == 1 :
        print("1 = The Father represents divine justice, and judges the souls of the dead")
    elif selection == 2 : 
        print("2 = The Mother represents mercy, peace, fertility, and childbirth. She is sometimes referred to as \"the strength of women.\"")  
    elif selection == 3 :
        print("3 = The Maiden represents purity, innocence, love, and beauty")  
    elif selection == 4 :
        print("4 = The Crone represents wisdom and foresight. She is represented carrying a lantern.") 
    elif selection == 5 :
        print("5 = The Warrior represents strength and courage in battle.") 
    elif selection == 6 :
        print("6 = The Smith represents creation and craftsmanship.") 
    elif selection == 7 :
        print("7 = The Stranger represents death and the unknown. It is rarely prayed to.") 
    else :
       print("\"none of the other options was chosen\" = The night is dark and full of terrors for those who cannot read the menu.")     

def wages() :
    HOURS_FULLTIME = 40
    HOURS_OVERTIME = 60
    RATE_OVERTIME = 1.5
    RATE_SUPER_OVERTIME = 2.0

    hours = float(input("How many hours did you work this week? "))
    rate = float(input("How much are you paid per hour? "))

    if hours <= 40 :
        calcEarned = rate * hours
    elif hours > 60 : 
        super_overtime = hours - HOURS_OVERTIME
        calcEarned = rate * HOURS_FULLTIME + (rate * RATE_OVERTIME) * (HOURS_OVERTIME - HOURS_FULLTIME) + (rate * RATE_SUPER_OVERTIME) * super_overtime
    elif hours > 40 :
        overtime = hours - HOURS_FULLTIME 
        calcEarned = rate * HOURS_FULLTIME + (rate * RATE_OVERTIME) * overtime

    round(calcEarned, 2) 
    print("You earned ", "$", calcEarned, sep = "")


def main() :
    #calcGrade()
    #menu()
    wages()

main()






    
