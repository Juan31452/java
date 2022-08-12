package vista;

import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuLider = new javax.swing.JMenuItem();
        MenuProyectos = new javax.swing.JMenuItem();
        MenuCompras = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jMenu1.setText("Consultas");

        MenuLider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuLider.setText("Lider");
        jMenu1.add(MenuLider);

        MenuProyectos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuProyectos.setText("Proyectos");
        MenuProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProyectosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuProyectos);

        MenuCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuCompras.setText("Compras");
        jMenu1.add(MenuCompras);
        jMenu1.add(jSeparator1);

        MenuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuSalir.setText("Salir");
        jMenu1.add(MenuSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProyectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProyectosActionPerformed

        
    
    public JMenuItem getMenuCompras() {
        return MenuCompras;
    }

    public JDesktopPane getEscritorio() {
        return Escritorio;
    }

    public void setEscritorio(JDesktopPane Escritorio) {
        this.Escritorio = Escritorio;
    }

    public void setMenuCompras(JMenuItem MenuCompras) {
        this.MenuCompras = MenuCompras;
    }

    public JMenuItem getMenuLider() {
        return MenuLider;
    }

    public void setMenuLider(JMenuItem MenuLider) {
        this.MenuLider = MenuLider;
    }

    public JMenuItem getMenuProyectos() {
        return MenuProyectos;
    }

    public void setMenuProyectos(JMenuItem MenuProyectos) {
        this.MenuProyectos = MenuProyectos;
    }

    public JMenuItem getMenuSalir() {
        return MenuSalir;
    }

    public void setMenuSalir(JMenuItem MenuSalir) {
        this.MenuSalir = MenuSalir;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem MenuCompras;
    private javax.swing.JMenuItem MenuLider;
    private javax.swing.JMenuItem MenuProyectos;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

}

