import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float conta_cliente=0;
        float lucro_empresario=0;
        float comissao_barbeiro=0;
        float valor_corte=0;
        float valor_total_produto=0;
        int cod_Tipo_Servico;
        int conhecer_produtos;
        int cod_produto;

        System.out.println("digite seu nome");
        String nome_cliente=ent.nextLine();
        System.out.println("digite seu codigo de atendimento");
        int cod_Atendimento=ent.nextInt();

        String nome_Barbeiro1="paulo",nome_Barbeiro2="josé",nome_Barbeiro3="anderson";
    

        System.out.println("Qual barbeiro você "+nome_cliente+"deseja escolher:\n DIGITE 1-BARBEIRO PAULO\nDIGITE-2 BARBEIRO JOSÉ\nDIGITE 3-BARBEIRO ANDERSON");
        int cod_Barbeiro=ent.nextInt();
        if (cod_Barbeiro==1) {
            System.out.println("você escolheu o barbeiro "+nome_Barbeiro1);
        }
        else if (cod_Barbeiro==2) {
            System.out.println("você escolheu o barbeiro "+nome_Barbeiro2);
    
        }
        else if (cod_Barbeiro==3) {
            System.out.println("você escolheu o barbeiro "+nome_Barbeiro3);
        }
        System.out.println("senhor "+nome_cliente+" deseja fazer qual tipo de servico:\nOPÇÃO 2- CORTE SIMPLES:R$25\nOPÇÃO 2- CORTE+HIDRATAÇÃO CAPILAR:R$35\nOPÇÃO 3- BARBA SIMPLES: R$25\nOPÇÃO 4- BARBA+HIDRAATAÇÃO NA BARBA: R$35\nOPÇÃO 5- BARBA+CORTE SIMPLES: R$45\nOPÇÃO 6- CORTE+BARBA+HIDRATAÇÃO COMPLETA:60\nOPÇÃO 7- LIMPEZA DE PELE: R$55\nOPÇÃO 8- SERVIÇO COMPLETO: R$100");
        cod_Tipo_Servico=ent.nextInt();
        if(cod_Tipo_Servico==1){
            System.out.println("você escolheu corte simples");
            conta_cliente=conta_cliente+25;
            valor_corte=25;
            
        }
        else if(cod_Tipo_Servico==2){
            System.out.println("você escolheu corte+hidrataçao capilar");
            conta_cliente=conta_cliente+35;
            valor_corte=35;
        }
        else if(cod_Tipo_Servico==3){
            System.out.println("você escolheu barba simples");
            conta_cliente=conta_cliente+25;
            valor_corte=25;
        }
        else if(cod_Tipo_Servico==4){
            System.out.println("você escolheu barba+hidrataçao");
            conta_cliente=conta_cliente+35;
            valor_corte=35;
        }
        else if(cod_Tipo_Servico==5){
            System.out.println("você escolheu corte+barba");
            conta_cliente=conta_cliente+45;
            valor_corte=45;
        }
        else if(cod_Tipo_Servico==6){
            System.out.println("você escolheu corte+barba+hidratação completa");
            conta_cliente=conta_cliente+60;
            valor_corte=60;
        }
        else if(cod_Tipo_Servico==7){
            System.out.println("você escolheu limpeza de pele completa");
            conta_cliente=conta_cliente+55;
            valor_corte=55;
        }
        else if(cod_Tipo_Servico==8){
            System.out.println("você escolheu corte+barba+hidratação+limpeza de pele completa");
            conta_cliente=conta_cliente+100;
            valor_corte=100;
        }

        System.out.println("você deseja conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
        conhecer_produtos=ent.nextInt();
        while (conhecer_produtos!=2) {
            System.out.println("digite o codigo de um de nossos produtos para adicionar ao carrrinho:\nGel fixador:R$45 COD-40\nMinoxidil:R$35 COD-12\nCreme para cachos SEDA BOOM: R$22 COD-46");
            cod_produto=ent.nextInt();
            if(cod_produto==40){
                conta_cliente=conta_cliente+45;
                valor_total_produto=valor_total_produto+45;
                System.out.println("PEDIDO REALIZADO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                conhecer_produtos=ent.nextInt();
            }
            else if(cod_produto==12){
                conta_cliente=conta_cliente+35;
                valor_total_produto=valor_total_produto+35;
                System.out.println("PEDIDO REALIZADO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                conhecer_produtos=ent.nextInt();
            }
            else if(cod_produto==46){
                conta_cliente=conta_cliente+22;
                valor_total_produto=valor_total_produto+22;
                System.out.println("PEDIDO REALIZADO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                conhecer_produtos=ent.nextInt();
            }
            else{
                System.out.println("CODIGO INVALIDO!!!\nVocê deseja continuar a conhecer e adquirir produtos em nossa loja?\nDIGITE 1 PARA SIM\nDIGITE 2 PARA NÃO");
                conhecer_produtos=ent.nextInt();
            }

        }
        comissao_barbeiro=(valor_corte*50/100)+(valor_total_produto*10/100);
        lucro_empresario=(valor_corte*50/100)+(valor_total_produto*90/100);


        System.out.println("CONTA TOTAL DO CLIENTE "+nome_cliente+" com codigo: "+cod_Atendimento+" foi de: R$"+conta_cliente);

        if (cod_Barbeiro==1) {
            System.out.println("COMISSAO TOTAL DO BARBEIRO "+nome_Barbeiro1+" foi de: R$"+comissao_barbeiro);
        }
        else if (cod_Barbeiro==2) {
            System.out.println("COMISSAO TOTAL DO BARBEIRO "+nome_Barbeiro2+" foi de: R$"+comissao_barbeiro);
        }
        else if (cod_Barbeiro==3) {
            System.out.println("COMISSAO TOTAL DO BARBEIRO "+nome_Barbeiro3+" foi de: R$"+comissao_barbeiro);
        }
        System.err.println("LUCRO DO EMPRESARIO FOI DE: R$"+lucro_empresario);

        ent.close();

    }
}
