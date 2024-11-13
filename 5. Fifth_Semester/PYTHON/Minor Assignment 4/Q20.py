'''
Ques 20: 20. Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the student cafeteria,
with 1 being “awful” and 5 being “excellent.” Place the 20 responses in a list.
1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5
Determine and display the frequency of each rating. Use the built-in (or user-defined) functions and
statistics module functions to display the following response statistics: minimum, maximum, range,
mean, median, mode, variance and standard deviation.
3
Centre for Data Science
Institute of Technical Education & Research, SOA, Deemed to be University
'''

import statistics

ratings = [1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]
rating_counts = {i: ratings.count(i) for i in range(1, 6)}

min_rating = min(ratings)
max_rating = max(ratings)
range_rating = max_rating - min_rating
mean_rating = statistics.mean(ratings)
median_rating = statistics.median(ratings)
mode_rating = statistics.mode(ratings)
variance_rating = statistics.variance(ratings)
std_dev_rating = statistics.stdev(ratings)

print(f"Rating Counts: {rating_counts}")
print(f"Minimum: {min_rating}, Maximum: {max_rating}, Range: {range_rating}")
print(f"Mean: {mean_rating}, Median: {median_rating}, Mode: {mode_rating}")
print(f"Variance: {variance_rating}, Standard Deviation: {std_dev_rating}")
