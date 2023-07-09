def findTotalNumberOfJump(arr):
    a=arr[0]
    b=arr[0]
    jump=0
    for i in range(1,len(arr)-1):
        
        print(i)
        if(a==0 and b==0):
            print('jump not possible')
            return -1
        if(arr[i]>b):
            b=arr[i]
        
        if(a==0):
            a=b
            jump=jump+1
        
        a=a-1
        b=b-1

    return jump

# not possible
arr= [3,2,1,0,4]

# possible
arr1= [1,3,5,8,9,2,6,7,8,9]

print('Min. number of jump required = ', findTotalNumberOfJump(arr))

print('Min. number of jump required = ', findTotalNumberOfJump(arr1))



        
