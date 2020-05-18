public class Pagamento{
   private String nomeDoPagador,cpf;
   private double valorASerPago;
   
   public Pagamento(String nomeDoPagador,String cpf,double valorASerPago){
      this.nomeDoPagador=nomeDoPagador;
      this.cpf=cpf;
      this.valorASerPago=valorASerPago;
   }
   
   public String getNome(){
      return nomeDoPagador;
   }
   public String getCpf(){
      return cpf;
   }
   public double getValor(){
      return valorASerPago;
   }
   public void setNome(String nomeDoPagador){
      this.nomeDoPagador=nomeDoPagador;      
   }
   public void setCpf(String cpf){
      this.cpf=cpf;
   }
   public void setValor(double valorASerPago){
      this.valorASerPago=valorASerPago;
   }
   
}