''' 15. Write the output of the following program:
 (a) f = open(’PYTHON’ , ’w’)
 f . write ( ’ failure is a part of success ’)
 f = open(’PYTHON’ , ’r ’)
 print ( f . read (4))
 f . close ()
 (b) f = open(’PYTHON’ , ’w’)
 f . write ( ’ failure is a part of success ’)
 f = open(’PYTHON’ , ’r ’)
 print ( f . read ())
 f . close ()
 (c) f = open(’PYTHON’ , ’w’)
 f . write ( ’ failure is a part of success also , i am fine ’)
 f = open(’PYTHON’ , ’r ’)
 print ( f . readline ())
 f . close ()
 (d) f = open(’PYTHON’ , ’w’)
 description = [’we either choose the pain of discipline \n’ , ’or\n’ , ’the pain of regret\n’]
 f . writelines ( description )
 f . close ()
 f = open(’PYTHON’ , ’r ’)
 print ( f . read ())
 f . close ()'''
 
 
'''Answer'''
'''(a)
Output: fail

(b)
Output: failure is a part of success

(c)
Output: failure is a part of success also , i am fine

(d)
Output:

Copy code
we either choose the pain of discipline 
or
the pain of regret





'''