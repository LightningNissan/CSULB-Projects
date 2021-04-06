# The amortized time in this implementation will happen when we need
# to pop or dequeue the front element of the queue because we have to empty
# the stack until the second to last element and store the popped elements
# in the other stack_2 and then the top element of stack_1 will be the
# front of the queue. 

class Queue:
    def __init__(self) :
        self.stack_1 = []            
        self.stack_2 = []

    def enQueue(self, x) :
        self.stack_1.append(x)
        
    def deQueue(self) :
        if not self.stack_2 :
            while self.stack_1 :
                self.stack_2.append(self.stack_1.pop())
            return self.stack_2.pop()   
   
if __name__ == '__main__':
    # Initialize an instance of Queue class and test the implementation 
    q = Queue()
    
    q.enQueue(1) 
    q.enQueue(2) 
    q.enQueue(3)   
    print(q.deQueue()) # Should print 1  




    
