/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MJOdorczuk
 */
public class FigI extends javax.swing.JFrame implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private final Figure figure;

    /**
     * Creates new form FigI
     * @param figure
     */
    public FigI(Figure figure) {
        initComponents();
        this.figure = figure;
        regain();
    }

    public void refresh()
    {
        this.figure.setX(Double.parseDouble(this.X_input.getText()));
        this.figure.setY(Double.parseDouble(this.Y_input.getText()));
        this.figure.setZ(Double.parseDouble(this.Z_input.getText()));
        this.figure.setSize(Double.parseDouble(this.Size_input.getText()));
    }
    
    public void regain()
    {
        this.X_input.setText(this.figure.getX().toString());
        this.Y_input.setText(this.figure.getY().toString());
        this.Z_input.setText(this.figure.getZ().toString());
        this.Size_input.setText(this.figure.getSize().toString());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        X_input = new javax.swing.JTextField();
        Y_input = new javax.swing.JTextField();
        Z_input = new javax.swing.JTextField();
        Size_input = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("X");

        jLabel2.setText("Y");

        jLabel3.setText("Z");

        jLabel4.setText("Size");

        X_input.setText("jTextField1");
        X_input.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                X_inputInputMethodTextChanged(evt);
            }
        });

        Y_input.setText("jTextField2");
        Y_input.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Y_inputInputMethodTextChanged(evt);
            }
        });

        Z_input.setText("jTextField3");
        Z_input.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Z_inputInputMethodTextChanged(evt);
            }
        });

        Size_input.setText("jTextField4");
        Size_input.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Size_inputInputMethodTextChanged(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
        });

        LoadButton.setText("Load");
        LoadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Size_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(LoadButton)
                .addGap(18, 18, 18)
                .addComponent(SaveButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(X_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Y_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Z_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Size_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(LoadButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadButtonMouseClicked
        try {
            FileInputStream fin = new FileInputStream("Vollo_illo.fig");
            ObjectInputStream ois = new ObjectInputStream(fin);
            ArrayList<Double> forRead = (ArrayList<Double>) ois.readObject();
            this.figure.setX(forRead.remove(0));
            this.figure.setY(forRead.remove(0));
            this.figure.setZ(forRead.remove(0));
            this.figure.setSize(forRead.remove(0));
            regain();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(FigI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoadButtonMouseClicked

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
        try {
            File f = new File("Vollo_illo.fig");
            if(f.exists()) f.delete();
            FileOutputStream fout = new FileOutputStream("Vollo_illo.fig");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            refresh();
            ArrayList<Double> toWrite = new ArrayList<>();
            toWrite.add(this.figure.getX());
            toWrite.add(this.figure.getY());
            toWrite.add(this.figure.getZ());
            toWrite.add(this.figure.getSize());
            oos.writeObject(toWrite);
        } catch (FileNotFoundException ex) {
            System.out.print("TF");
        } catch (IOException ex) {
            Logger.getLogger(FigI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveButtonMouseClicked

    private void X_inputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_X_inputInputMethodTextChanged
        refresh();
    }//GEN-LAST:event_X_inputInputMethodTextChanged

    private void Y_inputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Y_inputInputMethodTextChanged
        refresh();
    }//GEN-LAST:event_Y_inputInputMethodTextChanged

    private void Z_inputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Z_inputInputMethodTextChanged
        refresh();
    }//GEN-LAST:event_Z_inputInputMethodTextChanged

    private void Size_inputInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Size_inputInputMethodTextChanged
        refresh();
    }//GEN-LAST:event_Size_inputInputMethodTextChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FigI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        Circle crc = new Circle(5., 6., 4., 15.);
        Triangle trg = new Triangle(1.,0.,-14.,16.);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FigI(crc).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField Size_input;
    private javax.swing.JTextField X_input;
    private javax.swing.JTextField Y_input;
    private javax.swing.JTextField Z_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}