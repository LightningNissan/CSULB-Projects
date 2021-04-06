class LinkedQueue: 
    # FIFO queue implementation using a singly linked list for storage 
    class Node:
        def __init__(self, data, next = None):
            self.data = data
            self.next = next 

    def __init__(self):   
        # Make an empty queue 
        self.head = None
        self.tail = None
        self.size = 0  

    def len(self):
        # Return the number of elements in the queue 
        return self.size

    def is_empty(self):
        # Return True if the queue is empty 
        return self.size == 0

    def first(self):
        # Return (but do not remove) the element at the front of the queue
        if self.is_empty():
            print("Error > Queue Is Empty")
            return None
        
        return self.head.data  # Returning data of head node 
            
    def dequeue(self):
        # Remove and return the first element of the queue (i.e., FIFO) 
        if self.is_empty():
            print("Error > Queue Is Empty")
            return None
            
        data = self.head.data
        self.head = self.head.next  # Advancing to the next head
            
        if self.head is None:       # If Statment to set the tail to None if head is None
            self.tail = None
                
        self.size -= 1              # Updating size by reducing it by 1 
        return data                 # Return the removed data 

    def enqueue(self, e):
    # Add an element to the back of queue
        node = LinkedQueue.Node(e)        # Making a node with data = e
                
        if self.is_empty():
            self.head = self.tail = node  # First node 
        else:                             # Else Statement to Update tail / Append to tail 
            self.tail.next = node
            self.tail = node
            
        self.size += 1 
            
    def rotate(self):
        if not self.is_empty():         # If Statement that Proceeds only if queue is not empty
            reference = self.head       # Taking reference to head
            self.tail.next = reference  # Setting reference as new next of tail
            self.tail = reference       # Setting reference as new tail
            self.head = self.head.next  # Now advancing the head
            self.tail.next = None       # Setting next of tail to None 

queue = LinkedQueue()
queue.dequeue() # print error message or throw exception
queue.enqueue(6) # queue = 6
queue.enqueue(2) # queue = 6->2
queue.enqueue(7) # queue = 6->2->7
print(queue.dequeue()) # print 6 and queue = 2->7
queue.first() # print 2 and queue = 2->7
queue.enqueue(1) # queue = 2->7->1
queue.rotate() # queue = 7->1->2
queue.enqueue(5) # queue = 7->1->2->5
