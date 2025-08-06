import numpy as np

m, n = int(input("Enter the number of Rows: ")), int(input("Enter the number of columns: "))
arr = np.array(list(map(int, input("Enter space separated elements for the matrix: ").split()))).reshape(m, n)
print(arr,'\n')
for i in range(n):
  for j in range(n - i - 1):
    if (arr[1][j] > arr[1][j + 1]):
      for k in range(m):
        arr[k][j], arr[k][j + 1] = arr[k][j + 1], arr[k][j]
print(arr)

p, q = int(input("Enter the number of Rows: ")), int(input("Enter the number of columns: "))
brr = np.array(list(map(int, input("Enter space separated elements for the matrix: ").split()))).reshape(p, q)
print(brr,'\n')
for i in range(p):
  for j in range(p - i - 1):
    if (brr[j][1] > brr[j + 1][1]):
      for k in range(q):
        brr[j][k], brr[j + 1][k] = brr[j + 1][k], brr[j][k]
print(brr)