name = input()
list = []
for i in range(len(name)):
    list.append(name[i:])

list.sort()

for i in range(len(list)):
    print(list[i])