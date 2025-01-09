''' 17. What are the outputs of the below codes and why?
 (a) s = ”how now brown cow”
 print(s[s.find(’o’):s.rfind(’o’)])
  (b) chr(ord(’A’) + 2) + chr(ord(’Z’)- 3)
 (c) s = ”abc123def456ghi789”
 indices = [i for i, c in enumerate(s) if c == ’’]
 result = s[indices[1]+1:indices[2]] + s[indices[4]+1:]
 print(result)
 (d) s = ”abracadabra”
 print(s.replace(s[s.find(’a’):s.find(’r’)], ”XYZ”))
 (e) s = ”hello”
 shift = 2
 print(””.join(chr((ord(c)- 97 + shift) % 26 + 97) for c in s))
 (f) s = ”mississippi”
 print(””.join(sorted(set(s))))'''
 
'''a'''
s = "how now brown cow"
print(s[s.find('o'):s.rfind('o')])

'''b'''
chr(ord('A') + 2) + chr(ord('Z') - 3)

'''c'''
s = "abc123def456ghi789"
indices = [i for i, c in enumerate(s) if c == '']
result = s[indices[1]+1:indices[2]] + s[indices[4]+1:]
print(result)

'''d'''
s = "abracadabra"
print(s.replace(s[s.find('a'):s.find('r')], "XYZ"))


'''e'''

s = "hello"
shift = 2
print("".join(chr((ord(c) - 97 + shift) % 26 + 97) for c in s))

'''f'''
s = "mississippi"
print("".join(sorted(set(s))))
