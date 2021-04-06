class Node :
  def __init__(self, key = None) :
    self.key = key
    self.left = None
    self.right = None

class BST :
  def __init__(self) :
    self.root = None

  def findMin_ini(self) :
    FNode = self.findMin(self.root)
    return FNode
  
  def findMax_ini(self) :
    FNode = self.findMax(self.root)
    return FNode

  def traverseInOrder_ini(self) :
    self.traverseInOrder(self.root)

  def findMin(self, root) :
    if root is None:
      return None
    if root.left is None:
      return root
    
    return self.findMin(root.left)   

  def findMax(self, root) :
    if root is None:
      return None
    if root.right is None :
      return root
    
    return self.findMax(root.right) 

  # Insert the item in the tree  
  def insertInTree(self, root, key) :
    if root is None :
      return Node(key)
    elif root.key < key :
      root.right = self.insertInTree(root.right, key)
    else :
      root.left = self.insertInTree(root.left, key)
      
    return root 

  def delete(self, root, key) :
    if root is None :
      return root
    
    if key < root.key :
      root.left = self.delete(root.left, key) 
    elif key > root.key :
      root.right = self.delete(root.right, key)  
    else : 
      if root.left is None :
        temp = root.right
        root = None
        return temp
      elif root.right is None :
        temp = root.left
        root = None
        return temp

      temp = self.findMin(root.right)
      root.key = temp.key
      root.right = self.delete(root.right, temp.key)
     
    return root 

  def traverseInOrder(self, root) :
    if root is None : 
      return
    
    self.traverseInOrder(root.left)
    print(root.key, end = " ")
    self.traverseInOrder(root.right)
        
  def delete_ini(self, key) :
    self.root = self.delete(self.root, key)

  def insert(self, data) :
    self.root = self.insertInTree(self.root, data)

  def visit(self, node) :
    print (node.key)

  def getRoot(self) :
    return self.root



def main() :

  print ("\nInsert the following numbers: ")
  print ("15, 23, 32, 40, 57, 36, 88")

  Tree = BST()
  Tree.insert(15)
  Tree.insert(23)
  Tree.insert(32)
  Tree.insert(40)
  Tree.insert(57)
  Tree.insert(36)
  Tree.insert(88)

  print ("Output the Min Value: ")
  min = Tree.findMin_ini()
  print (min.key, "\n")

  print ("Output the Max Value: ")
  max = Tree.findMax_ini()
  print (max.key, "\n")

  print ("Inorder traversal of the given tree: ")
  Tree.traverseInOrder_ini()

  print ("\n Now delete 40")
  Tree.delete_ini(40)

  print ("\nInorder traversal of tree")
  Tree.traverseInOrder_ini()

  print ("\n Now delete 15")
  Tree.delete_ini(15)

  print ("\nInorder traversal of tree")
  Tree.traverseInOrder_ini()

  print ("\nOutput the new root node: ")
  gt = Tree.getRoot()
  print (gt.key)

 
if __name__ == "__main__" :
  main()

