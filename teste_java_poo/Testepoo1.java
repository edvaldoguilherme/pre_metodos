import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Testepoo1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        SimpleDateFormat calendariobr = new SimpleDateFormat("dd/mm/yyyy");

        /*nome e precos relacionados aos barbeiros e seus cortes */
        String barbeiro1="jorge",barbeiro2="joão",barbeiro3="paulo",barb_escolhido="";
        int contbarb1=5,contbarb2=7,contbarb3=4;
        double comissaobarb1=0,comissaobarb2=0;
        double saldobarb1=125,saldobarb2=175,saldobarb3=100;
        double preco_corte_simples=25,preco_corte_hidrataçao=35,preco_barba_simples=25,preco_barba_hidratacao=35,preco_cabelo_barba=45,preco_cabelo_barba_hidratacao=60,limpeza_de_pele=45,servico_completo=100;
        int escolhaservico;
        double contacorte=0,saldoGerente=375;
        /*estes dados estarão pré defiinidos pelo sistema apenas para a escolha do cliente*/

        /*produto e estoque*/
        String produto1="minoxidil",produto2="creme de cabelo";
        int quantidade_produto1=35,quantidade_produto2=50;
        int codigoproduto1=12,codigoproduto2=46;
        int count_prod1=0,count_prod2=0;
        double valorVendaProd1=45,valorVendaProd2=50;
        double valorCustoProd1=28, valorCustoProd2=40;
        double valorProdutoSeparado=0;
        /*produto e estoque*/

        int idpessoa,cont_cortes=0;
        String nome,cpf,email,telefone,logradouro,cidade_que_reside,data_nasc;
        double conta=0;

        /*simulando um banco de dados no sistema */
        int idpessoa1=1,cont_cortes1=9;
        String nome1="nikson",cpf1="70415625478",email1="nikson@gmail.com",telefone1="81999998888",logradouro1="rua maria das dores,154",cidade_que_reside1="recife",data_nasc1="15/08/2000";
        int idpessoa2=3,cont_cortes2=4;
        String nome2="marcos",cpf2="26315625588",email2="marcos@gmail.com",telefone2="81888889999",logradouro2="rua maria das gracas,154",cidade_que_reside2="olinda",data_nasc2="02/04/1997";
         /*simulando um banco de dados no sistema */

         System.out.println("\n\n\n\n\n\nbem vindo ao sistema da sua barbearia favorita\n\nVocê já possui cadastro em nosso sistema?\nCaso sim, digite seu codigo unico e instransferivel\nCaso não digite seu novo código.(lembre-se que este código será para sempre seu.)\n\n\nLEMBRANDO QUE O SEU 10 SERVICO É POR NOSSA CONTA");
        idpessoa=ent.nextInt();
            if(idpessoa==1){
                idpessoa=idpessoa1; nome=nome1; cont_cortes=cont_cortes1; cpf=cpf1;email=email1;telefone=telefone1;logradouro=logradouro1;cidade_que_reside=cidade_que_reside1;data_nasc=data_nasc1;
               
            }
            else if(idpessoa==2){
                idpessoa=idpessoa2; nome=nome2; cont_cortes=cont_cortes2; cpf=cpf2;email=email2;telefone=telefone2;logradouro=logradouro2;cidade_que_reside=cidade_que_reside2;data_nasc=data_nasc2;
            }
            else{
                ent.nextLine();
                System.out.println("bem vindo pela primeira vez ao nosso sitema, digite seu nome:");
                nome=ent.nextLine();
                System.out.println("digite seu cpf");
                cpf=ent.nextLine();
                System.out.println("digite seu email");
                email=ent.nextLine();
                System.out.println("digite seu telefone");
                telefone=ent.nextLine();
                System.out.println("digite seu endereço");
                logradouro=ent.nextLine();
                System.out.println("digite sua cidade q reside");
                cidade_que_reside=ent.nextLine();
                System.out.println("digite sua data de nascimento(com barras)");
                data_nasc=ent.nextLine();
            }

        System.out.println("\n\n\n\nbem vindo, "+nome+"! Escolha com qual barbeiro você deseja realizar seu servico\nJorge DIGITE-1\nJoão DIGITE-2\nPaulo DIGITE-3");
        int escolhabarb=ent.nextInt();
        if(escolhabarb==1){
            contbarb1=contbarb1+1;
            System.out.println("barbeiro paulo escolhido\n\n\n");
            barb_escolhido=barbeiro1;

        }
        else if(escolhabarb==2){
            contbarb2=contbarb2+1;
            System.out.println("barbeiro João escolhido\n\n\n");
            barb_escolhido=barbeiro2;

        }
        else if(escolhabarb==3){
            contbarb3=contbarb3+1;
            System.out.println("barbeiro Jorge escolhido\n\n\n");
            barb_escolhido=barbeiro3;

        }



        System.out.println("\nqual servico você deseja realizar\ncorte simples: 25R$ DIGITE-1\ncorte + hidratação: 35R$ DIGITE-2\nbarba simples: 25R$ DIGITE-3\nbarba + hidratação: 35R$ DIGITE-4\ncabelo+barba= 45R$ DIGITE-5\ncabelo + barba + hidratacao: 60R$ DIGITE-6\nlimpeza de pele= 45R$ DIGITE-7\nservico completo: 100R$ DIGITE-8\nPara apenas comprar produtos digite qualquer outro valor");
        escolhaservico=ent.nextInt();
     
                if(escolhaservico==1){
                    conta=conta+preco_corte_simples;
                    System.out.println("bom serviço!");
                    cont_cortes=cont_cortes+1;
                    contacorte=preco_corte_simples;
                }
                else if(escolhaservico==2){
                    conta=conta+preco_corte_hidrataçao;
                    System.out.println("bom serviço!");
                    cont_cortes=cont_cortes+1;
                    contacorte=preco_corte_hidrataçao;
                }
                else if(escolhaservico==3){
                    conta=conta+preco_barba_simples;
                    System.out.println("bom serviço!");
                    cont_cortes=cont_cortes+1;
                    contacorte=preco_barba_simples;
                }
                else if(escolhaservico==4){
                    conta=conta+preco_barba_hidratacao;
                    System.out.println("bom serviço!");
                    cont_cortes=cont_cortes+1;
                    contacorte=preco_barba_hidratacao;
                }   
                else if(escolhaservico==5){
                    conta=conta+preco_cabelo_barba;
                    System.out.println("bom serviço!");
                    cont_cortes=cont_cortes+1;
                    contacorte=preco_cabelo_barba;
                }   
                else if(escolhaservico==6){
                    conta=conta+preco_cabelo_barba_hidratacao;
                    System.out.println("bom serviço!");
                    cont_cortes=cont_cortes+1;
                    contacorte=preco_cabelo_barba_hidratacao;
                }
                else if(escolhaservico==7){
                    conta=conta+limpeza_de_pele;
                    System.out.println("bom serviço!");
                    contacorte=limpeza_de_pele;
                }
                else if(escolhaservico==8){
                    conta=conta+servico_completo;
                    System.out.println("bom serviço!");
                    cont_cortes=cont_cortes+1;
                    contacorte=servico_completo;
                }
                else{
                    conta=0;
                    cont_cortes=cont_cortes;
                    System.out.println("vamos aos produtos");


                }
                
            System.out.println("\n\n\n\n\n\n\n\n\n\nvocê deseja conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
            int conhecer_produtos=ent.nextInt();
            while (conhecer_produtos!=2) {
                System.out.println("digite o codigo de um de nossos produtos para adicionar ao carrrinho:\nMinoxidil:R$35 COD-12\nCreme de cabelo: R$50 COD-46");
                int cod_produto=ent.nextInt();
                if(cod_produto==12){
                    conta=conta+35;
                    count_prod1++;
                    quantidade_produto1=quantidade_produto1-1;
                    System.out.println("PEDIDO REALIZADO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                    conhecer_produtos=ent.nextInt();
            }
                else if(cod_produto==46){
                    conta=conta+50;
                    count_prod2++;
                    quantidade_produto2=quantidade_produto2-1;
                    System.out.println("PEDIDO REALIZADO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                    conhecer_produtos=ent.nextInt();
            }
                else{
                    System.out.println("CODIGO INVALIDO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                    conhecer_produtos=ent.nextInt();
            }}
            valorProdutoSeparado=conta-contacorte;

            int estoqueMinoxidil=quantidade_produto1-count_prod1;
            int estoqueCreme=quantidade_produto2-count_prod2;
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

            if(conta==0){
                System.out.println("seu atendimento foi encerrado sem compras, lhe aguardamos numa proxima visita, "+nome+"!");
            }
            else{
                if(cont_cortes<10){
                System.out.println("Olá "+" espero que esteja satisfeito com nosso servico :)\nA conta pelo seu corte geral pelo seu serviço é de: "+conta+"\n\n");
                    if(escolhabarb==1){
                        saldobarb1=saldobarb1+(contacorte/2)+(valorProdutoSeparado*5/100);
                        System.out.println(barbeiro1+" este corte lhe rendeu R$"+contacorte/2+" e seu valor diário geral é de: R$"+saldobarb1+"\n\n\n\n");

            double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            double saldoSemDescontos=saldoGerente+contacorte+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            Double custoProdutos=valorProdutoSeparado-(count_prod1*valorCustoProd1)-(count_prod2*valorCustoProd2)-(valorProdutoSeparado*5/100);
            double descontos=valorbarbeiros+custoProdutos;

            saldoGerente=saldoSemDescontos-descontos;

            System.out.println("GERENTE:"+
            "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                    }
                    else if(escolhabarb==2){
                        saldobarb2=saldobarb2+(contacorte/2)+(valorProdutoSeparado*5/100);
                        System.out.println(barbeiro2+" este corte lhe rendeu R$"+contacorte/2+" e seu valor diário geral é de: R$"+saldobarb2+"\n\n\n\n");

            double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            double saldoSemDescontos=saldoGerente+contacorte+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            Double custoProdutos=valorProdutoSeparado-(count_prod1*valorCustoProd1)-(count_prod2*valorCustoProd2)-(valorProdutoSeparado*5/100);
            double descontos=valorbarbeiros+custoProdutos;

            saldoGerente=saldoSemDescontos-descontos;

            System.out.println("GERENTE:"+
            "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                        
                    }
                    else if(escolhabarb==3){
                        saldobarb3=saldobarb3+(contacorte/2)+(valorProdutoSeparado*5/100);
                        System.out.println(barbeiro3+" este corte lhe rendeu R$"+contacorte/2+" e seu valor diário geral é de: R$"+saldobarb3+"\n\n\n\n");

            double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            double saldoSemDescontos=saldoGerente+contacorte+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            Double custoProdutos=valorProdutoSeparado-(count_prod1*valorCustoProd1)-(count_prod2*valorCustoProd2)-(valorProdutoSeparado*5/100);
            double descontos=valorbarbeiros+custoProdutos;

            saldoGerente=saldoSemDescontos-descontos;

            System.out.println("GERENTE:"+
            "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                        
                    }

            }
            else{
                        if(escolhabarb==1){
                        contacorte=0;
                        saldobarb1=saldobarb1+valorProdutoSeparado*5/100;
                        System.out.println(barbeiro1+" este corte lhe rendeu R$"+contacorte/2+" e seu valor diário geral é de: R$"+saldobarb1+"\n\n\n\n");

            double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            double saldoSemDescontos=saldoGerente+contacorte+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            Double custoProdutos=valorProdutoSeparado-(count_prod1*valorCustoProd1)-(count_prod2*valorCustoProd2)-(valorProdutoSeparado*5/100);
            double descontos=valorbarbeiros+custoProdutos;

            saldoGerente=saldoSemDescontos-descontos;

            System.out.println("GERENTE:"+
            "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                    }
                    else if(escolhabarb==2){
                        contacorte=0;
                        saldobarb2=saldobarb2+valorProdutoSeparado*5/100;
                        System.out.println(barbeiro2+" este corte lhe rendeu R$"+contacorte/2+" e seu valor diário geral é de: R$"+saldobarb2+"\n\n\n\n");

            double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            double saldoSemDescontos=saldoGerente+contacorte+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            Double custoProdutos=valorProdutoSeparado-(count_prod1*valorCustoProd1)-(count_prod2*valorCustoProd2)-(valorProdutoSeparado*5/100);
            double descontos=valorbarbeiros+custoProdutos;

            saldoGerente=saldoSemDescontos-descontos;

            System.out.println("GERENTE:"+
            "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                        
                    }
                    else if(escolhabarb==3){
                        contacorte=0;
                        saldobarb3=saldobarb3+valorProdutoSeparado*5/100;
                        System.out.println(barbeiro3+" este corte lhe rendeu R$"+contacorte/2+" e seu valor diário geral é de: R$"+saldobarb3+"\n\n\n\n");
            double valorbarbeiros=saldobarb1+saldobarb2+saldobarb3;
            double saldoSemDescontos=saldoGerente+contacorte+valorProdutoSeparado+saldobarb1+saldobarb2+saldobarb3;
            Double custoProdutos=valorProdutoSeparado-(count_prod1*valorCustoProd1)-(count_prod2*valorCustoProd2)-(valorProdutoSeparado*5/100);
            double descontos=valorbarbeiros+custoProdutos;

            saldoGerente=saldoSemDescontos-descontos;

            System.out.println("GERENTE:"+
            "\nValor em caixa sem os descontos de custo: R$"+saldoSemDescontos+
            "\na comissão dos barbeiros está nos valores de: Jorge-"+saldobarb1+" João-"+saldobarb2+" Paulo-"+saldobarb3+
            "\nO valor de descontos de custo de produto+comissao de barbeiros é de R$"+descontos+
            "\nseu saldo geral após este corte é de: R$"+saldoGerente);
            
                        
                    }

            }

            System.out.println("seu estoque de Minoxidil contem: "+estoqueMinoxidil+" unidades");
            System.out.println("seu estoque de Creme contem: "+estoqueCreme+" unidades");









            }

            












































    }
}
