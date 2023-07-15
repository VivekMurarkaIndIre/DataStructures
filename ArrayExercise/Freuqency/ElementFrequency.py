def elementFrequency(arr):
    n = len(arr)
    for i in range(n):
        if(arr[i] > n):
            x= arr[i] % n
        else:
            x= arr[i]
        arr[x-1]=arr[x-1] + n
    print(arr)

    for i in range(n):
        if(arr[i]<=n):
            print(-1)
        else:
            print(int(arr[i] / n))

elementFrequency([5,2,7,7,5,5,2])