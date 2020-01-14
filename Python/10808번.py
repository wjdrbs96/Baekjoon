name = input()
l = [] # 알파벳
t = [] # count

for i in range(26):
    l.append(chr(97+i))
    t.append(0)

for j in range(len(name)):
    for k in range(26):
        if name[j] == chr(97+k):
            t[k]+=1
            break

for q in range(len(t)):
    print(t[q],end=" ")


