/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author galetedanilo
 */
public class Banco extends javax.swing.JFrame {

    private final Queue<AtendimentoComum> comumFila;
    private final Queue<AtendimentoRapido> rapidoFila;
    private final Queue<AtendimentoPrioritario> prioritarioFila;
    
    /**
     * Creates new form Banco
     */
    public Banco() {
        this.prioritarioFila = new LinkedList<>();
        this.rapidoFila = new LinkedList<>();
        this.comumFila = new LinkedList<>();
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

        panelClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonComum = new javax.swing.JButton();
        buttonRapido = new javax.swing.JButton();
        buttonPrioritario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textFieldSenha = new javax.swing.JTextField();
        panelCaixas = new javax.swing.JPanel();
        buttonCaixaUm = new javax.swing.JButton();
        buttonCaixaDois = new javax.swing.JButton();
        buttonCaixaTres = new javax.swing.JButton();
        buttonCaixaQuatro = new javax.swing.JButton();
        labelSenha = new javax.swing.JLabel();
        labelCaixa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("PARA CLIENTES"));

        jLabel1.setText("Escolha seu tipo de atendimento.");

        buttonComum.setText("Comum");
        buttonComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonComumActionPerformed(evt);
            }
        });

        buttonRapido.setText("Rápido");
        buttonRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRapidoActionPerformed(evt);
            }
        });

        buttonPrioritario.setText("Prioritário");
        buttonPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrioritarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Sua senha eh:");

        textFieldSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textFieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addComponent(buttonComum)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRapido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonPrioritario))
                    .addComponent(jLabel2)
                    .addComponent(textFieldSenha))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRapido)
                    .addComponent(buttonComum)
                    .addComponent(buttonPrioritario))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCaixas.setBorder(javax.swing.BorderFactory.createTitledBorder("PARA CAIXAS "));

        buttonCaixaUm.setText("Caixa 1");
        buttonCaixaUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaixaUmActionPerformed(evt);
            }
        });

        buttonCaixaDois.setText("Caixa 2");
        buttonCaixaDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaixaDoisActionPerformed(evt);
            }
        });

        buttonCaixaTres.setText("Caixa 3");
        buttonCaixaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaixaTresActionPerformed(evt);
            }
        });

        buttonCaixaQuatro.setText("Caixa 4");
        buttonCaixaQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaixaQuatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCaixasLayout = new javax.swing.GroupLayout(panelCaixas);
        panelCaixas.setLayout(panelCaixasLayout);
        panelCaixasLayout.setHorizontalGroup(
            panelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaixasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCaixasLayout.createSequentialGroup()
                        .addComponent(buttonCaixaUm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(buttonCaixaDois, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCaixasLayout.createSequentialGroup()
                        .addComponent(buttonCaixaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCaixaQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCaixasLayout.setVerticalGroup(
            panelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaixasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCaixaUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCaixaDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCaixaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCaixaQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        labelSenha.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelSenha.setText("0-00");

        labelCaixa.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelCaixa.setText("Caixa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelCaixas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelCaixa)
                                .addGap(15, 15, 15)))
                        .addGap(234, 234, 234))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSenha)
                .addGap(33, 33, 33)
                .addComponent(labelCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCaixas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonComumActionPerformed
        // TODO add your handling code here:
        AtendimentoComum atComum = new AtendimentoComum();
        
        textFieldSenha.setText(atComum.getSenha());
        this.comumFila.add(atComum);
    }//GEN-LAST:event_buttonComumActionPerformed

    private void buttonRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRapidoActionPerformed
        // TODO add your handling code here:
        AtendimentoRapido atRapido = new AtendimentoRapido();
        
        textFieldSenha.setText(atRapido.getSenha());
        this.rapidoFila.add(atRapido);
    }//GEN-LAST:event_buttonRapidoActionPerformed

    private void buttonPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrioritarioActionPerformed
        // TODO add your handling code here:
        AtendimentoPrioritario atPrioritario = new AtendimentoPrioritario();
        
        textFieldSenha.setText(atPrioritario.getSenha());
        this.prioritarioFila.add(atPrioritario);
    }//GEN-LAST:event_buttonPrioritarioActionPerformed

    private void buttonCaixaUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaixaUmActionPerformed
        // TODO add your handling code here:
        
        if(!this.prioritarioFila.isEmpty()) {
        
            this.labelSenha.setText(this.prioritarioFila.element().getSenha());
            this.prioritarioFila.remove();
            this.labelCaixa.setText("Caixa 1");
           
        }else if(!this.rapidoFila.isEmpty()) {
            this.labelSenha.setText(this.rapidoFila.element().getSenha());
            this.rapidoFila.remove();
            this.labelCaixa.setText("Caixa 1");
            
        }else if(!this.comumFila.isEmpty()) {
            
            this.labelSenha.setText(this.comumFila.element().getSenha());
            this.comumFila.remove();
            this.labelCaixa.setText("Caixa 1");
        }
            
            
    }//GEN-LAST:event_buttonCaixaUmActionPerformed

    private void buttonCaixaDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaixaDoisActionPerformed
        // TODO add your handling code here:
        
        if(!this.rapidoFila.isEmpty()) {
           
            this.labelSenha.setText(this.rapidoFila.element().getSenha());
            this.rapidoFila.remove();
            this.labelCaixa.setText("Caixa 2");
           
        }else if(!this.prioritarioFila.isEmpty()) {
            
            this.labelSenha.setText(this.prioritarioFila.element().getSenha());
            this.prioritarioFila.remove();
            this.labelCaixa.setText("Caixa 2");
            
        }else if(!this.comumFila.isEmpty()) {
            
            this.labelSenha.setText(this.comumFila.element().getSenha());
            this.comumFila.remove();
            this.labelCaixa.setText("Caixa 2");
        }
    }//GEN-LAST:event_buttonCaixaDoisActionPerformed

    private void buttonCaixaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaixaTresActionPerformed
        // TODO add your handling code here:
        
        if(!this.rapidoFila.isEmpty()) {
           
            this.labelSenha.setText(this.rapidoFila.element().getSenha());
            this.rapidoFila.remove();
            this.labelCaixa.setText("Caixa 3");
           
        }else if(!this.prioritarioFila.isEmpty()) {
            
            this.labelSenha.setText(this.prioritarioFila.element().getSenha());
            this.prioritarioFila.remove();
            this.labelCaixa.setText("Caixa 3");
            
        }else if(!this.comumFila.isEmpty()) {
            
            this.labelSenha.setText(this.comumFila.element().getSenha());
            this.comumFila.remove();
            this.labelCaixa.setText("Caixa 3");
        }
    }//GEN-LAST:event_buttonCaixaTresActionPerformed

    private void buttonCaixaQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaixaQuatroActionPerformed
        // TODO add your handling code here:
        
        if(!this.comumFila.isEmpty()) {
           
            this.labelSenha.setText(this.comumFila.element().getSenha());
            this.comumFila.remove();
            this.labelCaixa.setText("Caixa 4");
           
        }else if(!this.prioritarioFila.isEmpty()) {
            
            this.labelSenha.setText(this.prioritarioFila.element().getSenha());
            this.prioritarioFila.remove();
            this.labelCaixa.setText("Caixa 4");
            
        }else if(!this.rapidoFila.isEmpty()) {
            
            this.labelSenha.setText(this.rapidoFila.element().getSenha());
            this.rapidoFila.remove();
            this.labelCaixa.setText("Caixa 4");
        }
    }//GEN-LAST:event_buttonCaixaQuatroActionPerformed

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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCaixaDois;
    private javax.swing.JButton buttonCaixaQuatro;
    private javax.swing.JButton buttonCaixaTres;
    private javax.swing.JButton buttonCaixaUm;
    private javax.swing.JButton buttonComum;
    private javax.swing.JButton buttonPrioritario;
    private javax.swing.JButton buttonRapido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCaixa;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel panelCaixas;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JTextField textFieldSenha;
    // End of variables declaration//GEN-END:variables
}
