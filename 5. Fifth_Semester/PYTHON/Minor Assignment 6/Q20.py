import numpy as np

arr = np.array([1, 1, 3, 7, 88, 12, 88, 23, 3, 1, 9, 0])
print(np.where(arr == arr.min())[0][0], np.where(arr == arr.max())[0][0])
