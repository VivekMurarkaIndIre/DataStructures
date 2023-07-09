def findNextHighNumber(arr):
    end=len(arr)-1
    start=0
    pos=-1
    while(start<end):
        if(arr[end-1]<arr[end]):
            pos=end-1
            break 
        end-=1   
    if(pos ==-1):
        return False
    list1 = arr[pos+1:]
    list2=sorted(list1)
    j=0
    for i in range(pos+1,len(arr)):
        arr[i]=list2[j]
        j+=1
    swap(arr,pos,pos+1)
    return True

def swap(arr,pos1,pos2):
    temp=arr[pos1]
    arr[pos1]=arr[pos2]
    arr[pos2]=temp

arr=[2,1,8,7,6,5]

arr2=[1,2,3,4,5]

findNextHighNumber(arr2)
print(arr2)