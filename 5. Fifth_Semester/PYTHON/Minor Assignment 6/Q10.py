import numpy as np

array = np.arange(1, 16).reshape(3, 5)
print(array[0])
print(array[:, 4])
print(array[[0, 1]])
print(array[:, 2:4])
print(array[1:, 1:4])
