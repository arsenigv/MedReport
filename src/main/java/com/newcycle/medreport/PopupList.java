package com.newcycle.medreport;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

public class PopupList extends javax.swing.JDialog {

    /**
     * Создание диалогового окна со списком элементов (строк из определенного
     * текстового файла) String title - Заголовок окна URL pathToFile -
     * расположение нужного текстового файла int type - значения, определяющие
     * каким образом будет происходить добавление значений в текстовые поля. 0 -
     * добавление единственного элемента, 1 - конкатенация выбранных значений с
     * добавлением пунктуации, 2 - добавление значений в несколько полей
     * программы
     */
    DefaultListModel<String> listModel;

    public PopupList(java.awt.Frame parent, boolean modal, String title, InputStream pathToFile, int type) {
        super(parent, modal);
        this.type = type;
        initComponents();
        listModel = new DefaultListModel<>();
        fillList(pathToFile);
        if (type == 0) {
            jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }
        this.setTitle(title);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Жалобы");

        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (type) {
            case (0):
                str = jList1.getSelectedValue();
                break;
            case (1):
                chooseAndConcatComa();
                break;
            case (2):
                chooseAndConcatDot();
                break;
            case (3):
                chooseAndSeparate();
                break;
            default:
                chooseAndConcatComa();
                break;
        }
        PopupList.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void chooseAndConcatComa() {
        List<String> list = jList1.getSelectedValuesList();
        sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
            sb.append(", ");
        }
        str = sb.toString();
    }

    private void chooseAndConcatDot() {
        List<String> list = jList1.getSelectedValuesList();
        sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
            sb.append(". ");
        }
        str = sb.toString();
    }

    private void chooseAndSeparate() {
        List<String> list = jList1.getSelectedValuesList();
        diagnoses = new ArrayList<>();
        for (String s : list) {
            String code = s.substring(0, s.indexOf("-"));
            String info = s.substring(s.indexOf("-") + 2);
            String[] array = {code, info};
            diagnoses.add(array);
        }
    }

    public StringBuilder getSb() {
        return sb;
    }

    public String getStr() {
        return str;
    }

    public List<String[]> getDiagnoses() {
        return diagnoses;
    }

    private void fillList(InputStream is) {
        String line = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {

            if (is != null) {
                while ((line = reader.readLine()) != null) {
                    listModel.addElement(line);
                }
            }
            jList1.setModel(listModel);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private StringBuilder sb;
    private String str;
    private List<String[]> diagnoses;
    private int type;
}
