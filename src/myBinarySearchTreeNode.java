class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
  //Constructor to build one single node
  myBinarySearchTreeNode(int inValue){
    this.myValue = inValue;
    this.right = null;
    this.left = null;
  }
  //Constructos where an array is used to build a tree
  myBinarySearchTreeNode(int[] A){
    myValue = A[0];
    for(int i = 1; i < A.length;i++){
      insert(A[i]);
    }
  }
  //Method to add nodes after a tree is established
  //Will not add duplicates
  public void insert(int inValue){
    if(inValue >= myValue){
      if(right == null){
        right = new myBinarySearchTreeNode(inValue);
      } else if(inValue == myValue){
        System.out.println("Value already exists in the Tree.");
      } else {
        right.insert(inValue);
      }
    } else {
      if(left == null){
        left = new myBinarySearchTreeNode(inValue);
      }  else {
          left.insert(inValue);
      }
    }
  }
  //Count the height of the tree where the root is zero
  public int height(){
     int leftH = 0, rightH = 0;
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time
    if(left != null)
      leftH = 1 + left.height();
    if(right != null)
        rightH = 1 + right.height();

     if(rightH > leftH)
       return rightH;
     return leftH;
  }
  //Finds the distance between the search node and the root
  public int depth(int search){
    if(search > myValue && right != null)
      return 1 + right.depth(search);
    if(search < myValue && left != null)
      return  1 + left.depth(search);
    if(search == myValue)
      return 0;

    return -1;
  }
  //Counts each node in the tree to output size of tree
  public int size(){
    int sumL = 0;
    int sumR = 0;
    if (this.left != null)
      sumL = left.size();
    if (this.right != null)
      sumR = right.size();

    return 1 + sumL + sumR;
  }

  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
}


