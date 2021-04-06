annual_rate = float(input("Input annual rate without % sign : ")) 
years = int(input("Input years : ")) 
monthlyInvestment = int(input("Enter monthly investment : ")) 

calcMonthlyRate = annual_rate / 1200
yearsToMonths = years * 12                        

r = calcMonthlyRate                       
pmt = monthlyInvestment
n = yearsToMonths


calcValueOfInvestment = pmt * (((1 + r)**n) - 1) / r 
                
print("Your monthly rate is", calcMonthlyRate)
print("Input years you plan on saving for :", years)
print(years, "converted to months =", yearsToMonths)
print("Input monthly investment :", monthlyInvestment)
print("The future value of your investment will be", round(calcValueOfInvestment, 2)) 

                        
