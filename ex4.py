#tells the program that a variable named "cars" is equal to an int value of 100
cars = 100
#tells the program that a variable named "space_in_a_car" is equal to a float value of 4.0
space_in_a_car = 4.0 #makes "carpool_capacity" 120.0 instead of 120 (not necessary)
#the equal character assigns the value on the right to the variable on the left,
#the double equal "==" checks if two values are the same
drivers = 30
#adding spaces between characters is useful to make your program easier to read
#always try to make your program understandable to you
passengers = 90
#tells the program that a variable named "cars_not_driven" has a int value
#equal to the one that "cars" has
cars_not_driven = cars #using as few variables as possible makes a program easy to read
cars_driven = drivers
carpool_capacity = cars_driven * space_in_a_car #you can do math with variables
average_passengers_per_car = passengers / cars_driven
#the underscore "_" puts an imaginary space in names
#the underscore makes names easier to read


print "There are", cars, "cars available."
print "There are only", drivers, "drivers available."
print "There will be", cars_not_driven, "empty cars today."
print "We can transport", carpool_capacity, "passengers to carpool today."
print "We have", passengers, "passengers to carpool today."
print "We need to put about", average_passengers_per_car, "passengers in each car."
