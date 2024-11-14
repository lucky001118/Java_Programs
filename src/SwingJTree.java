import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class SwingJTree {
    public SwingJTree()
    {
        JFrame frame = new JFrame("Learning about JTree ");
        frame.setBounds(200,10,600,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        DefaultMutableTreeNode rootnode = new DefaultMutableTreeNode("Top");

        DefaultMutableTreeNode A = new DefaultMutableTreeNode("Node A");
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("Node B");

        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("Node A-1");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("Node A-2");

        DefaultMutableTreeNode B1 = new DefaultMutableTreeNode("Node B-1");
        DefaultMutableTreeNode B2 = new DefaultMutableTreeNode("Node B-2");
        DefaultMutableTreeNode B3 = new DefaultMutableTreeNode("Node B-3");

        DefaultMutableTreeNode B21 = new DefaultMutableTreeNode("Node B-2-1");
        DefaultMutableTreeNode B22 = new DefaultMutableTreeNode("Node B-2-2");
        DefaultMutableTreeNode B23 = new DefaultMutableTreeNode("Node B-2-3");
        DefaultMutableTreeNode B24 = new DefaultMutableTreeNode("Node B-2-4");

        A.add(A1);
        A.add(A2);

        B.add(B1);
        B.add(B2);
        B.add(B3);

        B2.add(B21);
        B2.add(B22);
        B2.add(B23);
        B2.add(B24);

        rootnode.add(A);
        rootnode.add(B);

        JTree tree = new JTree(rootnode);

        frame.add(tree, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingJTree();

    }
}
