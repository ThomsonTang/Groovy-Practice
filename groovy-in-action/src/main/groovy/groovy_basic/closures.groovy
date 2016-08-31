// counting all the clinks at a party using a closure
def totalClinks = 0
def partyPeople = 100

1.upto(partyPeople) { guestNumber ->
    clinksWithGuest = guestNumber - 1
    totalClinks += clinksWithGuest
}

assert totalClinks == (partyPeople * (partyPeople-1))/2
