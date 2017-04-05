package model;

import java.io.Serializable;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private int 	id;
	private String 	nome;
	private String 	login;
	private int 	senha;
	private int 	tipo;
	private String 	rg;
	private String 	cpf;
	
	public Usuario(){
	}
	
	//Get's
	public int getId()			{ return id;	}
	public String getNome()		{ return nome;	}
	public String getLogin()	{ return login;	}
	public int getSenha()		{ return senha;	}
	public int getTipo()		{ return tipo;	}
	public String getRg()		{ return rg;	}
	public String getCpf()		{ return cpf;	}
	
	//Set's
	public void setId(int id)			{ this.id = id;			}
	public void setNome(String nome)	{ this.nome = nome;		}
	public void setLogin(String login)	{ this.login = login;	}
	public void setSenha(int senha)		{ this.senha = senha;	}
	public void setTipo(int tipo)		{ this.tipo = tipo;		}
	public void setRg(String rg)		{ this.rg = rg;			}
	public void setCpf(String cpf)		{ this.cpf = cpf;		}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login
				+ ", senha=" + senha + ", tipo=" + tipo + ", RG=" + rg + ", CPF=" + cpf + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (senha != other.senha)
			return false;
		if (tipo != other.tipo)
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		
		return true;
	}
	
	
	
}//end class Usuario