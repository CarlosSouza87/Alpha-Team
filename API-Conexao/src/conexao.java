import java.sql.Connection;
import java.sql.DriverManager;


public class conexao {
	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	conexao(){
		url = "jdbc:postgresql://localhost:5432/aula_teste";
		usuario = "postgres";
		senha = "andrew111";
		// Necess�rio alterar a url, usuario e senha para o banco que ser� conectado
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,usuario,senha);
			System.out.println("Conex�o realizada com sucesso!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		conexao con = new conexao();
	}
}