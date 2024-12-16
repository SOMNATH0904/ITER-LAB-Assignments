import numpy as np

def median(arr):
    return np.median(arr)

def mode(arr):
    values, counts = np.unique(arr, return_counts=True)
    return values[np.argmax(counts)]

array1 = np.random.randint(0, 10, (3, 3))
print(median(array1), mode(array1))
