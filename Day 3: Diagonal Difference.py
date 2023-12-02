arr = []
sum_ = 0
secondsum = 0
n = int(input())
for i in range(n):
    arr.append(list(map(int, input().split())))
for i in range(n):
    sum_ += arr[i][i]
arr.reverse()
for i in range(n):
    secondsum += arr[i][i]
print(abs(sum_-secondsum))
        