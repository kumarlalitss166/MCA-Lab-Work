y = int(input("Enter a numer: "))
for i in range(y):
    n = y - i
    for j in range(i, y):
        print(n, end=" ")
        n = n - 1
    print()