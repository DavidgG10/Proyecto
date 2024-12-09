


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Admin
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        ImageIcon img = new ImageIcon(getClass().getResource("/img/iconogym.png"));
        setIconImage(img.getImage());
        
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
        jMenuBar1 = new javax.swing.JMenuBar();
        mitMenOpciones = new javax.swing.JMenu();
        mitRegistrarUsuarios = new javax.swing.JMenuItem();
        mitVerUsuarios = new javax.swing.JMenuItem();
        mitEditarUsuarios = new javax.swing.JMenuItem();
        mitEntrenadores = new javax.swing.JMenuItem();
        btnAsignarClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mitSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Titanium Fitness");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al Sistema de Titanium Fitness");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maquina-de-gimnasio.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pierna.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(172, 47, 47));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(70, 40));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 35));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 40));

        mitMenOpciones.setForeground(new java.awt.Color(255, 255, 255));
        mitMenOpciones.setText("Menú de opciones ");
        mitMenOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mitMenOpciones.setMaximumSize(new java.awt.Dimension(117, 35));
        mitMenOpciones.setPreferredSize(new java.awt.Dimension(117, 35));

        mitRegistrarUsuarios.setBackground(new java.awt.Color(170, 47, 47));
        mitRegistrarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        mitRegistrarUsuarios.setText("Registrar Usuarios");
        mitRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitRegistrarUsuariosActionPerformed(evt);
            }
        });
        mitMenOpciones.add(mitRegistrarUsuarios);

        mitVerUsuarios.setBackground(new java.awt.Color(170, 47, 47));
        mitVerUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        mitVerUsuarios.setText("Ver Usuarios");
        mitVerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitVerUsuariosActionPerformed(evt);
            }
        });
        mitMenOpciones.add(mitVerUsuarios);

        mitEditarUsuarios.setBackground(new java.awt.Color(170, 47, 47));
        mitEditarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        mitEditarUsuarios.setText("Editar Usuarios");
        mitEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitEditarUsuariosActionPerformed(evt);
            }
        });
        mitMenOpciones.add(mitEditarUsuarios);

        mitEntrenadores.setBackground(new java.awt.Color(170, 47, 47));
        mitEntrenadores.setForeground(new java.awt.Color(255, 255, 255));
        mitEntrenadores.setText("Entrenadores");
        mitEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitEntrenadoresActionPerformed(evt);
            }
        });
        mitMenOpciones.add(mitEntrenadores);

        btnAsignarClientes.setBackground(new java.awt.Color(168, 47, 47));
        btnAsignarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarClientes.setText("Asignar Cliientes");
        btnAsignarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarClientesActionPerformed(evt);
            }
        });
        mitMenOpciones.add(btnAsignarClientes);

        jMenuBar1.add(mitMenOpciones);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Salir del sistema");

        mitSalir.setBackground(new java.awt.Color(170, 47, 47));
        mitSalir.setForeground(new java.awt.Color(255, 255, 255));
        mitSalir.setText("Salir");
        mitSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mitSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_mitSalirActionPerformed

    private void mitRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitRegistrarUsuariosActionPerformed
        // TODO add your handling code here:
        RegistrarUsuarios r = new RegistrarUsuarios();
    }//GEN-LAST:event_mitRegistrarUsuariosActionPerformed

    private void mitVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitVerUsuariosActionPerformed
        // TODO add your handling code here:
        VerUsuarios v = new VerUsuarios();
    }//GEN-LAST:event_mitVerUsuariosActionPerformed

    private void mitEditarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitEditarUsuariosActionPerformed
        // TODO add your handling code here:
        EditarUsuarios e = new EditarUsuarios();
    }//GEN-LAST:event_mitEditarUsuariosActionPerformed

    private void mitEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitEntrenadoresActionPerformed
        // TODO add your handling code here:
        Entrenadores en = new Entrenadores();
    }//GEN-LAST:event_mitEntrenadoresActionPerformed

    private void btnAsignarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarClientesActionPerformed
        // TODO add your handling code here:
        asignacionClientes as = new asignacionClientes();
    }//GEN-LAST:event_btnAsignarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAsignarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mitEditarUsuarios;
    private javax.swing.JMenuItem mitEntrenadores;
    private javax.swing.JMenu mitMenOpciones;
    private javax.swing.JMenuItem mitRegistrarUsuarios;
    private javax.swing.JMenuItem mitSalir;
    private javax.swing.JMenuItem mitVerUsuarios;
    // End of variables declaration//GEN-END:variables
}
