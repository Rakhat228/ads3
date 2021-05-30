package test;

public class Bst<K extends Comparable<K>, V>{
    private Node root;
    private class Node{
        private K key;
        private V val;
        private Node left;
        private Node right;
        public Node(K key, V val){
            this.key = key;
            this.val = val;
            left = right = null;
        }
    }
    int size;

    public void put(K key, V val) {
        Node node = root;
        if (node == null) node = new Node(key,val);

        int t = key.compareTo(node.key);
        if (t == 0) node.val = val;
        else if (t > 0) node.right = new Node(key,val);
        else node.left = new Node(key,val);
        root = node;
    }


    public V get(K key){
        Node node = root;
        if ( node == null ) return null;
        int t = key.compareTo(node.key);
        if ( t < 0 ) return node.left.val;
        else if ( t > 0 ) return node.right.val;
        else return node.val;
    }

    public void delete(K key){
        put(key, null);
    }


}

