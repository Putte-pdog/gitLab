package tree;

/**
 * This node is amazing omg! Tests are passing, ready for release!
 *
 * @author EDAN10 team I-f
 */
public class MyNode {
  private MyNode left;
  private MyNode right;
  private int value;

  /**
   * Class constructor initializing this node's value.
   *
   * @param value The value of this node.
   */
  public MyNode(int value) {
    this.value = value;
  }

  /**
   * Gets the value of this node.
   *
   * @return The current value of this node.
   */
  public int getValue() {
    return value;
  }

  /**
   * Sets the vlaue of this node.
   *
   * @param value The new value of this node.
   */
  public void setValue(int value) {
    this.value = value;
  }

  /**
   * Gets the right child of this node.
   *
   * @return The current right child of this node.
   */
  public MyNode getRightChild() {
    return right;
  }

  /**
   * Sets the right child of this node.
   *
   * @param right The new right child of this node.
   */
  public void setRightChild(MyNode right) {
    this.right = right;
  }

  /**
   * Gets the left child of this node.
   *
   * @return The current left child of this node.
   */
  public MyNode getLeftChild() {
    return left;
  }

  /**
   * Sets the left child of this node.
   *
   * @param left The new left child of this node.
   */
  public void setLeftChild(MyNode left) {
    this.left = left;
  }

  /**
   * Calculate the size this subtree. Recursively calculate the size of the
   * subtree in which this node is the root.
   *
   * @return The size of the subtree.
   */
  public int calcSize() {
    int cnt = 1;
    if(left != null) {
      cnt += left.calcSize();
    }
    if(right != null) {
      cnt += right.calcSize();
    }
    return cnt;
  }
}

/* END OF FILE */
