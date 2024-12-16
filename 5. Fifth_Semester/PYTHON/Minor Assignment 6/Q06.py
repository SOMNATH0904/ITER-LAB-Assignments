import numpy as np

array = 2 ** np.arange(6).reshape(2, 3)
print(array.flatten())
print(array.ravel())
print(array)

