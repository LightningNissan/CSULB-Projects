KPH = int(input("Enter Kilometers / Hour: "))

MPH = KPH * 0.621371 
print(KPH, "kilometer / hour =", round(MPH, 2), "Miles / hour")           

aussiePrice = float(input("Enter Aussie Price: "))

# Current exchange rate different from output example  
dollars = aussiePrice * 0.67

round(dollars, 2) 
print("$", aussiePrice, "Aussie price = $", round(dollars, 2), "US price") 

