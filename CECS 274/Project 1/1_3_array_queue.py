from utils import new_array
from base import BaseSet

class ArrayQueue(BaseSet) :
    def __init__(self, iterable=[]) :
        self._initialize()
        self.add_all(iterable)
        
    def _initialize(self) :
        self.a = [None] * 1; 
        self.j = 0
        self.n = 0 
    
    def _resize(self):
        b = [None] * max(1, 2 * self.n)   # Doubling resize strategy 

        for k in range(0 , self.n) :
            b[k] = self.a[(self.j + k) % len(self.a)]
            
        self.a = b
        self.j = 0 
    
    def add(self, x) :
        if self.n + 1 > len(self.a) :     # If self.n is too small 
              self._resize()             # Expand the capactiy 
              
        self.a[(self.j + self.n) % len(self.a)] = x
        self.n = self.n + 1     
        return True 

    def remove(self) :
        x = self.a[self.j]  
        self.j = (self.j + 1) % len(self.a)
        self.n = self.n - 1 
        
        if len(self.a) >= 3 * self.n :
              self._resize()
              
        return x
        
def test_aq() :
    m = 10000
    n = 500
    
    q = ods.ArrayQueue()
    for i in range(m) :
        q.add(i)

        if q.size() > n: 
            x = q.remove()
            assert x == i - n 

queue = ArrayQueue()

print(queue.remove()) # it prints “None”
queue.add(1) 
queue.add(2) 
queue.add(3)
print(queue.remove()) # it returns 1
queue.add(4)
print(queue.remove()) # it returns 2
print(queue.remove()) # it returns 3
queue.add(5)
print(queue.remove()) # it returns 4
print(queue.remove()) # it returns 5
print(queue.remove()) # it prints “None”

 




