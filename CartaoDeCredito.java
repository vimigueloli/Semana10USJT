public class CartaoDeCredito extends Pagamento{
   private String numeroDoCartao;
   
   public CartaoDeCredito(String numeroDoCartao,String nomeDoPagador,String cpf,double valorASerPago){
      super (nomeDoPagador,cpf,valorASerPago);
      this.numeroDoCartao=numeroDoCartao;
   }
   public void setNumeroCredito(String numeroDoCartao){
      this.numeroDoCartao=numeroDoCartao;
   }
   public String getNumeroCredito(){
      return numeroDoCartao;
   }
}