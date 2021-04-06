class priorityQueue :

    def __init__(self) :
        self.heap = []              # An array of integers
        self.size = 0               # The size of heap

    def __len__(self) :
        return self.size

    def parent(self, i) :
        return int ((i - 1) / 2)  
        
    def leftChild(self, i) :
        return (i * 2) + 1
    
    def rightChild(self, i) :
        return (i * 2) + 2 
        
    def swap(self, i1, i2) :                         
        temp = self.heap[i1]
        self.heap[i1] = self.heap[i2]
        self.heap[i2] = temp 

    # Insert items into the queue 
    def insert(self, x) :  
        self.heap.append(x)
        self.size += 1
        i = self.size - 1

        while self.heap[i] > self.heap[self.parent(i)] :
            self.swap(i, self.parent(i))
            i = self.parent(i) 

    # Removes root element and swap it with the last element from the Heap 
    def delete_Max(self) :
        self.swap(0, self.size - 1)
        max_elem = self.heap.pop(self.size - 1)
        self.size -= 1
        self.heapify(0)

        return max_elem

    # Helper function to maintain maximal Heap 
    def heapify(self, i) :
        if i >= int(self.size / 2) :
            return

        if (self.heap[i] < self.heap[self.leftChild(i)]) or ((self.rightChild(i) < self.size) and (self.heap[i] < self.heap[self.rightChild(i)])) :     
            if self.heap[self.leftChild(i)] > self.heap[self.rightChild(i)] :
                self.swap(i, self.leftChild(i))      
                self.heapify(self.leftChild(i))
            else:
                self.swap(i, self.rightChild(i))
                self.heapify(self.rightChild(i)) 



# Test Cases   
        
h = priorityQueue()
h.insert(22)
h.insert(31)
h.insert(12)
h.insert(46)
h.insert(37)
h.insert(32)
print(h.heap)
x = h.delete_Max()
print(h.heap)
x = h.delete_Max()
h.insert(66)
h.insert(42)     
h.insert(56)
print(h.heap)
x = h.delete_Max()  
h.insert(41)                       
h.insert(121)          
print(h.heap)
x = h.delete_Max()
print(h.heap)

# Default Outputs :
# [46, 37, 32, 22, 31, 12]
# [37, 31, 32, 22, 12]
# [66, 32, 56, 22, 31, 12, 42]
# [121, 56, 42, 32, 31, 12, 41, 22]
# [56, 32, 42, 22, 31, 12, 41]
