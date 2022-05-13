/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.KhoaHocPanel;
import view.LopHocPanel;
import view.SinhVienPanel;
import view.TrangChuPanel;

/**
 *
 * @author LENOVO
 */
public class ChuyenManHinh {
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;
    public ChuyenManHinh(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(255, 0, 0));
        jpnItem.setBackground(new Color(255, 0, 0));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuPanel());
        root.validate();
        root.repaint();
    }
     
    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for(DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
                
        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuPanel();
                    break;
                case "SinhVien":
                    node = new SinhVienPanel();
                    break;
                case "KhoaHoc":
                    node = new KhoaHocPanel();
                    break;
                case "LopHoc":
                    node = new LopHocPanel();
                    break;  
                default:
                    node = new TrangChuPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }
            
        @Override
        public void mousePressed(MouseEvent e) {
            //kindSelected = kind;
            //jpnItem.setBackground(new Color(96, 100, 191));
            //jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //jpnItem.setBackground(new Color(96, 50, 191));
            //jlbItem.setBackground(new Color(96, 50, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            /*if(!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(130, 130, 130));
                jlbItem.setBackground(new Color(76, 175, 80));
            }*/
        }
        
    }
    
    private void setChangeBackground(String kind) {
        for(DanhMucBean item : listItem) {
            if(item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(0, 0, 255));
                item.getJlb().setBackground(new Color(0, 0, 255));
            } else {
                item.getJpn().setBackground(new Color(221, 8, 8));
                item.getJlb().setBackground(new Color(221, 8, 8));
            }
        }
    }
}
