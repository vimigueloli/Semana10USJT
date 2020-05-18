public class Cheque extends Pagamento{
   private String numeroDoCheque;
   public Cheque(String numeroDoCheque,String nomeDoPagador,String cpf,double valorASerPago){
      super (nomeDoPagador,cpf,valorASerPago);
      this.numeroDoCheque=numeroDoCheque;
   }
   public void setNumeroCheque(String numeroDoCheque){
      this.numeroDoCheque=numeroDoCheque;
   }
   public String getNumeroCheque(){
      return numeroDoCheque;
   }   
}