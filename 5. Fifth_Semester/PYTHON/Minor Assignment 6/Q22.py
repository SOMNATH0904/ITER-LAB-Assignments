import pandas as pd
import numpy as np

s1 = pd.Series([7, 11, 13, 17])
print(s1)
s2 = pd.Series([100.0] * 5)
print(s2)
s3 = pd.Series(np.random.randint(0, 101, 20))
print(s3.describe())
temperatures = pd.Series([98.6, 98.9, 100.2, 97.9], index=['Julie', 'Charlie', 'Sam', 'Andrea'])
print(temperatures)
data = {'Julie': 98.6, 'Charlie': 98.9, 'Sam': 100.2, 'Andrea': 97.9}
s4 = pd.Series(data)
print(s4)
