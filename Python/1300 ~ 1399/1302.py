books = {}
for _ in range(int(input())):
    book = input()

    if book in books.keys():
        books[book] += 1

    else:
        books[book] = 1


lst=[]
for key in books.keys():
    if books[key] == max(books.values()):
        lst.append(key)
lst=sorted(lst)
print(lst[0])

