import statistics as s

list = [1, 2, 3, 2, 3, 4, 4, 4, 5, 4, 5, 6]

mean = s.mean(list)
median = s.median(list)
mode = s.mode(list)

print(f"The Mean, Median and Mode of the above data is {mean}, {median} and {mode} respectively.")