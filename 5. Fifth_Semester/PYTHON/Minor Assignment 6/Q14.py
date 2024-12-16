import numpy as np

array = np.random.randint(0, 100, (5, 5))
counts = np.bincount(array.flatten())
print(counts)
