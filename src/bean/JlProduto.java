package bean;
// Generated 20/09/2023 16:54:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * JlProduto generated by hbm2java
 */
@Entity
@Table(name="jl_produto"
    ,catalog="db_joao_rocha"
)
public class JlProduto  implements java.io.Serializable {


     private int jlIdProduto;
     private JlVendedor jlVendedor;
     private String jlNome;
     private String jlDescricao;
     private String jlPreco;
     private int vendasProdutoIdVendasProdutos;
     private int compraProdutoIdcompraProduto;
     private Set jlVendasProdutoHasVendases = new HashSet(0);
     private Set jlVendases = new HashSet(0);

    public JlProduto() {
    }

	
    public JlProduto(int jlIdProduto, JlVendedor jlVendedor, int vendasProdutoIdVendasProdutos, int compraProdutoIdcompraProduto) {
        this.jlIdProduto = jlIdProduto;
        this.jlVendedor = jlVendedor;
        this.vendasProdutoIdVendasProdutos = vendasProdutoIdVendasProdutos;
        this.compraProdutoIdcompraProduto = compraProdutoIdcompraProduto;
    }
    public JlProduto(int jlIdProduto, JlVendedor jlVendedor, String jlNome, String jlDescricao, String jlPreco, int vendasProdutoIdVendasProdutos, int compraProdutoIdcompraProduto, Set jlVendasProdutoHasVendases, Set jlVendases) {
       this.jlIdProduto = jlIdProduto;
       this.jlVendedor = jlVendedor;
       this.jlNome = jlNome;
       this.jlDescricao = jlDescricao;
       this.jlPreco = jlPreco;
       this.vendasProdutoIdVendasProdutos = vendasProdutoIdVendasProdutos;
       this.compraProdutoIdcompraProduto = compraProdutoIdcompraProduto;
       this.jlVendasProdutoHasVendases = jlVendasProdutoHasVendases;
       this.jlVendases = jlVendases;
    }
   
     @Id 

    
    @Column(name="jl_id_produto", unique=true, nullable=false)
    public int getJlIdProduto() {
        return this.jlIdProduto;
    }
    
    public void setJlIdProduto(int jlIdProduto) {
        this.jlIdProduto = jlIdProduto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vendedor_id_vendedor", nullable=false)
    public JlVendedor getJlVendedor() {
        return this.jlVendedor;
    }
    
    public void setJlVendedor(JlVendedor jlVendedor) {
        this.jlVendedor = jlVendedor;
    }

    
    @Column(name="jl_nome", length=25)
    public String getJlNome() {
        return this.jlNome;
    }
    
    public void setJlNome(String jlNome) {
        this.jlNome = jlNome;
    }

    
    @Column(name="jl_descricao", length=45)
    public String getJlDescricao() {
        return this.jlDescricao;
    }
    
    public void setJlDescricao(String jlDescricao) {
        this.jlDescricao = jlDescricao;
    }

    
    @Column(name="jl_preco", precision=10, scale=0)
    public String getJlPreco() {
        return this.jlPreco;
    }
    
    public void setJlPreco(String jlPreco) {
        this.jlPreco = jlPreco;
    }

    
    @Column(name="vendas_produto_id_vendasProdutos", nullable=false)
    public int getVendasProdutoIdVendasProdutos() {
        return this.vendasProdutoIdVendasProdutos;
    }
    
    public void setVendasProdutoIdVendasProdutos(int vendasProdutoIdVendasProdutos) {
        this.vendasProdutoIdVendasProdutos = vendasProdutoIdVendasProdutos;
    }

    
    @Column(name="compra_produto_idcompra_produto", nullable=false)
    public int getCompraProdutoIdcompraProduto() {
        return this.compraProdutoIdcompraProduto;
    }
    
    public void setCompraProdutoIdcompraProduto(int compraProdutoIdcompraProduto) {
        this.compraProdutoIdcompraProduto = compraProdutoIdcompraProduto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="jlProduto")
    public Set getJlVendasProdutoHasVendases() {
        return this.jlVendasProdutoHasVendases;
    }
    
    public void setJlVendasProdutoHasVendases(Set jlVendasProdutoHasVendases) {
        this.jlVendasProdutoHasVendases = jlVendasProdutoHasVendases;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="jlProduto")
    public Set getJlVendases() {
        return this.jlVendases;
    }
    
    public void setJlVendases(Set jlVendases) {
        this.jlVendases = jlVendases;
    }




}


