str = input("Enter a String :")
for i in range(len(str)):
    for j in range(i+1, len(str)+1):
        print(str[i:j])