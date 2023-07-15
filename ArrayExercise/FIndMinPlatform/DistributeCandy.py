def distributeCandy(arr):
    n=len(arr)-1
    i=0
    j=n
    arr1=[1]*(n+1)
    arr2=[1]*(n+1) 
    while i <= n-1 and j>=1:
        if(arr[i+1]>=arr[i]):
            if(arr[i+1]==arr[i]):
                arr1[i+1]=arr1[i]
            else:
                arr1[i+1]=arr1[i]+1
        if(arr[j-1]>=arr[j]):
            if(arr[j-1]==arr[j]):
                arr2[j-1]=arr[j]
            else:
                arr2[j-1]=arr[j]+1
        j-=1
        i+=1
    print(arr1)
    print(arr2)

    for i in range(n):
        if(arr1[i]<arr2[i]):
            arr1[i]=arr2[i]
    
    return arr1

arr =[1,5,3,2,2,1]
print(distributeCandy(arr))

    
    
    