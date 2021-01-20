from sys import argv

script, filename = argv

print "We're goign to erase %r." % filename
print "If you don't want that, hit CTRL-C (^C)."
print "If you do want that, hit RETURN."

raw_input("?")

print "Opening the file..."
target = open(filename, 'w') #opens file for writing
#if no mode is specified, the file is automatically opened for reading ('r')
print "Truncating the file. Goodbye!"
#'w' automatically truncates anyways
target.truncate()

print "Now I'm going to ask you for three lines."
#getting input for variables
line1 = raw_input("line 1: ")
line2 = raw_input("line 2: ")
line3 = raw_input("line 3: ")

print "I'm going to write these to the file."
#writing the variables to the file
target.write(line1)
target.write("\n")
target.write(line2)
target.write("\n")
target.write(line3)
target.write("\n")

print "And finally, we close it."
#target.close()

print """
Actually,
You know what?
Let's not close it
"""
print "Let's read it instead!"
#we reopen the file to be able to read it instead of write
#If we don't reopen like this we get an error 'IOError: File not open for reading'
target = open(filename, 'r') #opens file for reading
#target = open(filename) putting 'r' is not necessary as this is the default mode 
print target.read()

print "Now we can close it"
target.close()
