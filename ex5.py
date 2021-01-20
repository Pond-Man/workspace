name = 'Briac Cordelle'
age = 16
height = 180.0 #centimeters
height_inches = height * 0.3937
weight = 55.0 #kilograms
weight_pounds = weight * 2.2046
eyes = 'Brown'
teeth = 'White'
hair = 'Brown'

print "Let's talk about %s." % name #can be "Briac"
print "He's %f inches tall." % height_inches
print "He's %f pounds heavy." % weight_pounds
print "Actually that's not too heavy."
print "He's got %s eyes and %s hair." % (eyes, hair)
print "His teeth are usually %s depending on the coffee." % teeth


print "If I add %d, %d, and %d I get %d." % (age, height_inches, weight_pounds, age + height_inches + weight_pounds)
