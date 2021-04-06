# Just like in the 1st project, I was getting the error
# "AttributeError: 'DLList' object has no attribute 'first'" 
# and I just do not know how to fix it at all.   

import numpy as np
from base import BaseList

class DLList(BaseList) :
    class Node(object) :
        def __init__(self, x) :
            self.x = x
            self.next = None
            self.prev = None

    def __init__(self, iterable = []) :
        self._initialize()
        self.add_all(iterable)

    def _initialize(self) :
        self.n = 0
        self.dummy = DLList.Node(None)
        self.dummy.prev = self.dummy
        self.dummy.next = self.dummy

    def get_node(self, i) :
        current = self.first
        
        for k in range(i) : 
            if current is None:
                return None
            current = current.next
            
        return current

    def get(self, i) :
        if i < 0 or i >= self.n: raise IndexError()
        return self.get_node(i).x

    # Remove nodes 
    def _remove(self, w) :  
        if w.prev is None :
            self.first = w.next
        else :
            w.prev.next = w.next
            
        if w.next is None :
            self.last = w.prev
        else :
            w.next.prev = w.prev 

    # Remove nodes  
    def remove(self, i: int) :
        if i < 0 or i >= self.n: raise IndexError()
        self._remove(self.get_node(i))

    # Add nodes that precede the original index of the now shifted origial node 
    def add_before(self, node, new) :
        new.next = node
        
        if node.prev is None:
            self.first = new 
        else:
            new.prev = node.prev
            new.prev.next = new  
        
        node.prev = new
        
    # Add nodes  
    def add(self, i, x) :
        if i < 0 or i > self.n:    raise IndexError()
        self.add_before(self.get_node(i), x)

    def __iter__(self) :
        u = self.dummy.next
        
        while u != self.dummy :
            yield u.x
            u = u.next
            
    def size(self) :
        return self.n

    # Adds nodes to the end of the list 
    def append(self, x)  :
        self.add(self.n, x)

    # Determines whether or not the list is a Palindrome  
    def isPalindrome(self) :
        left = self.first
        right = self.last
        
        if left is None:
            return True
        
        while left is not right :
            
            if left.data is not right.data: 
                return False

            left = left.next
            right = right.prev

        return True 

    def __str__(self) :
        s = "["
        u = self.dummy.next
        
        while u is not self.dummy:
            s += "%r" % u.x
            u = u.next
            
            if u is not None:
                s += ","
                
        return s + "]"

    def __next__(self) :
        if self.iterator != self.dummy:
            x = self.iterator.x
            self.iterator = self.iterator.next
        else:
             raise StopIteration()
            
        return x

dl = DLList()
dl.remove(0)    # print error message or raise exception
dl.add(0,5)
print(dl)   # print [5]
dl.add(0,1)
print(dl)   # print [1,5]
dl.add(1,3)
print(dl)   # print [1,3,5]
dl.add(2,6)
print(dl)   # print [1,3,6,5]
dl.remove(2)
print(dl)   # print [1,3,5]
dl.add(1,2)
print(dl)   # print [1,2,3,5]
dl.add(3,4)
print(dl)   # print [1,2,3,4,5]
dl.append(6)
print(dl)   # print [1,2,3,4,5,6]
dl.set(5,1)
print(dl)   # print [1,2,3,4,5,1]
dl.remove(3)
print(dl)   # print [1,2,3,5,1]
print(dl.isPalindrome())    # print False
