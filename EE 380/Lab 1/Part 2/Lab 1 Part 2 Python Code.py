import numpy as np
from scipy.stats import binom
from scipy.stats import norm
import matplotlib.pyplot as plt

n = 100     # Number of trials
x = 50      # Number of successes
p = 0.5     # Probability of success
mean = 50   # Average
sd = 5      # Standard Deviation

# Determines the points for the Binomial Distribution
binomialValues = list(range(n + 1))
binomialDistribution = [binom.pmf(x, n, p) for x in binomialValues]

# Displays the Probabilities of the Binomial Distribution
print("\nBinomial PDF", end = "")

for x in binomialValues :
    binomialPMF = binom.pmf(x, n, p)

    if x % 10 == 0 :
        if x < 100 :
            print("\n\nColumns", x + 1, "through", x + 10, "\n")
        else :
            print("\n\nColumn", x + 1, "\n")

    if binomialPMF > 0.00005 :
        print(round(binomialPMF, 4), " ", end = " ")
    else :
        print(0, " ", end = " ")

# Determines the points for the Probability Density
normalValues = list(range(n + 1))
normalDistribution = [norm.pdf(x, mean, sd) for x in normalValues]

# Displays the Probabilities of the Normal Distribution
print("\n\nNormal PDF", end = "")

for x in normalValues :
    normalPDF = norm.pdf(x, mean, sd)

    if x % 10 == 0 :
        if x < 100 :
            print("\n\nColumns", x + 1, "through", x + 10, "\n")
        else :
            print("\n\nColumn", x + 1, "\n")

    if normalPDF > 0.00005 :
        print(round(normalPDF, 4), " ", end = " ")
    else :
        print(0, " ", end = "  ")

# Plots the points for the Probability Density / Binomial Distribution
plt.scatter(binomialValues, binomialDistribution)
plt.plot(normalValues, normalDistribution)

# Displays the title of the Graph
plt.title("Normal Distribution + Binomial Distribution Plot of Coin Flips")
# Displays the Labels for the X / Y Axis for the Graph
plt.xlabel("Number of Successes")
plt.ylabel("Probability Density")

# Sets the X Axis limit to a range of 35 to 65 with the default step of 5
plt.xlim([35, 65])
# Sets the Y Axis limit to a range of 0 to 0.10 with a step of 0.02
plt.yticks(np.arange(0, 0.11, step = 0.02))

# Displays both lines on a graph
# Binomial Distribution = Blue Line
# Probability Density = Orange Line
plt.show()