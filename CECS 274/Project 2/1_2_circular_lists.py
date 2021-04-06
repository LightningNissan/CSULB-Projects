class Node :    
    def __init__(self,data) :    
        self.data = data;    
        self.next = None;    
     
class CreateList :    
    def __init__(self) :    
        self.head = 0
        self.tail = 0

    # Adds data into the list, in this case an integer  
    def add(self, data) :    
        node = Node(data)
        
        if self.head == 0 :
            self.head = node
            self.tail = node
            self.head.next = self.tail
            self.tail.next = self.head
        else :
            self.tail.next = node
            self.tail = node
            self.tail.next = self.head 

    # This function will print the nodes of circular linked list from the head
    def print(self) :
        temp = self.head
        print("{", end = " ")           # Beginning of the displayed list 
    
        while True :
            print(temp.data, end = " ") # Prints each piece of data individually 
            temp = temp.next            # Moves on to the next index 
            
            if temp == self.head :      # If Statement to end the data being printed 
                break
        print("}")                      # End of the displayed list 

    # This function will count the nodes of circular linked list    
    def countNodes(self) :    
        count = 0
        temp = self.head
        
        while True :               # While Loop used to count the nodes 
            count += 1             # Adds 1 to the total count of nodes 
            temp = temp.next       # Moves on to the next index 
        
            if temp == self.head : # If Statement to end the counter 
                break
            
        print("Number Of Nodes Is >", count)  
     
class CircularLinkedList :    
    cl = CreateList();    
    # Adds data to the list    
    cl.add(4);    
    cl.add(5);    
    cl.add(7);    
    cl.add(8);    
    cl.add(12);    
    cl.add(56);   
    cl.add(85);
    cl.add(41); 
    # Displays all the nodes present in the list   
    cl.print();
    cl.countNodes();
