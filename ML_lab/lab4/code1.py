import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

df = sns.load_dataset("tips")

# 1. Bar Plot
plt.figure()
sns.barplot(x="day", y="total_bill", data=df)
plt.title("Bar Plot")
plt.show()

# 2. Count Plot
plt.figure()
sns.countplot(x="day", data=df)
plt.title("Count Plot")
plt.show()

# 3. Distribution Plot
plt.figure()
sns.histplot(df["total_bill"], kde=True)
plt.title("Distribution Plot")
plt.show()

# 4. Point Plot
plt.figure()
sns.pointplot(x="day", y="total_bill", data=df)
plt.title("Point Plot")
plt.show()

# 5. Facet Grid
g = sns.FacetGrid(df, col="time")
g.map(sns.histplot, "total_bill")
plt.show()

# 6. Pair Grid
g = sns.PairGrid(df)
g.map(sns.scatterplot)
plt.show()