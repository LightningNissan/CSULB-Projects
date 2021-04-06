# Provdes getSizeOf() Function 
import sys                 

data = []
n = 100                     # Length 
prevCapacity = None    

for k in range(n) :
    a = len(data)           # Number of elements 
    b = sys.getsizeof(data) # Actual size in bytes 
    
    if prevCapacity and prevCapacity != b :
        print("Length: {0:3d}; Size in bytes: {1:4d}".format(a - 1, prevCapacity)) # Displays the Length and Size in Bytes 

    prevCapacity = b        # Setting prevCapacity to the size of the data 
    data.append(None)       # Increase length by one 

    
