name = str(input("Enter full name > "))
atBats = int(input("Enter at bats > "))
singles = int(input("Enter at singles > "))
doubles = int(input("Enter at doubles > "))
triples = int(input("Enter at tripes > "))
homeRuns = int(input("Enter home runs > "))

hits = singles + doubles + triples + homeRuns
battingAvg = hits / atBats 
sluggingAvg = ((1 * singles) + (2 * doubles) + (3 * triples) + (4 * homeRuns)) / atBats   

print("The player", name, "had:", hits, ",")
print(singles, "singles,", doubles, "doubles,", triples, "triples,", homeRuns, "home runs,")
print("his batting average was {:.3f}".format(battingAvg)) 
print("his slugging percentage was {:.3f}".format(sluggingAvg))




