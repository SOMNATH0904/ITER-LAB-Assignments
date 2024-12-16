import numpy as np

array = np.arange(1, 10).reshape(3, 3)
array[[0, 1]] = array[[1, 0]]
array[:, [0, 1]] = array[:, [1, 0]]
print(array)
