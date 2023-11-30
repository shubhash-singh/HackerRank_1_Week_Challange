n = int(input())
arr = list(map(int, input().split()))
count_arr = [0] * n
for i in arr:
    count_arr[i] += 1
    # this line counts the occurance of each element 
    # and stores then at there index place 
print(*count_arr)

# this is a counting sorting program 
# it is one of the alternate sorting method