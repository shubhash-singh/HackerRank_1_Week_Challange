arr = []
n = int(input())
for i in range(n):
    arr.append(list(map(int, input().split())))
diagonal_sum = 0
reverse_diagonal_sum = 0
for i in range(n):
    diagonal_sum += arr[i][i]
arr.reverse()
for i in range(n):
    reverse_diagonal_sum += arr[i][i]
    
# print(diagonal_sum, reverse_diagonal_sum)
print(abs(diagonal_sum - reverse_diagonal_sum))