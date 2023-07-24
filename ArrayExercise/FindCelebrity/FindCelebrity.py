def findCelebrity(arr):
    m=len(arr)
    Y=m-1
    X=0
    found=False
    while(X<Y):
        if(arr[X][Y] == 1):
            X+=1
        else:
            Y-=1
    
    for i in range(m):
        if(arr[X][i] == 1):
            found=False
            break
        found=True
    if(found):
        return X
    return -1

arr=[[0,1,1,0],[0,0,0,0],[0,1,0,1],[0,1,0,0]]
print(findCelebrity(arr))
