name = input()
name = name.upper()
d = []
c = []

for i in range(26):
    d.append(chr(65+i))
    c.append(0)

for j in range(len(name)):
    for k in range(26):
        if chr(65 + k) == name[j]:
            c[k]+=1

if c.count(max(c)) > 1:
    print("?")
else:
    print(chr(65 + c.index(max(c))))


#name = input()
#name = name.upper()
#d = {}
#l = []

#for i in range(26):
#    d[chr(65 + i)] = 0

#for j in range(len(name)):
#    for k in range(26):
#        if chr(65 + k) == name[j]:
#            d[chr(65 + k)] += 1

#for key in d.keys():
#    if d[key] == max(d.values()):
#        l.append(key)

#if len(l) > 1:
#    print("?")
#else:
#    print(l[0])


