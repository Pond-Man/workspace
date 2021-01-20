formatter = "%r %r %r %r"

print formatter % (1, 2, 3, 4)
print formatter % ("one", "two", "three", "four")
#both lines 3 and 4 print out the four strings/ints inside the brackets
#when you put more than 4 values in the brackets, you will get an error as there aren't
#enough %r to replace the values
print formatter % (True, False, True, False)
#replaces %r with True and False values which it prints as in a string
print formatter % (formatter, formatter, formatter, formatter)
#putting formatter inside formatter, it will still print out the variable as if it is a string
print formatter % (
    "I had this thing.", #the commas put all of these on the same line
    "That you could type up right.",
    #since we are using %r instead of %s, the code prints out these lines in single quotes ''
    "But it didn't sing.",
    "So I said goodnight."
)
#this could have been typed on one line or in 4 separate print commands
#but it is nicer this way
