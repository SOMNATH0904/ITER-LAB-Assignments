'''
Ques 16: Import relevant Python modules and print the values of eπ and πe. Then, if eπ > πe, print ”ok”.
Otherwise print ”ok anyway”.
'''

import math

ePi = math.e ** math.pi
piE = math.pi ** math.e

print("e^π =", ePi)
print("π^e =", piE)

if ePi > piE:
    print("ok")
else:
    print("ok anyway")



'''
Output->
e^π = 23.140692632779263
π^e = 22.45915771836104
ok
'''