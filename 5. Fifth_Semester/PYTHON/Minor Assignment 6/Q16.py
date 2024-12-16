import numpy as np

array = np.random.rand(9, 8, 2)
sliced_array = array[:5, :5, :]
print(sliced_array)
