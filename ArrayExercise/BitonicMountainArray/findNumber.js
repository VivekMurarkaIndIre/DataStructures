
function findNumber(arr,start,end){
    let mid = arr.length/2;
    if(start === end){
        return arr[start];
    }
    if(end === start+1){
        
        if(arr[start]<arr[end]){
            return arr[end];
        }else{
            return arr[start];
        }
    }

    if(arr[mid]>arr[mid-1] && arr[mid] <arr[mid+1]){
        return findNumber(arr,mid,end);
    }else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
        return arr[mid];
    }else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
        return findNumber(arr,start,mid);
    }
}

const arr=[6,9,15,25,35,50,41,29,23,8];
console.log(findNumber(arr,0,arr.length-1));