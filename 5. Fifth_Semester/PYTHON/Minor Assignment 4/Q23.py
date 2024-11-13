'''
Ques 23: Using the list given below
1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5
Display a bar chart showing the response frequencies and their percentages of the total responses.
'''

import matplotlib.pyplot as plt # type: ignore

ratings = [1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]
rating_counts = {i: ratings.count(i) for i in range(1, 6)}
rating_percentages = {i: (count / len(ratings)) * 100 for i, count in rating_counts.items()}

plt.bar(rating_counts.keys(), rating_counts.values(), tick_label=list(rating_counts.keys()))
plt.xlabel("Ratings")
plt.ylabel("Frequency")
plt.title("Frequency of Ratings")
plt.show()

print(f"Percentages of Ratings: {rating_percentages}")
