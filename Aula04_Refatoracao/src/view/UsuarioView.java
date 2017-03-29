package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import service.UsuarioService;
import model.Usuario;
import model.Criptografia;

public class UsuarioView extends JFrame implements ActionListener{
	
	protected JTable		tableUsuario;	
	protected JCheckBox		checkConsiderar;	
	protected JComboBox		comboTipoUsuario;	
	protected JScrollPane	scroll;	
	protected JLabel		lblIdUsuario, lblNomeUsuario, lblLoginUsuario, lblSenhaUsuario, 
							lblRgUsuario, lblCpfUsuario, lblTipoUsuario;	
	protected JTextField	txtIdUsuario, txtNomeUsuario, txtLoginUsuario,
							txtRgUsuario, txtCpfUsuario;	
	protected JPasswordField txtSenhaUsuario;
	protected JButton		btnCadastrar, btnConsultar, btnAlterar, btnExcluir, btnOk;	
	protected JPanel		panel, panelNorth, panelCenter, panelSouth;	
	protected JFrame		frame;		
	protected ResourceBundle bn = null;	
	protected Usuario 		usuario;
	protected UsuarioService 		usuarioService;
	protected Criptografia	cripto;
	static int id = 0;
	
	public UsuarioView(ResourceBundle bundle){		
		bn = bundle; 
		
		lblTipoUsuario = new JLabel(bn.getString("lblTipoUsuario"));
		lblIdUsuario = new JLabel(bn.getString("lblIdUsuario"));
		lblNomeUsuario = new JLabel(bn.getString("lblNomeUsuario"));
		lblLoginUsuario = new JLabel(bn.getString("lblLoginUsuario"));
		lblSenhaUsuario = new JLabel(bn.getString("lblSenhaUsuario"));
		lblRgUsuario = new JLabel(bn.getString("lblRgUsuario"));
		lblCpfUsuario = new JLabel(bn.getString("lblCpfUsuario"));
		
		tableUsuario = new JTable();
	}//end constructor
	
	public void cadastrarUsuarioView(){
 		panel = new JPanel();  			
 		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
 		
 		comboTipoUsuario = new JComboBox();
 		comboTipoUsuario.setBackground(Color.WHITE);
        comboTipoUsuario.addItem("-----");
        comboTipoUsuario.addItem(bn.getString("comboSupervisor"));
        comboTipoUsuario.addItem(bn.getString("comboGarcom"));
        comboTipoUsuario.addItem(bn.getString("comboCozinheiro"));
        comboTipoUsuario.addItem(bn.getString("comboCaixa"));
 		
   		btnCadastrar = new JButton(bn.getString("btnCadastrar"));
   		
   		txtIdUsuario = new JTextField(25); 
   		txtNomeUsuario = new JTextField(25); 
   		txtLoginUsuario = new JTextField(25);
   		txtSenhaUsuario = new JPasswordField(25);
		txtRgUsuario = new JTextField(25); 
		txtCpfUsuario = new JTextField(25);
		
   		frame = new JFrame(bn.getString("tituloCadastrarUsuario"));
   		frame.add(panel);   
   		
   		panel.add(lblIdUsuario);
   		panel.add(txtIdUsuario);
   		panel.add(lblNomeUsuario);
   		panel.add(txtNomeUsuario);
   		panel.add(lblRgUsuario);
   		panel.add(txtRgUsuario);
   		panel.add(lblCpfUsuario);
   		panel.add(txtCpfUsuario);   		
   		panel.add(lblLoginUsuario);
   		panel.add(txtLoginUsuario);
   		panel.add(lblSenhaUsuario);
   		panel.add(txtSenhaUsuario);
   		panel.add(lblTipoUsuario);
   		panel.add(comboTipoUsuario);
   		panel.add(btnCadastrar);
   		
   		btnCadastrar.addActionListener(this);
   		   		
   		frame.setResizable(false);
   		frame.setVisible(true);
   		frame.setSize(303,357);
   		frame.setLocationRelativeTo(null);
	}// end cadastrarUsuarioView
	
	@Override
	public void actionPerformed(ActionEvent event) {
		//BUTTON CADASTRAR
        if(event.getSource() == btnCadastrar){
        	if(	(txtNomeUsuario == null)  || (txtLoginUsuario == null) || 
        		(txtSenhaUsuario == null) || (txtRgUsuario == null) || 
        		(txtCpfUsuario == null) || (comboTipoUsuario.getSelectedIndex() == 0) ) {
        		
        		JOptionPane.showMessageDialog(null, bn.getString("mensagemCadastroCampoBranco"));        		
        	} else {
        		
        		usuario = new Usuario();
        		usuarioService = new UsuarioService();
        		cripto  = new Criptografia();
        		
        		try {
        			usuario.setId(Integer.parseInt(txtIdUsuario.getText()));
        		}
        		catch(NumberFormatException e) {
	        		JOptionPane.showMessageDialog(null, bn.getString("mensagemIdInvalido"));	  
	        		return;
	        	}
        		
        		try {
        			usuario.setSenha(cripto.cifrar(Integer.parseInt(txtSenhaUsuario.getText())) );
        		}
        		catch(NumberFormatException e) {
	        		JOptionPane.showMessageDialog(null, bn.getString("mensagemSenhaInvalido"));	  
	        		return;
	        	}
        		
        		usuario.setNome	(txtNomeUsuario.getText());
        		usuario.setLogin(txtLoginUsuario.getText());	        		
        		usuario.setRg	(txtRgUsuario.getText());
        		usuario.setCpf	(txtCpfUsuario.getText());
        		usuario.setTipo	(comboTipoUsuario.getSelectedIndex());
        		id = usuarioService.cadastrar(usuario);
        		  	  		        		
        	}        	
        }        
        
	}//end actionPerformed
	
}//end Class