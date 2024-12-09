def clean_list(lst):
    return sorted(set(lst))

lst = ["Kyiv", "Kharkiv", "Odessa", "Kyiv", "Lviv", "Kharkiv", "Dnipro"]
print(clean_list(lst))
