import turtle

a_turtle = turtle.Turtle()

a_turtle.speed(0)  

a_turtle.penup() # hide the pen for move
a_turtle.pensize(10) # play with this it determines the outline width
a_turtle.color("red")
a_turtle.goto(250, 100) # center of the circle is 100,100
a_turtle.pendown() # get ready to draw
a_turtle.circle(100) # radius of the circle is 20

a_turtle.penup() 
a_turtle.pensize(10) 
a_turtle.color("black")
a_turtle.goto(20, 100)  
a_turtle.pendown() 
a_turtle.circle(100)

a_turtle.penup()

a_turtle.pensize(10) 
a_turtle.color("blue")
a_turtle.goto(- 210, 100)  
a_turtle.pendown() 
a_turtle.circle(100)

a_turtle.penup() 
a_turtle.pensize(10) 
a_turtle.color("green")
a_turtle.goto(140, 0)  
a_turtle.pendown() 
a_turtle.circle(100)

a_turtle.penup() 
a_turtle.pensize(10) 
a_turtle.color("yellow")
a_turtle.goto(- 90, 0)  
a_turtle.pendown() 
a_turtle.circle(100) 

turtle.done() # this keeps the screen up until you close it 

