package tree;

/**
 * This tree is badass!! Tests are passing, we can release!
 *
 * @author EADN10 team I-f
 *
 */
public class MyTree {
  private MyNode root;

  /**
   * Class constructor.
   */
  public MyTree() {
  }

  /**
   * Return a reference to the root in this tree.
   *
   * @return Reference to the root node.
   */
  public MyNode getRoot() {
    return root;
  }

  /**
   * Appends a node in this tree. The tree is sorted by the node values.  If a
   * node with the same node value is already in the tree nothing happens.
   *
   * @param node The node to append in this tree.
   * @return True if node is appended, false otherwise.
   */
  public boolean append(MyNode node) {
    if(root == null) {
      root = node;
      return true;
    }
    MyNode iter = root;

    while(true) {
      if(iter.getValue() < node.getValue()) {
        if(iter.getRightChild() != null) {
          iter = iter.getRightChild();
        }
        else {
          iter.setRightChild(node);
          return true;
        }
      }
      else if(iter.getValue() > node.getValue()) {
        if(iter.getLeftChild() != null) {
          iter = iter.getLeftChild();
        }
        else {
          iter.setLeftChild(node);
          return true;
        }
      }
      else if(iter.getValue() == node.getValue()) {
        return false;
      }
    }
  }

  /**
   * Calculate the number of nodes in this tree. Recursively calculate the
   * number of nodes in this search tree.
   *
   * @return The total number of nodes.
   */
  public int cardinal() {
    if(root == null) {
      return 0;
    }
    return root.calcSize();
  }
}
