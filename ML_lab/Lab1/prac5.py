import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score

# Load dataset
data = pd.read_csv(r"C:\Users\nbehe\Music\MCA\SEM2\ml_lab\lab1\students.csv")
# Show first 5 rows
print(data.head())

# Separate features and target
X = data.iloc[:, :-1]   # All columns except last
y = data.iloc[:, -1]    # Last column as target

# Split dataset
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Create model
model = LogisticRegression()

# Train model
model.fit(X_train, y_train)

# Predict
y_pred = model.predict(X_test)

# Accuracy
print("Accuracy:", accuracy_score(y_test, y_pred))