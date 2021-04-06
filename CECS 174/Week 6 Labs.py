def comboLock() : 
    num1 = int(input("What is the first number in the combination? ")) 
    num2 = int(input("What is the second number in the combination? ")) 
    num3 = int(input("What is the third number in the combination? ")) 

    solvedTotal = False

    solved1 = False 
    solved2 = False
    solved3 = False 
    
    while solvedTotal == False :
        ticks1 = 0
        ticks2 = 0
        ticks3 = 0

        solved1 = False 
        solved2 = False
        solved3 = False 

        print() 
        ticks1 = int(input("Turn the lock clockwise by how much? ")) 
        ticks2 = int(input("Turn the lock counterclockwise by how much? ")) 
        ticks3 = int(input("Turn the lock clockwise by how much? "))  
        
        if num1 == 40 - ticks1 and num2 == num1 + ticks2 and ticks3 == 40 - (num3 - num2) :
            solvedTotal == True
            print() 
            print("Correct! You have won an A in CECS 174.")
            break 
        else :
            print() 
            print("Sorry, that sequence was incorrect :(.")

def score() : 
    score1 = int(input("Enter the judge #1's score: "))

    while score1 < 0 or score1 > 9 :
        score1 = int(input("Enter the judge #1's score: ")) 
    
    score2 = int(input("Enter the judge #2's score: "))

    while score2 < 0 or score2 > 9 :
        score2 = int(input("Enter the judge #2's score: "))
        
    score3 = int(input("Enter the judge #3's score: "))

    while score3 < 0 or score3 > 9 :
        score3 = int(input("Enter the judge #3's score: ")) 
    
    score4 = int(input("Enter the judge #4's score: "))

    while score4 < 0 or score4 > 9 :
        score4 = int(input("Enter the judge #4's score: ")) 
    
    score5 = int(input("Enter the judge #5's score: "))

    while score5 < 0 or score5 > 9 :
        score5 = int(input("Enter the judge #5's score: "))

    averageScore = (score1 + score2 + score3 + score4 + score5) / 5 

    print("The average score is:", averageScore) 

def main() :
    comboLock()
    # score() 

main() 
