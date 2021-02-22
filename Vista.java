package Algortimos;

/**
 * @author Francisco
 * clase que contiene la interface gráfica para la caluladora y su
 * funcionalidad asociada a cada botón
 */
public class Vista extends javax.swing.JFrame {
    private String expresion="";

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearBT = new javax.swing.JButton();
        divBT = new javax.swing.JButton();
        parDerBT = new javax.swing.JButton();
        parIzqBT = new javax.swing.JButton();
        sieteBT = new javax.swing.JButton();
        ochoBT = new javax.swing.JButton();
        nueveBT = new javax.swing.JButton();
        multBT = new javax.swing.JButton();
        cuatroBT = new javax.swing.JButton();
        cincoBT = new javax.swing.JButton();
        seisBT = new javax.swing.JButton();
        restaBT = new javax.swing.JButton();
        unoBT = new javax.swing.JButton();
        dosBT = new javax.swing.JButton();
        tresBT = new javax.swing.JButton();
        sumaBT = new javax.swing.JButton();
        ceroBT = new javax.swing.JButton();
        puntoBT = new javax.swing.JButton();
        cambioSignoBT = new javax.swing.JButton();
        igualBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clearBT.setText("AC");
        clearBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTActionPerformed(evt);
            }
        });

        divBT.setText("/");
        divBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBTActionPerformed(evt);
            }
        });

        parDerBT.setText(")");
        parDerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parDerBTActionPerformed(evt);
            }
        });

        parIzqBT.setText("(");
        parIzqBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parIzqBTActionPerformed(evt);
            }
        });

        sieteBT.setText("7");
        sieteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteBTActionPerformed(evt);
            }
        });

        ochoBT.setText("8");
        ochoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoBTActionPerformed(evt);
            }
        });

        nueveBT.setText("9");
        nueveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveBTActionPerformed(evt);
            }
        });

        multBT.setText("x");
        multBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multBTActionPerformed(evt);
            }
        });

        cuatroBT.setText("4");
        cuatroBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroBTActionPerformed(evt);
            }
        });

        cincoBT.setText("5");
        cincoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoBTActionPerformed(evt);
            }
        });

        seisBT.setText("6");
        seisBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisBTActionPerformed(evt);
            }
        });

        restaBT.setText("-");
        restaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaBTActionPerformed(evt);
            }
        });

        unoBT.setText("1");
        unoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoBTActionPerformed(evt);
            }
        });

        dosBT.setText("2");
        dosBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosBTActionPerformed(evt);
            }
        });

        tresBT.setText("3");
        tresBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresBTActionPerformed(evt);
            }
        });

        sumaBT.setText("+");
        sumaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaBTActionPerformed(evt);
            }
        });

        ceroBT.setText("0");
        ceroBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroBTActionPerformed(evt);
            }
        });

        puntoBT.setText(".");
        puntoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoBTActionPerformed(evt);
            }
        });

        cambioSignoBT.setText("+/-");
        cambioSignoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioSignoBTActionPerformed(evt);
            }
        });

        igualBT.setText("=");
        igualBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualBTActionPerformed(evt);
            }
        });

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sieteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ochoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nueveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(multBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cuatroBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cincoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seisBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dosBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tresBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sumaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parIzqBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parDerBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ceroBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cambioSignoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(igualBT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parIzqBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parDerBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sieteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ochoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueveBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seisBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatroBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cincoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tresBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ceroBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambioSignoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igualBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTActionPerformed
        expresion="";
        display.setText("0");
    }//GEN-LAST:event_clearBTActionPerformed

    private void parIzqBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parIzqBTActionPerformed
        expresion+=parIzqBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_parIzqBTActionPerformed

    private void parDerBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parDerBTActionPerformed
        expresion+=parDerBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_parDerBTActionPerformed

    private void divBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBTActionPerformed
        expresion+=divBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_divBTActionPerformed

    private void sieteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteBTActionPerformed
        expresion+=sieteBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_sieteBTActionPerformed

    private void ochoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoBTActionPerformed
        expresion+=ochoBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_ochoBTActionPerformed

    private void nueveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveBTActionPerformed
        expresion+=nueveBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_nueveBTActionPerformed

    private void multBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multBTActionPerformed
        expresion+="*";
        display.setText(expresion);
    }//GEN-LAST:event_multBTActionPerformed

    private void cuatroBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroBTActionPerformed
        expresion+=cuatroBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_cuatroBTActionPerformed

    private void cincoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoBTActionPerformed
        expresion+=cincoBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_cincoBTActionPerformed

    private void seisBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisBTActionPerformed
        expresion+=seisBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_seisBTActionPerformed

    private void restaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaBTActionPerformed
        expresion+=restaBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_restaBTActionPerformed

    private void unoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoBTActionPerformed
        expresion+=unoBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_unoBTActionPerformed

    private void dosBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosBTActionPerformed
        expresion+=dosBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_dosBTActionPerformed

    private void tresBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresBTActionPerformed
        expresion+=tresBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_tresBTActionPerformed

    private void sumaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaBTActionPerformed
        expresion+=sumaBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_sumaBTActionPerformed

    private void ceroBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroBTActionPerformed
        expresion+=ceroBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_ceroBTActionPerformed

    private void puntoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoBTActionPerformed
        expresion+=puntoBT.getActionCommand();
        display.setText(expresion);
    }//GEN-LAST:event_puntoBTActionPerformed

    private void cambioSignoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioSignoBTActionPerformed
        expresion+="_";
        display.setText(expresion);
    }//GEN-LAST:event_cambioSignoBTActionPerformed

    private void igualBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualBTActionPerformed
       double res;
       
       res=Calculadora.calcula(expresion);
       if(res!=-0.00021) 
            display.setText(expresion+"\n="+res);
        else
            display.setText("Error, no se puede calcular");
       
       if(display.getText().indexOf("Infinity")>0){
           display.setText(" Error, no se puede calcular");
       }
    }//GEN-LAST:event_igualBTActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambioSignoBT;
    private javax.swing.JButton ceroBT;
    private javax.swing.JButton cincoBT;
    private javax.swing.JButton clearBT;
    private javax.swing.JButton cuatroBT;
    private javax.swing.JTextArea display;
    private javax.swing.JButton divBT;
    private javax.swing.JButton dosBT;
    private javax.swing.JButton igualBT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multBT;
    private javax.swing.JButton nueveBT;
    private javax.swing.JButton ochoBT;
    private javax.swing.JButton parDerBT;
    private javax.swing.JButton parIzqBT;
    private javax.swing.JButton puntoBT;
    private javax.swing.JButton restaBT;
    private javax.swing.JButton seisBT;
    private javax.swing.JButton sieteBT;
    private javax.swing.JButton sumaBT;
    private javax.swing.JButton tresBT;
    private javax.swing.JButton unoBT;
    // End of variables declaration//GEN-END:variables
}
