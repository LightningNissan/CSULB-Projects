# Used this source to figure out how to code the__init__ function
# https://www.datacamp.com/community/tutorials/role-underscore-python/ 

class SimpleHash :

    def __init__(self, numBuckets) :
        self.n = numBuckets
        self.HashTable = [[] for _ in range(numBuckets)] # Initialize Hash Table

    # Prints Hash Table  
    def displayTable(self) : 
        for i in range(len(self.HashTable)) :
            print(i, end = " ")
                    
            for j in self.HashTable[i] :
                print(" ---> ", end = " ")
                print(j, end = " ")    
                
            print()
            
    # Simple Hash Function 
    def simple_hash(self, key) :
        return key % len(self.HashTable)
    
    # Adds items into the Hash Table 
    def add(self, key) : 
        hash_key = self.simple_hash(key) 
        self.HashTable[hash_key].append(key)      # Separate Chaining 



print("Simple Hashing")

h = SimpleHash(11) 
h.add(5)  
h.add(10)
h.add(15)
h.add(20)
h.add(25)
h.add(30)
h.add(35) 
      
h.displayTable() 

print()

# Complete Output
# Simple Hashing
# 0 
# 1 
# 2  --->  35 
# 3  --->  25 
# 4  --->  15 
# 5  --->  5 
# 6 
# 7 
# 8  --->  30 
# 9  --->  20 
# 10  --->  10  


class DoubleHash :
    
    def __init__(self, numBuckets) :
        self.n = numBuckets
        self.HashTable= [- 1] * numBuckets # Initialize Hash Table with - 1 as default for empty field

    # Prints Hash Table  
    def displayTable(self) : 
        for i in range(self.n) :
            print(i, " ---> ", self.HashTable[i])

    # First Double Hash Funtion 
    def double_hash_1(self, key) : 
        return key % self.n 

    # Second Double Hash Funtion 
    def double_hash_2(self, key) : # Second Hash Funtion
        return 3 - key % 3

    # Adds items into the Hash Table  
    def add(self, key) :
        target = self.double_hash_1(key)
        
        if(self.HashTable[target] == - 1) :  
            self.HashTable[target] = key
        else :
            print("Collision is there for", key)
            i = 1
            
            # Formula For Double Hashing  
            while(1) :
                next = (target + i * self.double_hash_2(key)) % self.n 

                # If Statments To Find Empty field 
                if(self.HashTable[next] == - 1) : 
                    self.HashTable[next] = key
                    break
                    i += 1 
                    print("Collision is there for", key, "continuing with iterations")

           

print("Double Hashing")

h = DoubleHash(11) 

h.add(5)   
h.add(10)
h.add(15)
h.add(20)
h.add(25)
h.add(30)
h.add(35) 

h.displayTable() # Display Hash table - 1 represents no value in that field  
 
# Complete Output
# Double Hashing
# 0  --->  -1
# 1  --->  -1
# 2  --->  35
# 3  --->  25
# 4  --->  15
# 5  --->  5
# 6  --->  -1
# 7  --->  -1
# 8  --->  30
# 9  --->  20
# 10  --->  10 

    



