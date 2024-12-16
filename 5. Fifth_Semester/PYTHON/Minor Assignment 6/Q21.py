import pandas as pd

data = ['Cry', 'Apple', 'Orange', 'Sky', 'Banana']
series = pd.Series(data * 2)
unique_series = series.drop_duplicates().reset_index(drop=True)
print(unique_series)
