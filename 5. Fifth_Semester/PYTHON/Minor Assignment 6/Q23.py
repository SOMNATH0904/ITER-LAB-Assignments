import pandas as pd
import numpy as np

# Task 23 (a)
data = {'Maxine': [97.5, 98.0, 99.1], 'James': [98.2, 99.3, 97.9], 'Amanda': [100.1, 98.6, 99.0]}
temperatures = pd.DataFrame(data)
print(temperatures)

# Task 23 (b)
temperatures.index = ['Morning', 'Afternoon', 'Evening']
print(temperatures)

# Task 23 (c)
print(temperatures['Maxine'])

# Task 23 (d)
print(temperatures.loc['Morning'])

# Task 23 (e)
print(temperatures.loc[['Morning', 'Evening']])

# Task 23 (f)
print(temperatures[['Amanda', 'Maxine']])

# Task 23 (g)
print(temperatures.loc[['Morning', 'Afternoon'], ['Amanda', 'Maxine']])

# Task 23 (h)
print(temperatures.describe())

# Task 23 (i)
print(temperatures.T)

# Task 23 (j)
print(temperatures.sort_index(axis=1))
