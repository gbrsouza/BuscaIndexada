package Tree;

/**
 * Representa os dados necessários para o índice
 * remissivo de palavras. Funciona em conjunto com
 * a classe Node.
 * @author gabriel
 *
 */
public class Index 
{
	private int linha;        // linha do arquivo que a palavra se encontra
	private String arquivo;   // arquivo em que a palavra se encontra
	private int ocorrencia;   // Ocorrências da palavra em uma linha
	
	/**
	 * Construtor 
	 */
	public Index ()
	{	}

	/**
	 * Getters and Setters 
	 */
	
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public int getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(int ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	
	
}