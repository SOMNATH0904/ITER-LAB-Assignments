''' 14. What will be the output produced on executing function inverse1 when the following input is entered
 as the value of variable num:
 (a)5
 (b)0 (c)2.0 (d)x (e)None
 def inverse1 ():
 t r y :
 num = input(”Enter the number: ”)
 num = float (num)
 i nverse = 1.0 / num
 except ValueError :
 print (” ValueError : Invalid input , not a number.”)
 except TypeError :
 print (”TypeError : Invalid type for operation .”)
 except ZeroDivisionError :
 print (” ZeroDivisionError : Division by zero is not allowed .”)
 except Exception as e:
 print ( f”Unexpected error : {e}”)
 else :
 print ( f”Inverse : {inverse }”)
 f i n ally :
 print (” Function inverse completed”)'''
 
 
def inverse1():
    try:
        num = input("Enter the number: ")
        num = float(num)
        inverse = 1.0 / num
    except ValueError:
        print("ValueError: Invalid input, not a number.")
    except TypeError:
        print("TypeError: Invalid type for operation.")
    except ZeroDivisionError:
        print("ZeroDivisionError: Division by zero is not allowed.")
    except Exception as e:
        print(f"Unexpected error: {e}")
    else:
        print(f"Inverse: {inverse}")
    finally:
        print("Function inverse completed")

# Test cases
# (a) 5
# (b) 0
# (c) 2.0
# (d) x
# (e) None

inverse1()