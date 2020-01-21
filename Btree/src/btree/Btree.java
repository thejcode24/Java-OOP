package btree;

import java.io.*;

class Node {

    public Node node_children[];
    public boolean isLeaf;
    public int num_nodes;
    public int node_keys[];

    Node(int m) {
        node_keys = new int[m];             // The node can have at most m keys
        node_children = new Node[m + 1];       // We have m+1references for each node
        isLeaf = true;                  // assign the node to be Leaf.
    }
}

public class Btree {

    public Node root;
    public int m;
    private static BufferedReader br;

    Btree(int m) {
        // new root
        root = new Node(m);
        this.m = m;
        // assign the root node to be a isLeaf
        root.isLeaf = true;
        root.num_nodes = 0;
        // initial the key value in the root to -1 (null)
        root.node_keys[0] = -1;
    }

    public void insert(int k) {
        // root node r
        Node r = root;

        if (r.num_nodes == this.m) {
            // Create a new node s
            Node s = new Node(this.m);
            // the new node s will become a new root node after root node r gets spilt
            root = s;
            s.num_nodes = 0;
            // the new root node is no longer a isLeaf
            s.isLeaf = false;
            s.node_children[0] = r;

            //Call the split method to split the node r because it is full
            splitChild(s, 1, r);
            //Call the insert in none full node method to insert the key k into the new node s
            insertNonfull(s, k);
        } // If the root r node is not full, just insert the key k into it by calling the insert in none full node method
        else {
            insertNonfull(r, k);
        }
    }

    public void insertNonfull(Node node, int value) {
        // Alocate the node 
        int i = node.num_nodes;
        // if the node is a isLeaf, we insert the value into the node 
        if (node.isLeaf) {
            while (i >= 1 && value < node.node_keys[i - 1]) {
                node.node_keys[i] = node.node_keys[i - 1];
                i--;
            }
            node.node_keys[i] = value;
            node.num_nodes++;
        } /*
         * if the node is not a isLeaf, the value will be inserted into the appropriate isLeaf node in the subtree.
         * Also, it will be checking if the node is full; if yes then split the node.
         */ else {
            while (i >= 1 && value < node.node_keys[i - 1]) {
                i--;
            }
            i++;
            // if the node is full, split it.
            if (node.node_children[i - 1].num_nodes == this.m) {
                // call the Split child method to split the node to two nodes
                splitChild(node, i, node.node_children[i - 1]);
                // Determine which of the two children is now the correct one to descend to.
                if (value > node.node_keys[i - 1]) {
                    i++;
                }
            }
            // Recursive Call
            insertNonfull(node.node_children[i - 1], value);
        }
    }

    public void splitChild(Node parentNode, int childIndex, Node newChild) {
        // Create a new node z, z will be the new child of node x
        Node z = new Node(this.m);
        z.isLeaf = newChild.isLeaf;
        z.num_nodes = 1;   // fix it to t-1
        z.node_keys[0] = newChild.node_keys[2];

        // if node y is not a isLeaf, assign the largest t-1 keys and child to the node z.
        if (!newChild.isLeaf) {
            z.node_children[1] = newChild.node_children[3];
            z.node_children[0] = newChild.node_children[2];
        }
        newChild.num_nodes = 1; // fix it to t -1

        // Here we insert node z as a child of node x
        for (int j = parentNode.num_nodes + 1; j >= childIndex + 1; j--) {
            parentNode.node_children[j] = parentNode.node_children[j - 1];
            parentNode.node_keys[j - 1] = parentNode.node_keys[j - 2];
        }
        // assign the reference to the node z ( node z is a child of the node x)
        parentNode.node_children[childIndex] = z;
        parentNode.node_keys[childIndex - 1] = newChild.node_keys[1];
        // increment
        parentNode.num_nodes++;
    }

    public void print() {
        // Call the printBtree Method to print the B-Tree
        printBtree(root);
    }

    public void printBtree(Node node) {
        // if the node is null print "The B-Tree is Empty"
        if (node == null) {
            System.out.println("The B-Tree is Empty");
        } else {
            System.out.println();
            for (int i = node.num_nodes - 1; i >= 0; i--) {
                if (!node.isLeaf) // Recursive Call
                {
                    printBtree(node.node_children[i]);
                }
                // print the keys
                if (node.node_keys[i] > 0) {
                    System.out.print(node.node_keys[i] + " ");
                }
            }
            if (!node.isLeaf) {
                printBtree(node.node_children[node.num_nodes]);
            }
        }
    }

    public static void main(String s[]) throws IOException {
        String filename = s[0];
        br = new BufferedReader(new FileReader(filename));
        Btree b = null;
        int m = 0;
        while (true) {
            String inp = null;
            inp = br.readLine();
            if (inp == null) {
                break;
            }

            String ss[] = inp.split(" ");
            if (ss.length == 1) {
                m = Integer.parseInt(inp);
                b = new Btree(m);
            } else {
                for (int i = 0; i < ss.length; i++) {
                    b.insert(Integer.parseInt(ss[i]));
                }
            }
        }

        b.print();

    }
}
