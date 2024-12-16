import numpy as np

def format_2d_array(arr):
    return "\n".join(["".join(f"{num:>{len(str(np.max(arr)))}}" for num in row) for row in arr])

array = np.array([[123, 4567], [89, 10]])
print(format_2d_array(array))
