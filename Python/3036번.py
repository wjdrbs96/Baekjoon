def get_gcd(n1, n2):
    if n1 < n2:
        n1, n2 = n2, n1

    while n2 != 0:
        n = n1 % n2
        n1 = n2
        n2 = n

    return n1


N = int(input())

r = list(map(int, input().split()))

first_ring, r = r[0], r[1:]

for i in r:
    gcd = get_gcd(first_ring, i)
    print(str(first_ring // gcd) + '/' + str(i // gcd))




