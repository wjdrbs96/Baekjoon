color1 = input()
color2 = input()
color3 = input()

color = [color1, color2, color3]

d = {"black" : "0", "brown" : "1", "red" : "2", "orange" : "3",
     "yellow" : "4", "green" : "5", "blue" : "6",
     "violet" : "7", "grey" : "8", "white" : "9"
    }

st = ""

for i in range(len(color)-1):
    for j in d.keys():
        if color[i] == j:
            st+=d[j]


mul = pow(10,int(d[color[2]]))
mul = int(st) * mul

print(mul)