def supply_data(data):
    result = {}
    for city, item, qty in data:
        if city not in result:
            result[city] = {}
        result[city][item] = qty
    return result

data = [("Kyiv", "Food", 500), ("Moscow", "Medicines", 200), ("Lviv", "Water", 300), 
        ("Saint Petersburg", "Blankets", 100), ("Kharkiv", "Food", 150)]

print(supply_data(data))
