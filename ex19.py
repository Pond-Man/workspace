def cheese_and_crackers(cheese_count, boxes_of_crackers):
    print "You have %d cheeses!" % cheese_count
    print "You have %d boxes_of_crackers" % boxes_of_crackers
    print "Man that's enough for a party!"
    #the \n makes a space between each time we call the function
    #When we run this script without \n it will be ugly and difficult to read
    print "Get a blanket. \n"


print "We can just give the function numbers directly:"
cheese_and_crackers(20, 30)


#def get_numbers():
    #numberA = raw_input("How much cheese do you have? ")
    #numberB = raw_input("How many crackers do you have? ")
    #return int(numberA), int(numberB)

print "Or we can ask you:"
numberA = int(raw_input("How much cheese do you have? "))
numberB = int(raw_input("How many crackers do you have? "))
#we need to convert the strings from raw_input into integers


cheese_and_crackers(numberA, numberB)


print "We can even do math inside too:"
cheese_and_crackers(10 + 20, 5 + 6)

#we removed these variables to make the raw_input segment
#print "And we can combine the two, variables and math"
#cheese_and_crackers(amount_of_cheese + 100, amount_of_crackers + 1000)
