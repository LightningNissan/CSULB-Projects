# I keep getting the error "AttributeError: 'NoneType'
# object has no attribute 'index'" no matter how many
# times I try to fix it. 

class Node:
    def __init__(self, key, val) :
        self.value = val
        self.next = None
        self.prev = None
        self.key = key
        self.index = 0
        
class HashTable:
    def __init__(self) :
        self.head = None
        self.tail = None

    # Inserts items into the Linked List by the index 
    # Traverses to find the index,
    # Checks for exisiting values,
    # Implements the values 
    def insert_by_Index(self, index, key, val) :
        if index == 0 :
            self.insert_at_First(key, val)
        else :
            node = Node(key, val)
            temp = self.head.next

            while temp != self.head and temp.index != index :
                temp = temp.next

            nextNode = temp
            prevNode = temp.prev
            node.index = index
            prevNode.next = node
            node.prev = prevNode
            nextNode.prev = node
            node.next = nextNode
            iter = nextNode

            while (iter != self.head) :
                iter.index = iter.index + 1
                iter = iter.next
                
            self.prev = self.head.prev 

    # Retrieves the values by Index
    # Returns "Not Found" if length is inadequate - (too short) 
    # Prints the value once the traversal process finds matching indices 
    def getValue_by_Index(self, index) :
        i = index

        if self.length() == 0 :
            return "Not Found"

        if self.head.index == i :
           return self.head.value

        iter = self.head.next

        while iter != self.head :
            if iter.index == i :
                return iter.value

            iter = iter.next

    # Retrieves the values by key
    # Returns "Not Found" if length is inadequate - (too short) 
    # Prints the value once the traversal process finds matching keys              
    def getValue_by_Key(self, key) :
        if self.length() == 0 :
            return "Not Found"

        if self.head.key == key :
            return self.head.value

        iter = self.head.next

        while iter != self.head :
            if iter.key == key :
                return iter.value

            iter = iter.next 
        
    def delete_by_Value(self, val) :
        temp = self.head

        while(temp != self.tail):
            if temp.value == val:
                break

            prev = temp
            temp = temp.next

        prev.next = temp.next
        temp == None  

    # Deletes items into the Linked List by the index 
    def delete_by_Index(self, val) :
        temp = self.head

        while(temp!=self.tail):
            if temp.index == val:
                break

            prev = temp
            temp = temp.next

        prev.next = temp.next
        temp == None 

    # Deletes items into the Linked List by key  
    def delete_by_Key(self,val) :
        temp = self.head

        while(temp != self.tail) :
            if temp.key == val :
                break
    
            prev = temp
            temp = temp.next
           
        prev.next = temp.next 
        temp == None
        
    # Traverses the entire map
    # Prints key then value for each index in the map 
    def print_all_keyValues(self) :
        if self.length() == 0 :
            print("List Is Empty")
            return

        print(self.head.key, self.head.value)
        temp = self.head.next

        while temp != self.head :
            print(temp.key, temp.value)
            temp = temp.next 

    def insert_at_First(self, key, val) :
        node = Node(key, val)

        if self.length() == 0 :  
            self.head = node
            self.tail = node
            node.next = node
            node.prev = node
        else:
            self.head.index += 1 
            temp = self.head.next

            while temp != self.head :
                temp.index += 1
                temp = temp.next

            node.next = self.head
            self.head.prev = node
            self.head = node
            node.prev = self.tail
            self.tail.next = node 
    
    def insert_at_Last(self, key, val) :
        node = Node(key, val)

        if self.length() == 0 :
            self.head = node
            self.tail = node
        else :
            node.index = self.tail.index + 1
            node.next = self.head
            self.head.prev = node
            node.prev = self.tail
            self.tail.next = node
            self.tail = node 
    
    def length(self) :
        if self.head != None and self.tail != None :
            return self.tail.index + 1
        else :
            return "Note: Table is Empty!"



# test cases               
d1 = HashTable()

d1.insert_at_First("csulb",1)
d1.insert_at_First("CECS",2)
d1.insert_at_First("CECS274",3)
d1.insert_at_Last("CS",4)
d1.insert_by_Index(1,"life",12)
d1.insert_by_Index(0,"time",44)
d1.insert_by_Index(3,"value",12)
d1.insert_by_Index(4,"good",26)
d1.insert_by_Index(4,"eng",27)
d1.delete_by_Value(8)
d1.delete_by_Index(1)
d1.delete_by_Key("time")
d1.insert_at_First("why",24)
d1.insert_at_Last("how",57)
d1.insert_by_Index(3,"know",145)
d1.insert_by_Index(4,"yes",243)

print("HashTable: ",end="")
d1.print_all_keyValues()
print("Length:",d1.length())
print("Value at Key 'eng':",d1.getValue_by_Key("eng"))
print("Value at Key 'csulb':",d1.getValue_by_Key("csulb"))
print("Value at index 3:",d1.getValue_by_Index(3))
print("Value at index 7:",d1.getValue_by_Index(7))





