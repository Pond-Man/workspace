
def bottles():
    print "\nWould you like to play 99 bottles of beer?"

    choice = raw_input("> ")

    if choice == "yes":
        print "Enjoy!\n"
        song()

    elif choice == "no":
        quit()

    else:
        print "Type [yes] or [no]."
        bottles()


def song():
    for i in range(99, -1, -1):
        if i == 1:
            print "One last bottle of beer on the wall, one last bottle of beer."
            print "Take one down and pass it around, no more bottles of beer on the wall."

        elif i == 0:
            print "No more bottles of beer on the wall, no more bottles of beer."
            print "Go to the store and buy some more, 99 bottles of beer on the wall."
            bottles()

        else:
            print("{0} bottles of beer on the wall, {0} bottles of beer.".format(i))

            print("Take one down and pass it around, {0} more bottles of beer on the wall!".format(i-1))


bottles()
