class HashTable :
    def __init__(self) :
        self.size = 11   
        self.slots = [None] * self.size
        self.data = [None] * self.size

    def hashFunc(self, key, size) :
        return key % size

    # Inserts the item in the Hash Table  
    def insert(self, key, data) :
        hashvalue = self.hashFunc(key, len(self.slots))

        if self.slots[hashvalue] == None :
            self.slots[hashvalue] = key
            self.data[hashvalue] = data
        else:
            if self.slots[hashvalue] == key :
                self.data[hashvalue] = data  
            else:
                nextSlot = self.rehash(hashvalue, len(self.slots))

                while self.slots[nextSlot] != None and self.slots[nextSlot] != key :
                    nextSlot = self.rehash(nextSlot, len(self.slots))
    
                    if self.slots[nextSlot] == None:
                        self.slots[nextSlot]= key
                        self.data[nextSlot]= data
                    else:
                        self.data[nextSlot] = data
            
    # Increases the size of the Hash Table when the number of items reaches the maximum threshold value 
    def rehash(self, oldhash, size) :
        return (oldhash + 1) % size
    
    # Finds the item in the Hash Table  
    def lookup(self, key) :
        firstSlot = self.hashFunc(key,len(self.slots))

        data = None
        stop = False
        found = False
        pos = firstSlot 
        
        while self.slots[pos] != None and not found and not stop :
            if self.slots[pos] == key :
               found = True
               data = self.data[pos]
            else:
                pos = self.rehash(pos, len(self.slots))
                
                if pos == firstSlot :
                    stop = True
        return data

    def __getitem__(self, key) :
        return self.lookup(key)

    def __setitem__(self, key, data) :
        self.insert(key,data)



H = HashTable()

H[1]= "blue"
H[2]= "green"
H[3]= "red"
H[4]= "black"
H[5]= "white"
H[6]= "purple"
H[7]= "yellow"
H[8]= "orange"
H[9]= "gray"
H[10] = "teal"

print(H.slots)       # Output -> [None, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]      
print(H.data)        # Output -> [None, 'blue', 'green', 'red', 'black', 'white', 'purple', 'yellow', 'orange', 'gray', 'teal']   

print(H[1])          # Output -> blue 
print(H[2])          # Output -> green 
 
H[5]= "magenta"       
H[7] = "indigo"      

print(H[5])          # Output -> magenta 
print(H[7])          # Output -> indigo

# Complete Output
# [None, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# [None, 'blue', 'green', 'red', 'black', 'white', 'purple', 'yellow', 'orange', 'gray', 'teal']
# blue 
# green 
# magenta 
# indigo 

