import numpy as np
from scipy.stats import poisson
import matplotlib.pyplot as plt
import matplotlib.ticker

lam = 1.0
x = np.arange(0, 11, 1)
y1 = poisson.pmf(x, lam)
y2 = poisson.cdf(x - 1, lam)

# Poisson PDF (Linear) Plot
plt.scatter(x, y1)
plt.xticks(np.arange(0, 11, step = 1))
plt.yticks(np.arange(0, 0.45, step = 0.05))
plt.title("Poisson PDF (Linear) Plot")
plt.xlabel("Number of Occurrences")
plt.ylabel("Probability Density")
plt.show()

# Poisson PDF (Log) Plot
plt.scatter(x, y1)
plot = plt.gca()
plot.set_yscale("log")
plt.xticks(np.arange(0, 11, step = 1))
plt.yticks([10**-7, 10**-6, 10**-5, 10**-4, 10**-3, 10**-2, 10**-1, 10**0])
plt.title("Poisson PDF (Log) Plot")
plt.xlabel("Number of Occurrences")
plt.ylabel("Probability Density")
plt.show()

# Poisson CDF (Linear) Plot
plt.step(x, y2)
plt.xticks(np.arange(0, 11, step = 1))
plt.yticks(np.arange(0, 1.1, step = 0.1))
plt.title("Poisson CDF (Linear) Plot")
plt.xlabel("Number of Occurrences")
plt.ylabel("Probability")
plt.show()

# Poisson CDF (Log) Plot
fig, ax = plt.subplots()
ax.set_yscale("log")
ax.step(x, y2)
ax.set_xticks(np.arange(0, 11, step = 1))
ax.set_yticks(np.arange(0.4, 1.1, step = 0.1))
ax.get_yaxis().set_major_formatter(matplotlib.ticker.ScalarFormatter())    # Shows the Y Axis Ticks' Values
plt.title("Poisson CDF (Log) Plot")
plt.xlabel("Number of Occurrences")
plt.ylabel("Probability")
plt.show()


