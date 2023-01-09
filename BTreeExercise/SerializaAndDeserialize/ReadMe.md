## Question

Design an algorithm and write code to serialize and deserialize a binary tree.
Writing the tree to a file is called 'serialization' and reading back from
the file to reconstruct the exact same binary tree is 'deserialization' in Time and Space Complexity O(n).

## Answer
### Approach 1:
To serializa and then deserialize , we first would need to create two array
and we would store inorder and pre order traversal in that array. so than we can construct the BTree structure
back when we deserialize.

### Alternate Approach
While serializing
Use only Preorder.
Store two -1 for leaf nodes
and one -1 for internal node with one child

Then use this for deserialize
check code