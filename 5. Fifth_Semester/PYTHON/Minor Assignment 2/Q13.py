position = input("Enter a Chessboard Position :")

column = position[0].lower()
row = int(position[1])

columnNo = ord(column) - ord('a') + 1
if(row % 2 == columnNo % 2):
    color = "Black"
else:
    color = "White"

print(f"The color of square {position} is {color}")