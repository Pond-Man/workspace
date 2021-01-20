from sys import argv
#using argv to get a filename (this is better to be able to change the file easily)
script, filename = argv
#defining how many arguments the program should expect
txt = open(filename)
#opens the file
print "Here's your file %r:" % filename
#simple print that shows "Here's your file (filename (as defined in argv))"
print txt.read()
#outputs the file (prints it)
txt.close()
#closes the file

print "Type the filename again:"
#simple print
file_again = raw_input("> ")
#asks for file name again (can give a different one (if in same folder))
#also sets the file as a variable 'file_again'

txt_again = open(file_again)
#opens file named in line 15 (allows you to read it)

print txt_again.readline()
#reads the first line only
txt_again.close()
#closes file

#using raw_input to open a file can be easier as instead of putting the file name as an argument,
#it is named in the prompt and can be easily interchangeable

print "Opening the file..."
yeet = open(filename, 'w')
#'w' opens the file for writing (and truncates), 'r' is for reading and 'a' is for appending
#r+ opens for reading and writing (no truncating, file pointer at the beginning)
#w+ opens for writing (and thus truncates the file) and reading
#a+ opens for appending (writing without truncating, only at the end of the file,
#and the file pointer is at the end of the file) and reading
print "Time to truncate the file..."
yeet.truncate() #delete whatever is in the file

line1 = "I'm d"
#setting up variable
#could write:
#line1 = raw_input("Line 1 is: ")
#to get input from user
yeet.write(line1)
#adds a line to the file

yeet.close()
