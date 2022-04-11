/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Richard Fortunato
 */
public class RegistrarUsuarios extends javax.swing.JPanel {
    
        MyDbconnect ConnexionBD = new MyDbconnect();
	Connection conectar= ConnexionBD.conexion();

    /**
     * Creates new form RegistrarUsuarios
     */
    public RegistrarUsuarios() {
        initComponents();
    }
    
    public void insertarDatos(){
	String MySql = "insert into datos (Nombre, Apellido, Telefono, Correo, Usuario, Contrase�a, Confirmar_Contrase�a) values(?,?,?,?,?,?,?)";
	              
	   if((textFieldN.getText().equals("")|| textFieldApellido.getText().equals("") ||
	            	textFieldNumero.getText().equals("") || textFieldCorreo.getText().equals("") ||
	            	textFielnUsuario.getText().equals("") || textFieldPass.getText().equals("") ||
	            	textFieldPassC.getText().equals(""))) {
	            	  JOptionPane.showMessageDialog(null,"Complete todos los campos");
	            	  
	              } else {
	            	 
	                      
	                      if(textFieldPass.getText().equalsIgnoreCase(textFieldPassC.getText()))
	                      {
	                    	  try {
	                              PreparedStatement Pstatement=conectar.prepareStatement(MySql);
	                              
	                              Pstatement.setString(1,textFieldN.getText());
	                              Pstatement.setString(2,textFieldApellido.getText());
	                              Pstatement.setString(3,textFieldNumero.getText());
	
	                              Pstatement.setString(4,textFieldCorreo.getText());
	                              Pstatement.setString(5,textFielnUsuario.getText());
	                              
	                              Pstatement.setString(6,textFieldPass.getText());
	                              Pstatement.setString(7,textFieldPassC.getText());
	                              
	                          Pstatement.executeUpdate();
	                          JOptionPane.showMessageDialog(null,"Usuario Registrado Exitosamente!!");
	                          
	                          } catch (SQLException e1) {
	                        	  JOptionPane.showMessageDialog(null,"No se ha podido registrar :( " + e1.getMessage());
	                          }
	                    	  
	                    	  Login AbrirLogin = new Login();
	                    	  AbrirLogin.setVisible(true);
	                    	 // dispose();
	                      }
	                      else
	                      {
	                          JOptionPane.showMessageDialog(null,"Las contrase�as no coinciden");
	                      }
	                      
	              }
	
			}
		

   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFielnUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldN = new javax.swing.JTextField();
        textFieldApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldPassC = new javax.swing.JPasswordField();
        textFieldPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Usuario:");

        jLabel2.setText("Nombre:");

        textFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Correo:");

        jLabel6.setText("Cpntrase�a:");

        jLabel7.setText("Confirmar contrase�a:");

        jButton1.setText("Registrarse");

        jButton2.setText("Iniciar Seccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(textFielnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(189, 189, 189))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldPassC, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(153, Short.MAX_VALUE)
                    .addComponent(textFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFielnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPassC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(textFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(149, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void textFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldApellidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textFieldApellido;
    private javax.swing.JTextField textFieldCorreo;
    private javax.swing.JTextField textFieldN;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JPasswordField textFieldPass;
    private javax.swing.JPasswordField textFieldPassC;
    private javax.swing.JTextField textFielnUsuario;
    // End of variables declaration//GEN-END:variables

    /*
    public JTextField getTextFieldApellido() {
        return textFieldApellido;
    }

    public void setTextFieldApellido(JTextField textFieldApellido) {
        this.textFieldApellido = textFieldApellido;
    }

    public JTextField getTextFieldCorreo() {
        return textFieldCorreo;
    }

    public void setTextFieldCorreo(JTextField textFieldCorreo) {
        this.textFieldCorreo = textFieldCorreo;
    }

    public JTextField getTextFieldN() {
        return textFieldN;
    }

    public void setTextFieldN(JTextField textFieldN) {
        this.textFieldN = textFieldN;
    }

    public JTextField getTextFieldNumero() {
        return textFieldNumero;
    }

    public void setTextFieldNumero(JTextField textFieldNumero) {
        this.textFieldNumero = textFieldNumero;
    }

    public JPasswordField getTextFieldPass() {
        return textFieldPass;
    }

    public void setTextFieldPass(JPasswordField textFieldPass) {
        this.textFieldPass = textFieldPass;
    }

    public JPasswordField getTextFieldPassC() {
        return textFieldPassC;
    }

    public void setTextFieldPassC(JPasswordField textFieldPassC) {
        this.textFieldPassC = textFieldPassC;
    }

    public JTextField getTextFielnUsuario() {
        return textFielnUsuario;
    }

    public void setTextFielnUsuario(JTextField textFielnUsuario) {
        this.textFielnUsuario = textFielnUsuario;
    }*/
}
