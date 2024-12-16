import numpy as np

array1 = np.arange(2, 19, 2).reshape(3, 3)
array2 = np.arange(9, 0, -1).reshape(3, 3)
result = array1 * array2
print(result)
