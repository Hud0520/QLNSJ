/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.text.StyleConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Hud
 */
public class MyTree extends JTree{
    public DefaultTreeModel getTreeModel(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(new MyTreeNode("Quản lý nhân sự", null));
        DefaultMutableTreeNode qlk = new DefaultMutableTreeNode(new MyTreeNode("Quản lý nhân sự theo khoa", "src/Util/Icon/Nhansu.png"));
        DefaultMutableTreeNode qlnv = new DefaultMutableTreeNode(new MyTreeNode("Quản lý nhân viên", "src/Util/Icon/Users.png"));
        DefaultMutableTreeNode qll = new DefaultMutableTreeNode(new MyTreeNode("Quản lý lương", "src/Util/Icon/luong1.png"));
        root.add(qlk);
        root.add(qlnv);
        root.add(qll);
        return new DefaultTreeModel(root);
    }
    
    public class MyCellRender extends DefaultTreeCellRenderer{

        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            Component c = super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
            MyTreeNode myTreeNode = (MyTreeNode) node.getUserObject();
            setText(myTreeNode.getName());
            if(node.isLeaf()){
                setIcon(new ImageIcon(myTreeNode.getIcon()));
            }else{
                setIcon(null);
            }
            return c;
        }
        
    }
}
