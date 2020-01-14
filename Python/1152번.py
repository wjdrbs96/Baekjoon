name = input()

l = list(name.split(" "))
count = 0

for i in range(len(l)):
    if l[0] == "":
        del l[0]
    elif l[len(l)-1] == "":
        del l[len(l)-1]

print(len(l))