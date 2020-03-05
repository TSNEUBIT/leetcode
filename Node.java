import java.util.List;

/*
@author lushuai
@date  2019/10/30-12:18
*/
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
