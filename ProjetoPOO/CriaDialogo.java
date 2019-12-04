import javax.swing.JOptionPane;
import java.util.ArrayList;

//usuario: admin
//senha: kaka

public class CriaDialogo {
	
  private static ArrayList<Materia> listaMaterias;
  private static ArrayList<Assunto> listaAssuntos;
	
  public static void main(String[] args) {
	  
	CriaDialogo.listaMaterias = new ArrayList<Materia>();
	CriaDialogo.listaAssuntos = new ArrayList<Assunto>();
	
    String user = "";
    String password = "";
    do {
        //JOptionPane.showMessageDialog(null, "Começando o login..."); 
    	user = (String)JOptionPane.showInputDialog(null, "Digite seu login:", "ACERVO DE ESTUDOS  |  usuário", 
    	JOptionPane.QUESTION_MESSAGE, null, null, null);	
    	if (user == null) {
    		System.exit(0);
    	}	
    	password = (String)JOptionPane.showInputDialog(null, "Digite a senha:", "ACERVO DE ESTUDOS  |  senha", 
    	    	JOptionPane.QUESTION_MESSAGE, null, null, null);
    	if (password == null) {
    		System.exit(0);
    	}	    	
    	if (!user.equals("admin") || !password.equals("kaka")) {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
    	}
    } while (!user.equals("admin") || !password.equals("kaka"));
       
    int opcao = 0;
    do {
	    Object[] opcoes = {"Matérias", "Assuntos", "Usuário"}; 
	    opcao = JOptionPane.showOptionDialog( null , "Escolha uma opção:", "Acervo de Estudos - CONTROLE", 
	    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, null);

	    //se MATÉRIA foi escolhida	-------------------------------------------------------------------------
	    if (opcao == JOptionPane.YES_OPTION) {
	    	String lista = ""; 
	    	//SEGUNDA TELA de escolha (MATERIA)
	        Object[] opcoes2 = {"Cadastrar", "Listar", "Excluir"}; 
	        opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Acervo de Estudos -- MATÉRIA", 
	        JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.WARNING_MESSAGE, null , opcoes2 , null);
	        
	         //se CADASTRAR foi escolhido
	        if (opcao == JOptionPane.YES_OPTION) { 
	        	String nomeMateria = (String)JOptionPane.showInputDialog(null, "Digite o nome da Matéria:", "Matéria --- CADASTRO", 
	        	    	JOptionPane.QUESTION_MESSAGE, null, null, null);
	        	if (nomeMateria == null) {
	        		System.exit(0);
	        	}	  
	        	
	        	Materia materia = new Materia(nomeMateria);
	        	CriaDialogo.listaMaterias.add(materia);        
	        	
	        //LISTAR foi escolhido
	        } else if (opcao == JOptionPane.NO_OPTION) {
	        	//String lista = "";
	        	for (Materia m: CriaDialogo.listaMaterias) {
	        		lista = lista + m + "\n";
	        	}
	        	JOptionPane.showMessageDialog(null, lista);
	        	
	        //EXCLUIR foi escolhido
	        } else {
	        	String excluiMateria = (String)JOptionPane.showInputDialog(null, "Digite a matéria a remover:", "Acervo de Estudos - exclusão", 
	        	    	JOptionPane.QUESTION_MESSAGE, null, null, null);
	        	if (excluiMateria == null) {
	        		System.exit(0);
	        	} else {
	        		for (int i = 0; i < CriaDialogo.listaMaterias.size(); i++) {
	        			if (CriaDialogo.listaMaterias.get(i).getNome().equals(excluiMateria)) { 
	        				excluiMateria += CriaDialogo.listaMaterias.remove(i);
	        			}
	        		}
	        	}	        	        	
	        }		    
	    //se ASSUNTO foi escolhidO	-------------------------------------------------------------------------	        
	    } else if (opcao == JOptionPane.NO_OPTION) {
	    	String lista = ""; 
	    	
	    	//SEGUNDA TELA de escolha (ASSUNTO)
	        Object[] opcoes2 = {"Cadastrar A", "Listar A", "Excluir A"}; 
	        opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Acervo de Estudos -- ASSUNTO", 
	        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null , opcoes2 , null);
	        
	         //se CADASTRAR foi escolhido
	        if (opcao == JOptionPane.YES_OPTION) { 
	        	String nomeAssunto = (String)JOptionPane.showInputDialog(null, "Digite o nome do assunto:", "Assunto --- CADASTRO", 
	        	    	JOptionPane.QUESTION_MESSAGE, null, null, null);
	        	String materiaAssunto = (String)JOptionPane.showInputDialog(null, "Digite a que matéria o assunto pertence:", "Assunto --- CADASTRO", 
	        	    	JOptionPane.QUESTION_MESSAGE, null, null, null);
	        	if (nomeAssunto == null) {
	        		System.exit(0);
	        	}	  
	        	
	        	Materia mat = new Materia(materiaAssunto);	        	
	        	Assunto assunto = new Assunto(nomeAssunto, mat); //consertar o tipo do retorno acima
	        	CriaDialogo.listaAssuntos.add(assunto);    	        
	        	
	        //LISTAR foi escolhido
	        } else if (opcao == JOptionPane.NO_OPTION) {
	        	//String lista = "";
	        	for (Assunto m: CriaDialogo.listaAssuntos) {
	        		lista = lista + m + "\n";
	        	}
	        	JOptionPane.showMessageDialog(null, lista);
	        	
	        //EXCLUIR foi escolhido
	        } else {
	        	String excluiAssunto = (String)JOptionPane.showInputDialog(null, "Digite a matéria a remover:", "Acervo de Estudos - exclusão", 
	        	    	JOptionPane.QUESTION_MESSAGE, null, null, null);
	        	if (excluiAssunto == null) {
	        		System.exit(0);
	        	} else {
	        		for (int i = 0; i < CriaDialogo.listaAssuntos.size(); i++) {
	        			if (CriaDialogo.listaAssuntos.get(i).getTitulo().equals(excluiAssunto)) { 
	        				excluiAssunto += CriaDialogo.listaAssuntos.remove(i);
	        			}
	        		}
	        	}	        	        	
	        }
	    //se USUÁRIO  foi escolhidO	-------------------------------------------------------------------------
	    } else {
    	//SEGUNDA TELA opcoes para o usuário ''unico
        Object[] opcoes2 = {"Editar", "Visualizar", "Voltar"}; 
        opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Acervo de Estudos -- USUÁRIO", 
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null , opcoes2 , null);
        
        //se EDITAR foi escolhido
        //if (opcao == JOptionPane.YES_OPTION) { 
        	//String nomeAssunto = (String)JOptionPane.showInputDialog(null, "Digite o nome do assunto:", "Assunto --- CADASTRO", 
        	    	//JOptionPane.QUESTION_MESSAGE, null, null, null);
        	//}	   	        
        	
        //se VISUALIZAR foi escolhido
        //} else {
        	//JOptionPane.showMessageDialog(null, lista);
        	        
    }
	    
	    
	    
	    
    } while (opcao != -1);
   
  }
}