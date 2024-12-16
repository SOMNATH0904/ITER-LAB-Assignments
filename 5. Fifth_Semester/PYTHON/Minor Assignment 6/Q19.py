import pandas as pd

s1 = pd.Series([1, 2, 3, 4, 2])
s2 = pd.Series([3, 4, 5, 6])
result = s1[~s1.isin(s2)]
print(result)
