package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import service.Internacionalizacao;

public class RestauranteView extends JFrame implements ActionListener{     	
   protected JMenuBar	barMenuPrincipal;   
   
   protected JMenu		menuUsuario, menuPedido, menuCaixa, menuConta, menuNotaFiscal, menuIdioma,
   						menuCardapio, menuPagamento, menuCozinha;   
   
   protected JMenuItem	itemCadastrarUsuario,itemConsultarEditarUsuario, itemFinalizarPrato, itemListarPratosMaisVendidos , 
   						itemFecharNotaFiscal, itemFecharConta, itemSair, itemEmitirNotaFiscal, itemIngles, 
   						itemEspanhol, itemPortugues, itemPriorizarPedido, 
   						itemConsultarHorarioDePico, itemIncluirPedido, itemEditarPedido,
   						itemFecharCaixa, itemConsultarNotaFiscal, itemIncluirCardapio, itemConsultarEditarCardapio;   
   
   protected JFrame		frame;   
   
   private ImageIcon	icon, iconUser;  
   
   private JLabel		lblNomeUsuario, lblTipoUsuario, lblNomeRestaurante, lblIconUser;
  
   private JPanel		panel, panelCenter, panelWest, panelSouth;
   
   private ResourceBundle	bn=null;
   
   UsuarioView usuario;
     
   public RestauranteView(ResourceBundle bundle){
      super();
      {
         bn = bundle;
    	  
    	 setTitle(bn.getString("tituloRestaurante"));
    	 
    	//Icon
    	 iconUser = new ImageIcon("iconUser1.png");
    	 
    	 //JLabel
    	 lblNomeUsuario = new JLabel(bn.getString("lblNomeUsuario"));
    	 lblTipoUsuario  = new JLabel(bn.getString("lblTipoUsuario"));
    	 
    	 lblIconUser = new JLabel(iconUser);
    	 
    	 //MenuBar
         barMenuPrincipal = new JMenuBar();    
         
         //JPanel
         panel = new JPanel(new BorderLayout(10, 10));
         this.add(panel);
         
         //Panel West
         panelWest 	= new JPanel();
         panelWest.setLayout(new GridLayout(6, 0));
         panel.add(panelWest, BorderLayout.WEST);
         
         panelWest.add(lblIconUser);
         panelWest.add(lblNomeUsuario);
         panelWest.add(lblTipoUsuario);
         
         //Panel Center
    	 panelCenter = new JPanel();   	
    	 
    	 //Panel South
    	 panelSouth = new JPanel();
    	 panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER));

    	 lblNomeRestaurante = new JLabel(bn.getString("tituloRestaurante"));
    	    	 
    	 panel.add(panelSouth, BorderLayout.SOUTH);	
    	 
    	 panelSouth.add(lblNomeRestaurante);
         
         //JFrame
         frame = new JFrame();         
         
         //JMenu 
         menuUsuario = new JMenu(bn.getString("menuUsuario"));
         
         //JMenuItem
         itemCadastrarUsuario = new JMenuItem(bn.getString("itemCadastrarUsuario"));
         itemConsultarEditarUsuario = new JMenuItem(bn.getString("itemConsultarEditarUsuario"));
         itemSair = new JMenuItem(bn.getString("itemSair"));         
         
         //Adicionando Menu no JMenuBar
         barMenuPrincipal.add(menuUsuario);
         
         //Adicionando Itens no JMenu        
         menuUsuario.add(itemCadastrarUsuario);
         menuUsuario.add(itemConsultarEditarUsuario);
         menuUsuario.addSeparator();
         menuUsuario.add(itemSair);            
         
         //Action Listener - dando ações aos botões
 		 itemCadastrarUsuario.addActionListener(this);
 		 itemConsultarEditarUsuario.addActionListener(this);
 		 itemSair.addActionListener(this);      
         
         icon = new ImageIcon("imageLoginView1.png");
         this.setIconImage(icon.getImage());
         
         //Setando Frame
         this.setVisible(true);
         this.setSize(860, 610);
         this.setResizable(true);
         this.setLocationRelativeTo(null);
         this.setJMenuBar(barMenuPrincipal);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      }
   }

	@Override
	public void actionPerformed(ActionEvent event) {        
        //Item - Usuário - Cadastrar Usuário
		if(event.getSource() == itemCadastrarUsuario){                    	
			usuario = new UsuarioView(bn);
           	usuario.cadastrarUsuarioView();     	 
        }
		
        //Item - Usuário - Sair        
        if(event.getSource() == itemSair){
       		JOptionPane.showMessageDialog(null, bn.getString("mensagemDeslogar"));
       		System.exit(0);     	 
        }
        
	}//end actionPerformed
	
	public static void main(String args[]){
		ResourceBundle	bn = ResourceBundle.getBundle("inter", new Locale("pt", "BR"));
		RestauranteView teste = new RestauranteView(bn);
	}
}