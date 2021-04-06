# The printLL(self) method will not work no matter how much I try. When I try to figure
# out how to fix the "AttributeError: 'LinkedList' object has no attribute 'data'"
# error, I still get the same error no matter what when I change the if statement
# to "while current is not None :" I have spent hours to fix this issue, but I
# still could not figure it out at all.  

class Node :
  # Constructor
  def __init__(self, data = None, next = None): 
    self.data = data
    self.next = next

class LinkedList :
  def __init__(self) :  
    self.head = None

  # Inserts data into the list, in this case an integer 
  def insert(self, data) :
    new = Node(data)

    if self.head is None :
      self.head = new 
      return
      
    current = self.head

    while current.next is not None :
        current = current.next

    current.next = new  

  # Prints the Linked List 
  def printLL(self) :
    current = self.head 

    while current is None :  
      print(current.data, end = " ")
      current = current.next 

  # Merges two lists together 
  def merge(List_1, List_2) : 
    mergeList = LinkedList()
    testNode = Node(0)
    tail = testNode 
    L = List_1.head
    M = List_2.head  
          
    while True:
      if L is None :
        tail.next = M 
        break
      if M is None :
        tail.next = L 
        break

      if L.data <= M.data :
        tail.next = L 
        L = L.next
      else:
        tail.next = M 
        M = M.next
                    
      tail = tail.next

    mergeList.head = testNode.next
    return mergeList 

# Test merge() function
# Linked List of L
L = LinkedList()
L.insert(3)
L.insert(6)
L.insert(9)
L.insert(14)
L.insert(17)
# Linked List of M
M = LinkedList()
M.insert(2)
M.insert(8)
M.insert(15)
M.insert(19)
M.insert(22)
# Merge Function
LM = LinkedList()
LM.head = L.merge(M) 
LM.printLL() 
