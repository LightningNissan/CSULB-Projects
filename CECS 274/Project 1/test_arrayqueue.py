#import the directory

def test_aq():
    m = 10000
    n = 500
    q = ods.ArrayQueue()
    for i in range(m):
        q.add(i)
        if q.size() > n: 
            x = q.remove()
            assert x == i - n 



queue = ArrayQueue()
queue.remove() # it prints “Queue is empty”
queue.add(1)
queue.add(2)
queue.add(3)
queue.remove() # it returns 1
queue.add(4)
queue.remove() # it returns 2
queue.remove() # it returns 3
queue.add(5)
queue.remove() # it returns 4
queue.remove() # it returns 5
queue.remove() # it prints “Queue is empty” 
