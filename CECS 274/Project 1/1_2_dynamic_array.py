from utils import new_array

class DynamicArray:

    def __init__(self):
        self.a = new_array(1)
        self.n = 0
        self.capacity = len(self.a)

    def resize(self, capacity) :
        b = new_array(capacity)
        
        for i in range(self.n) : 
            b[i] = self.a[i]
            
        self.a = b
        self.capacity = capacity

    def insert(self, k, value) :
        if self.n == self.capacity :
            self.resize(2 * self.capacity)

        for j in range(self.n, k, -1):
            self.a[j] = self.a[j-1]
            
        self.a[k] = value
        self.n += 1

    def improved_insert(self, k, value) :
        if self.n == self.capacity :            # If there is not enough space 
            b = new_array(2 * self.capacity)    # Make a new, bigger array 

            for j in range(k) :
                b[j] = self.a[j] 
            b[k] = value

            for j in range(k, self.capacity) :
                b[j + 1] = self.a[j]
                
            self.capacity *= 2                  # Increase the capacity by twice as much 
            self.a = b                          # Self.a is = to a new array with twice as much as self.capacity  
        else :
            for j in range(self.n, k, - 1) :    # Shift rightmost first 
                self.a[j] = self.a[j - 1]
                
            self.a[k] = value                   # Store the newest element 
        self.n += 1                             # Add one to self.n 

    def __str__(self):
        s = "["
        
        for i in range(self.n) :
            s += "%r" % self.a[i]

            if i < self.n - 1 :
                s += ","
        
        s += "]"
        return s

dynamic_array = DynamicArray()

dynamic_array.improved_insert(0, 2)
dynamic_array.improved_insert(0, 1)
dynamic_array.improved_insert(0, 3)
dynamic_array.improved_insert(1, 4)

print(dynamic_array)
