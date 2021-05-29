/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Hud
 */
public class MyTree extends JTree{
    public DefaultTreeModel getTreeModel(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(new MyTreeNode("Trang Chủ", "src/Util/Icon/Home.png"));
        DefaultMutableTreeNode qlk = new DefaultMutableTreeNode(new MyTreeNode("Quản lý khoa", "src/Util/Icon/Nhansu.png"));
        DefaultMutableTreeNode qlnv = new DefaultMutableTreeNode(new MyTreeNode("Quản lý nhân viên", "src/Util/Icon/Users.png"));
        DefaultMutableTreeNode qll = new DefaultMutableTreeNode(new MyTreeNode("Quản lý lương", "src/Util/Icon/luong1.png"));
        DefaultMutableTreeNode qlgd = new DefaultMutableTreeNode(new MyTreeNode("Phân công giảng dạy", "src/Util/Icon/Task list.png"));
        root.add(qlk);
        root.add(qlnv);
        root.add(qll);
        root.add(qlgd);
        root.add(new DefaultMutableTreeNode(new MyTreeNode("Thoát", "src/Util/Icon/Exit.png")));
        return new DefaultTreeModel(root);
    }
    
    public class MyCellRender extends DefaultTreeCellRenderer{

        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            Component c = super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
            MyTreeNode myTreeNode = (MyTreeNode) node.getUserObject();
            setText(myTreeNode.getName());
            setIcon(new ImageIcon(myTreeNode.getIcon()));
            return c;
        }
        
    }
}
