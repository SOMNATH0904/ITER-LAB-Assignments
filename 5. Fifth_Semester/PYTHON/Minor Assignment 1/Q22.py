'''
Ques 22: Write a program that begins by reading a temperature from the user in degrees Celsius. Then your
program should display the equivalent temperature in degrees Fahrenheit and degrees Kelvin. The
calculations needed to convert between different units of temperature can be found on the Internet.
'''

celsius = float(input("Enter the temperature in degrees Celsius: "))

fahrenheit = (celsius * 9/5) + 32
kelvin = celsius + 273.15

print("Temperature in Fahrenheit:", round(fahrenheit, 2), "°F")
print("Temperature in Kelvin:", round(kelvin, 2), "K")


'''
Output ->
Enter the temperature in degrees Celsius: 75
Temperature in Fahrenheit: 167.0 °F
Temperature in Kelvin: 348.15 K
'''
