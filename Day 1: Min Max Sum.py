arr = list(map(int, input().split()))
arr.sort()
largest = 0
smallest = 0
for i in range(len(arr)-1, 0, -1):
    largest += arr[i]

arr.reverse()
for i in range(len(arr)-1, 0, -1):
    smallest += arr[i]
print(smallest, largest)
