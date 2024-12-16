import numpy as np

array = np.random.rand(4, 4)
sorted_array = np.sort(array, axis=None).reshape(4, 4)
print(sorted_array)
