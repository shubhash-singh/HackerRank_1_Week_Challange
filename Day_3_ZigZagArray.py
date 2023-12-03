# def findZigZagSequence(arr, length):
#     arr.sort()
#     mid = (length+1)//2
#     mid_elem = arr[mid-1]
#     arr[mid-1] = arr[-1]
#     arr[-1] = mid_elem
#     reverse_arr = []
#     result = []
#     for i in range(length):
#         if i < mid:
#             continue
#         else:
#             reverse_arr.append(arr[i])
#     for i in range(length):
#         if i>=mid:
#             continue
#         else:
#             result.append(arr[i])
#     # print(*result)
#     reverse_arr.sort()
#     reverse_arr.reverse()
#     for i in reverse_arr:
#         result.append(i)
#     print(*result)
    
# test_cases = int(input())
# for cs in range(test_cases):
#     n = int(input())
#     a = list(map(int, input().split()))
#     findZigZagSequence(a, n)
def findZigZagSequence(a, n):
    a.sort()
    mid = int((n)/2)
    a[mid], a[n-1] = a[n-1], a[mid]

    st = mid + 1
    ed = n - 2
    while(st <= ed):
        a[st], a[ed] = a[ed], a[st]
        st = st + 1
        ed = ed - 1

    for i in range (n):
        if i == n-1:
            print(a[i])
        else:
            print(a[i], end = ' ')
    return

test_cases = int(input())
for cs in range (test_cases):
    n = int(input())
    a = list(map(int, input().split()))
    findZigZagSequence(a, n)



