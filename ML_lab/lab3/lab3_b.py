import pandas as pd
from sklearn.model_selection import train_test_split

df = pd.read_csv("students.csv")

train_data, test_data = train_test_split(df, test_size=0.3, random_state=42)

print("Training Data:\n", train_data)
print("\nTesting Data:\n", test_data)