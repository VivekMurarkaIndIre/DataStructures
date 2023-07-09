def swap(arr,index1, index2):
    temp=arr[index1]
    arr[index1]=arr[index2]
    arr[index2]=temp

def sortArray(arr):
    low=0
    mid=0
    high=len(arr)-1
    while(mid<=high):
        if(arr[mid] == 2):
            swap( arr,mid,high)
            high= high -1
        elif(arr[mid] == 0):
            swap(arr,mid,low)
            low=low+1
            mid=mid+1
        else:
            mid=mid+1


arr = [1, 1, 0, 2, 1, 2, 0, 2, 1, 0, 0, 2, 1, 0]
print(arr)
sortArray(arr)
print(arr)
