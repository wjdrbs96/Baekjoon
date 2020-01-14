books = {}
l = []
for _ in range(int(input())):
    book = input()

    if book in books.keys():
        books[book] += 1

    else:
        books[book] = 1


for key in books.keys():
    if books[key] == max(books.values()):
        l.append(key)

l.sort()
print(l[0])

