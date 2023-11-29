def findMedian(arr):
    arr.sort()
    if len(arr) % 2 != 0:
        median = (len(arr)) /2
        return arr[int(median)]
    else:
        median1 = len(arr)/2
        median2 = (len(arr)/2)+1
        result = (arr[int(median1)] + arr[int(median2)])/2
        return result
        
if __name__ == '__main__':
    n = int(input().strip())
    arr = list(map(int, input().rstrip().split()))
    result = findMedian(arr)
    print(result)