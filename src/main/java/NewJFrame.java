

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author josehumbertoabrilgarcia
 */
public class NewJFrame extends javax.swing.JFrame {

    
    private String codigo = "";
    
    public NewJFrame() {
       
        initComponents();
        
        
        this.setSize(1280, 720);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
        //ventana de inicio
        bienvenida.setSize(1280, 720);
        bienvenida.setText("<html><img src='file:C:\\Users\\denia\\Downloads\\VerificadorDePrecios\\VerificadorDePrecios\\src\\main\\java\\img\\F1.png' width='1280' height='720'>");
        bienvenida.setLocation(0, 0);
        
//        prueba.setSize(300, 250); 
//        prueba.setLocation(183, 230);
//        prueba.setText("<html><img src='file:https://gluc.mx/u/fotografias/fotosnoticias/2020/7/6/29848.jpg' width='250' height='250'>");
//        prueba.setVisible(true);
        
        //fondo de verificador
        fondo.setVisible(false);
        fondo.setSize(1280,720);
        fondo.setText("<html><img src='file:C:\\Users\\denia\\Downloads\\VerificadorDePrecios\\VerificadorDePrecios\\src\\main\\java\\img\\fondo.png' width='1280' height='720'>");
        
        //logo tienda
        logo.setVisible(false);
        logo.setSize(150, 150); 
        logo.setText("<html><img src='file:C:\\Users\\denia\\Downloads\\VerificadorDePrecios\\VerificadorDePrecios\\src\\main\\java\\img\\logo.jpg' width='150' height='150'>");
        logo.setLocation(1090, 40);
        
        //variables verificador
        nombre.setSize(1050, 150);
        nombre.setLocation(40, 40);
        nombre.setVisible(false);
        
        precio.setSize(265, 240); 
        precio.setLocation(620, 260);
        precio.setVisible(false);
        
        disponibles.setSize(265, 240);
        disponibles.setLocation(620, 385);
        disponibles.setVisible(false);
        
        desc.setSize(1200, 200);
        desc.setLocation(40, 520);
        desc.setForeground(new Color(24,171,0)); 
        desc.setVisible(false);
        
        imgproducto.setSize(300, 250); 
        imgproducto.setLocation(183, 230);
        imgproducto.setVisible(false);
        
        fondoimg.setSize(375,250);
        fondoimg.setText("<html><img src='file:C:\\Users\\denia\\Downloads\\VerificadorDePrecios\\VerificadorDePrecios\\src\\main\\java\\img\\fondo-img.png' width='375' height='250'>");
        fondoimg.setLocation(120,230);
        fondoimg.setVisible(false);
        
        //Ventana de error
        noencontrado.setSize(1280, 720);
        noencontrado.setText("<html><img src='file:C:\\Users\\denia\\Downloads\\VerificadorDePrecios\\VerificadorDePrecios\\src\\main\\java\\img\\productonoencontrado.png' width='1280' height='720'>");
        noencontrado.setLocation(0, 0);
        noencontrado.setVisible(false);
        
        
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        disponibles = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        imgproducto = new javax.swing.JLabel();
        fondoimg = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        noencontrado = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(17, 234, 17));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(839, 480));
        setSize(new java.awt.Dimension(839, 480));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        nombre.setFont(new java.awt.Font("Berlin Sans FB", 0, 60)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombre.setText("nombre");
        getContentPane().add(nombre);
        nombre.setBounds(70, 270, 100, 60);

        precio.setBackground(new java.awt.Color(224, 224, 224));
        precio.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        precio.setAlignmentX(286.0F);
        precio.setAlignmentY(44.0F);
        getContentPane().add(precio);
        precio.setBounds(330, 80, 0, 0);

        disponibles.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        disponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disponibles.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        disponibles.setAlignmentX(52.0F);
        disponibles.setAlignmentY(252.0F);
        getContentPane().add(disponibles);
        disponibles.setBounds(180, 210, 0, 0);

        desc.setBackground(new java.awt.Color(24, 171, 0));
        desc.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        desc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc.setAlignmentX(0.5F);
        desc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(desc);
        desc.setBounds(380, 130, 0, 0);

        imgproducto.setPreferredSize(new java.awt.Dimension(120, 120));
        getContentPane().add(imgproducto);
        imgproducto.setBounds(420, 350, 80, 70);
        getContentPane().add(fondoimg);
        fondoimg.setBounds(400, 230, 0, 0);

        logo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        logo.setText("logo");
        getContentPane().add(logo);
        logo.setBounds(280, 290, 120, 32);

        noencontrado.setPreferredSize(new java.awt.Dimension(305, 165));
        getContentPane().add(noencontrado);
        noencontrado.setBounds(330, 350, 60, 60);

        bienvenida.setBackground(new java.awt.Color(146, 239, 146));
        bienvenida.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        bienvenida.setText("barra");
        getContentPane().add(bienvenida);
        bienvenida.setBounds(580, 140, 61, 32);

        fondo.setPreferredSize(new java.awt.Dimension(305, 165));
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 840, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
      
        if (evt.getKeyCode()!= 10) {
            codigo += evt.getKeyChar();
        }else{
            
            try{
                Connection con = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/verificador_precios","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM productos WHERE producto_codigo ="+codigo+";");
                
                if (rs.next()) {
                    noencontrado.setVisible(false);
                    bienvenida.setVisible(false);
                    fondo.setVisible(true);
                    logo.setVisible(true);
                    
                    nombre.setText(rs.getString(2));
                    nombre.setVisible(true);
                    
                    precio.setText("<html> $"+rs.getString(3)+" pesos</html>");
                    precio.setVisible(true);
                    
                    disponibles.setText("<html> Disponibles: "+rs.getString(4));
                    disponibles.setVisible(true);
                    
                    desc.setText("<html>"+ rs.getString(5) +"</html>");
                    desc.setVisible(true);
                    
                    String ruta = rs.getString(6);
                    ImageIcon icono = new ImageIcon(new URL(ruta));
                    imgproducto.setIcon(new ImageIcon(icono.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
            
                    //imgproducto.setText("<html><img src='file:"+rs.getString(6)+"' width='250' height='250'>");
                    imgproducto.setVisible(true);
                    fondoimg.setVisible(true);
                    //cambiar();
                    //Thread.sleep(30000);
                    //bienvenida.setVisible(true);
                    //regresar();
                    //Salir(10000);
                    
                    
                }else{
                    fondo.setVisible(false);
                    nombre.setVisible(false);
                    bienvenida.setVisible(false);
                    logo.setVisible(false);
                    precio.setVisible(false);
                    imgproducto.setVisible(false);
                    fondoimg.setVisible(false);
                    disponibles.setVisible(false);
                    desc.setVisible(false);
                    
                    noencontrado.setVisible(true);
                    //Thread.sleep(30000);
                    //bienvenida.setVisible(true);
                    //regresar();
                    
                }
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+e.toString());
                
            }
            
            codigo = "";
        }
    }//GEN-LAST:event_formKeyPressed

    
    public void regresar(){
        Thread mith = Thread.currentThread();

        try {

            mith.sleep(50000);  // en milisegundos

        } catch(InterruptedException ie) {

            System.err.println("Capturada InterruptedException: "+ie);

        }
        bienvenida.setVisible(true);
    
    }
    
    public void Salir(int miliseg){
       Thread mith = new Thread();
    
       try {

          mith.wait();
          nombre.setVisible(true);
          //nombre.setVisible(false);
          bienvenida.setVisible(true);

       } catch(InterruptedException ie) {

          System.err.println("Capturada InterruptedException: "+ie);

       }
       //bienvenida.setVisible(true);
    
    
    }
    
    private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
    
//    public cambiar(){
//    int velocidad = 6;
//    Timer timer = new Timer();
//    TimerTask tarea;
//
//    int velmil = velocidad*1000;
//
//    tarea = new TimerTask(){
//        @Override
//        public void run() {
//                bienvenida.setVisible(true);
//            
//        }
//    };
//    }
    
    
     
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JLabel desc;
    private javax.swing.JLabel disponibles;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoimg;
    private javax.swing.JLabel imgproducto;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel noencontrado;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables
}
