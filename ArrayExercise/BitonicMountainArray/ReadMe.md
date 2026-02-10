# Find Peak Element in Bitonic/Mountain Array

## Question

Given a **bitonic array** (also called mountain array), find the peak element. A bitonic array is an array that:
- First increases monotonically (ascending)
- Then decreases monotonically (descending)
- There is exactly one peak element (the maximum)

**Time Complexity:** O(log n) using binary search  
**Space Complexity:** O(log n) for recursion (can be O(1) with iterative approach)

## Example

**Input:** `[6, 9, 15, 25, 35, 50, 41, 29, 23, 8]`

**Output:** `50`

**Explanation:**
- Ascending part: `[6, 9, 15, 25, 35, 50]`
- Peak element: `50`
- Descending part: `[41, 29, 23, 8]`

## Algorithm Approach

This problem uses **Binary Search** on a non-sorted array by recognizing the pattern:

1. **Compare middle element with neighbors:**
   - If `arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]` → We're on the ascending slope, peak is to the right
   - If `arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]` → We found the peak!
   - If `arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]` → We're on the descending slope, peak is to the left

2. **Base cases:**
   - If `start === end`: Single element, return it
   - If `end === start + 1`: Two elements, return the larger one

## Code Structure

```javascript
function findNumber(arr, start, end) {
    // Base cases
    // Calculate mid
    // Compare with neighbors and recurse accordingly
}
```

## Key Interview Points

- **Binary Search on Pattern Recognition:** Even though array isn't sorted, we can use binary search by recognizing the bitonic pattern
- **Divide and Conquer:** Eliminate half the search space at each step
- **Edge Case Handling:** Single element, two elements, array boundaries

## Note

⚠️ **Bug in current implementation:** Line 3 calculates `mid = arr.length/2` which doesn't use the `start` and `end` parameters. It should be:
```javascript
let mid = Math.floor((start + end) / 2);
```

This ensures the binary search correctly narrows down the search space.

