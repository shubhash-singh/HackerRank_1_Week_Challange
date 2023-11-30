n = int(input())
arr = list(map(int, input().split()))
seen = set()
duplicate = set()
for i in arr:
    if i in seen:
        duplicate.add(i)
    else:
        seen.add(i)
result = set(arr) - duplicate
print(*result)