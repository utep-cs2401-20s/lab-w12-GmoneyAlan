import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class myBinarySearchTreeTester {
    //Testing a simple tree with an array of size 6.           5
    // Where it will have a height 2 with                  2    |     7
    //                                                 1  |  3  |  6  |  -1
    // With a node not having two children
    @Test
    void treeTest1(){
        int[] A = {5,2,7,3,1,6};
        myBinarySearchTreeNode alan = new myBinarySearchTreeNode(A); //Instantiating the class
        assertEquals(A.length, alan.size());            //Confirming that the size of the tree 6
        assertEquals(2, alan.height());        //Seeing if the height of tree is 2 where the root is 0
        assertEquals(2, alan.depth(6)); //Making sure If it finds the search value itll return how to
    }                                                   // deep it is in the tree
    //------------------------------------------------------------------------------------------------------------------
    //Testing a tree with simple array of increasing order where the height should be 2,
    // and the tree should look like this:      1
    //                                            2
    //                                              3
    //Makes sure it would build the tree how it suppose to be
    @Test
    void treeTest2(){
        int[] A = {1,2,3};
        myBinarySearchTreeNode alan = new myBinarySearchTreeNode(A); //Making the class
        assertEquals(A.length, alan.size());            // Making sure the size of the tree is 3
        assertEquals(2, alan.height());        // Checking for the height of the tree to see if it is 2
        assertEquals(0, alan.depth(1)); // Making sure the method returns 0 when we are looking
    }                                                   //for the root of the tree
    //------------------------------------------------------------------------------------------------------------------
    //Testing a tree with an array of decreasing order where the height should be 4
    //The tree should like this:        4
    //                                3
    //                              2
    //                            1
    // Makes sure it builds the tree in decreasing order
    @Test
    void treeTest3(){
        int A[] = {4,3,2,1};
        myBinarySearchTreeNode alan = new myBinarySearchTreeNode(A);
        assertEquals(A.length, alan.size());            //Checking the size of the tree to see if it is 3
        assertEquals(3, alan.height());        // Testing height for 3
        assertEquals(2, alan.depth(2)); //Testing the method if it will stop at the value
    }                                                   //and not continue on to the value 1
    //------------------------------------------------------------------------------------------------------------------
    //Testing a tree where there is only one node and seeing if all the methods will work as intended
    //The tree would look like this:           1
    //Where the right/left values are set to null
    @Test
    void treeTest4(){
        int A[] = {1};
        myBinarySearchTreeNode alan = new myBinarySearchTreeNode(A);
        assertEquals(A.length, alan.size());             // Checking the size of the tree to be 1
        assertEquals(0, alan.height());         // Height of the tree should be 0 since only the root exists
        assertEquals(-1, alan.depth(6)); // Should return -1 since the value does not exist
    }
    //------------------------------------------------------------------------------------------------------------------
    //Testing an array with repeating integers to see if the second integer will be ignored and
    // if the depth method will traverse the tree but stop at the root since that will be the search value we are looking for
    //The tree looks like:                  4
    //                                  3   |      5
    //                              2   |   |  6   |   8
    //                                      |          |    9
    //
    @Test
    void treeTest5(){
        int A[] = {4,3,2,3,5,8,9,6};
        myBinarySearchTreeNode alan = new myBinarySearchTreeNode(A);
        assertEquals(A.length, alan.size());             // Checking for size of the the tree if it equals A.length
        assertEquals(3, alan.height());         //Making sure the height method returns 3
        assertEquals(0, alan.depth(4)); //Checking depth method
    }
}
