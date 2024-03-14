import entidade.ContaBancoPoo;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBancoPoo p1 = new ContaBancoPoo();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("Conta Corrente");
		
		ContaBancoPoo p2 = new ContaBancoPoo();
		p2.setNumConta(2222);
		p2.setDono("Creusa");
		p2.abrirConta("Conta Poupança");
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		
		p1.sacar(150);
		p1.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();

		
    }
}
