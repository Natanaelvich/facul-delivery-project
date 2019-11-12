
package entites;


public class Produto {
    
    private int id;
    private String descricao;
    private double preco;
    private String ingredientes;
    private int empresa_id;

    public Produto(int id, String descricao, double preco, String ingredientes, int empresa_id) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.ingredientes = ingredientes;
        this.empresa_id = empresa_id;
    }

    public Produto(String descricao, double preco, String ingredientes, int empresa_id) {
        this.descricao = descricao;
        this.preco = preco;
        this.ingredientes = ingredientes;
        this.empresa_id = empresa_id;
    }



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(int empresa_id) {
        this.empresa_id = empresa_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", preco=" + preco + ", ingredientes=" + ingredientes + ", empresa_id=" + empresa_id + '}';
    }

    
    
}
