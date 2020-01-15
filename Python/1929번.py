import math

def isPrime(num):
    if num == 1:
        return False

    n = int(math.sqrt(num))

    for k in range(2, n+1):
        if num % k == 0:
            return False
    return True

# main
m, n = map(int, input().split())
for k in range(m, n+1):
    if isPrime(k):
        print(k)



