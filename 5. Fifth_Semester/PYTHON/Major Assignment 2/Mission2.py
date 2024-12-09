def find_alerts(lst1, lst2):
    all_cities = lst1.union(lst2)
    unique_cities = lst1.symmetric_difference(lst2)
    common_cities = lst1.intersection(lst2)
    return all_cities, unique_cities, common_cities

lst1 = {"Dnipro", "Kharkiv", "Kyiv", "Lviv", "Odessa"}
lst2 = {"Kyiv", "Mariupol", "Lviv", "Donetsk"}

all_cities, unique_cities, common_cities = find_alerts(lst1, lst2)
print(all_cities)
print(unique_cities)
print(common_cities)
