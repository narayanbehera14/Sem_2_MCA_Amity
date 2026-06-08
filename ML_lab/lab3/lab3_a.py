import pandas as pd
data = {"Country":["Brazil","Russia","India","China","South Africa"],
        "Capital":["Brasilia","Moscow","New Delhi","Beijing","Pretoria"],"Area":[8.516,17.10,3.286,9.584,1.221]}


df =pd.DataFrame(data)
print("Structured Data:\n",df)