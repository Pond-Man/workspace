print "I will now count my chickens:" #simple print line

print "Hens", 25 + 30 / 6 #follows order of operations (30/6) comes first
print "Roosters", 100 - 25 * 3 % 4 #first 25 * 3 then % 4 making it 100 - 3

print "Now I will count the eggs:" #simple print line

print 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 #these numbers are always rounded, need to use floats for not rounded
print 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 #this prints 6.75 instead of 7
print 3 + 2 + 1 - 5 + 4 % 2 - 1.0 / 4.0 + 6.0 #only the important part needs to be in floats not integers (int)

print 7 / 4 #this prints 1 instead of 1.75
print 7.0 / 4.0 #this prints 1.75
#python doesn't round down it simply removes the decimals 

print "Is it true that 3 + 2 < 5 - 7" #simple print line

print 3 + 2 < 5 - 7 #outputs true or false

print "What is 3 + 2", 3 + 2
print "What is 5 - 7", 5 - 7

print "Oh, that's why it's False." #simple print line

print "How about some more." #simple print line

print "Is it greater?", 5 > -2 #true
print "Is it greater or equal?", 5 >= -2 #true
print "Is it less or equal?", 5 <= -2 #false
