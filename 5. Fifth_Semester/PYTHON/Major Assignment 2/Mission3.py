def city_data(cities, data):
    info = {c: d for c, *d in data if c in cities}
    total_pop = sum(d[0] for d in info.values())
    total_aid = sum(d[1] for d in info.values())
    return info, total_pop, total_aid

cities = {"Kyiv", "Lviv"}
data = [("Kyiv", 2800000, 250), ("Kharkiv", 1431000, 180), ("Lviv", 721301, 90), ("Odessa", 1029049, 120)]

info, total_pop, total_aid = city_data(cities, data)
print(info)
print(total_pop)
print(total_aid)
