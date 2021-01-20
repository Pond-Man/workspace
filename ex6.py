#making a bunch of variables and assigning them to strings
x = "There are %d types of people." % 2
binary = "binary"
do_not = "don't"
#we have to name the variables in the lines before using them,
#otherwise the program will see the variable as undefined
y = "Those who know %s and those who %s." % (binary, do_not)
#printing two variables
print x
print y

print "I said: '%r'." % x
print "I also said: '%s'." % y
#setting a boolean value
hilarious = False
joke_evaluation = "Isn't that joke so funny?! %r"
#we haven't yet put a value for %r but
#we can do it here instead of in the print line
print joke_evaluation % hilarious

w = "This is the left side of... "
e = "a string with a right side."
#adding the two strings here joins them together
print w + e
#we can add a space in either string
o = "This is the left side of..."
f = " a string with a right side."
print o + f
