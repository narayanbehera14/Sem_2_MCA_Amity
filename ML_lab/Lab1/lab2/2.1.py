import numpy as np
import matplotlib.pyplot as plt

y = np.array([35, 25, 25, 15])
mylabels = ["Mumbai", "Nagpur", "Pune", "Amravati"]

myexplode = [0, 0, 0.3, 0]

mycolors = ["yellow", "#454545", "blue", "#e3ef35"]

plt.pie(y, labels=mylabels, explode=myexplode, shadow=True, colors=mycolors)

plt.legend(title="Cities")

plt.show()