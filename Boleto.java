public class Boleto extends Pagamento{
   private String numeroDoBoleto;
   private int dia,mes,ano;
   public Boleto(String numeroDoBoleto,int dia, int mes, int ano,String nomeDoPagador,String cpf,double valorASerPago){
      super (nomeDoPagador,cpf,valorASerPago);
      this.numeroDoBoleto=numeroDoBoleto;
      this.dia=dia;
      this.mes=mes;
      this.ano=ano;
   }
   public void setNumeroBoleto(){
      this.numeroDoBoleto=numeroDoBoleto;
   }
   public void setData(int dia,int mês,int ano){
      this.dia=dia;
      this.mes=mes;
      this.ano=ano;
   }
   public String getData(){
      return ""+dia+"/"+mes+"/"+ano;
   }
   public String getNumeroBoleto(){
      return numeroDoBoleto;
   }
}