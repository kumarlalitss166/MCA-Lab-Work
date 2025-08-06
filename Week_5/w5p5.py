import numpy as np

m, n = int(input("Enter the number of Rows: ")), int(input("Enter the number of columns: "))
arr = np.array(list(map(int, input("Enter space separated elements for the matrix: ").split()))).reshape(m, n)
print(arr,'\n')
new_arr = []
for i in range(m):
  if i % 2 == 0:
    for j in range(n):
      if j % 2 != 0:
        new_arr.append(int(arr[i][j]))
new_arr = np.array(new_arr).reshape(int(m/2), int(n/2))
print(new_arr)