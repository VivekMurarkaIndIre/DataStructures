def swap(arr,pos1,pos2):
    temp=arr[pos1]
    arr[pos1]=arr[pos2]
    arr[pos2]=temp

def move_zeros(arr):
    start=0
    end=len(arr)-1
    while(start <= end):
        if(arr[start]!=0):
            if(arr[end] ==0):
                swap(arr,start,end)
                end=end-1
                start=start+1
            else:
                end=end-1
        else:
            start=start+1



arr = [1, 1, 0, 2, 1, 2, 0, 2, 1, 0, 0, 2, 1, 0]

move_zeros(arr)

print(arr)
        