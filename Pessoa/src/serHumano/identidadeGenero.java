package serHumano;

public enum identidadeGenero {
	
	CISGENERO("cisgenero"), TRANSGENERO("transgenero"), NAOBINARIO("NAOBINARIO");
	
	private final String genero;
    
	identidadeGenero(String genero) {
        this.genero = genero;
    }
	
	public String getGneroEnum() {
		return this.genero;
	}

}