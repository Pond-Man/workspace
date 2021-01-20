from sys import argv

script, input_file = argv

def print_all(f):
    print f.read()

def rewind(f):
    #goes back to beginning of file (for readline)
    #seek defaults to 0 but can be set to 1 (relative to current position) and
    #2 (goes to the end of file)
    f.seek(0)
    #f.seek()
    #^this won't work
    #an argument must be given

def print_a_line(line_count, f):
    print line_count, f.readline()

current_file = open(input_file)

print "First let's print the whole file:\n"

print_all(current_file)

print "Now let's rewind, kind of like a tape."

rewind(current_file)

print "Let's print three lines:"

current_line = 1
print_a_line(current_line, current_file)
# += adds right operand to the left operand and assign the result to left operand
current_line += 1 #current_line = 2
print_a_line(current_line, current_file)

current_line += 1 #current_line = 3
print_a_line(current_line, current_file) #same as print_a_line(3, test.txt (second argv))
