Algorithm Main():
1. Initialize root as NULL
2. Define the given data array: [10, 5, 15, 3, 7]
3. For each key in the array:
a. root = InsertBST(root, key)
4. Return root

Algorithm InsertBST(root, key):
1. If root is NULL:
a. Create a new node with value key
b. Return the new node as root
2. If key < root.value:
a. root.left = InsertBST(root.left, key)
3. Else if key > root.value:
a. root.right = InsertBST(root.right, key)
4. Return root