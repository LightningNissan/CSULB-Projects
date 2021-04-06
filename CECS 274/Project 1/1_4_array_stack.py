# I was having a lot of trouble trying to figure out this code, so I eventually skipped it 

from utils import new_array
from base import BaseList

class ArrayStack(BaseList) :
    def __init__(self, iterable=[]) :
        self._initialize()
        self.add_all(iterable)
        
    def _initialize(self) :
        self.a = new_array(1)
        self.n = 0

    def get(self, i) :
        if len(self.queue) == 0:
          return None
        
        a, b = self.queue[i]

        if b == 1 :
            self.queue.pop(i)
            return a 
        else:
            self.queue[i] = (a, b - 1)
            return a

    def set(self, i, x) :
        return self.items == [i] 

    def add(self, i, x) : 
        if self.n + 1 > len(self.a) :     # If self.n is too small 
            self._resize()                # Expand the capactiy 
              
        self.a[(self.n) % len(self.a)] = x
        self.n = self.n + 1     
        return True  

    def remove(self, i) : 
        x = self.a[self.n]  
        self.j = (self.n + 1) % len(self.a)
        self.n = self.n - 1 
        
        if len(self.a) >= 3 * self.n :
              self._resize()
              
        return x
  
    def _resize(self) :
        b = [None] * max(1, 2 * self.n)

        for k in range(0 , self.n) :
            b[k] = self.a[(self.j + k) % len(self.a)]
            
        self.a = b
        self.j = 0  

stack = ArrayStack()
stack.add(0,1)
stack.add(0,2)
stack.add(1,3)
stack.add(3,5)
stack.add(2,4)
print(stack.get(0)) # it prints 2
print(stack.get(1)) # it prints 3
print(stack.get(2)) # it prints 4
print(stack.get(3)) # it prints 1
print(stack.get(4)) # it prints 5 
