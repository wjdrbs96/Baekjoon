name = input()

list= ["c=" ,"c-" ,"dz=" ,"d-" ,"lj" ,"nj" ,"s=" ,"z="]

for i in list:
    name = name.replace(i, '*')

print(len(name))