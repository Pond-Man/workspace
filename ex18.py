#this one is like your scripts with argv
#*args is the same as argv but it must be written like that inside the function
#print_two is the name of the function
#def tells python that this is a function
def print_two(*args):
    #after the colon, all indented lines are part of the function
    arg1, arg2 = args
    print "arg1: %r, arg2: %r" % (arg1, arg2)
#since this is no longer indented, it isn't part of the "print_two" function
#that *args is actually pointless, we can just do this
def print_two_again(arg1, arg2):
    #this is a simpler way of writting "print_two"
    print "arg1: %r, arg2: %r" % (arg1, arg2)

#this just takes one argument
def print_one(arg1):
    print "arg1: %r" % arg1

#this one doesn't take arguments
def print_none():
    print "I got nothin'."


print_two("Briac", "Cordelle")
print_two_again("Briac", "Cordelle")
print_one("First!")
print_none()

#function checklist:
"""
When you define a function, check this:
Did you start your function definition with def?
Does your function name have only characters and underscores?
Did you put an open parenthesis right after the function name?
Did you make each argument unique (no duplicated names)?
Did you put a close parenthesis and a colon after the arguments?
Did you indent all lines of code in the function to four spaces?
Did you "end" your function by going back to writing with no indent?

When you run a function, check this:
Did you call/use/run this function by typing its name?
Did you put the parenthesis after the name to run it?
Did you put the values you want into the parenthesis separated by commas?
Did you end the function call with a parenthesis?
"""
