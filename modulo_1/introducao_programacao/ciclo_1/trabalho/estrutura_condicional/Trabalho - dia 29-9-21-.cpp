//Daniel Dantas, Pedro Rangel, Diogo Di Blasi;
#include <stdio.h>

int main()
{
    int qtdeBrindes = 0, dia;
    printf("Informe a quatidade de brindes: ");
    scanf("%d",&qtdeBrindes);
    while (qtdeBrindes > 0)
    {
        printf("\nInforme o dia do aniversario do convidado: ");
        scanf("%d",&dia);
        if (dia %2 == 0)
        {
            printf("Parabens!\n");
            qtdeBrindes --;
        }
    
        else
        {
            printf("\nNao foi dessa vez...\n");
        }
    }    
    return 0;
}

/*Uma empresa, para se tornar conhecida do público jovem, decidiu sortear
brindes na entrada de uma festa. Como não há brinde para todos, serão
premiados apenas os convidados cujo dia de aniversário seja um valor par.
Faça um programa em C que implemente um sistema para a distribuição de
brindes. Inicialmente o sistema deve receber o número de brindes que serão
distribuídos. Enquanto houver brindes disponíveis, o sistema deve solicitar que
o convidado que ingressa na festa informe o dia do seu aniversário. Se o
convidado tiver direito ao brinde (dia de aniversário par), o sistema deve exibir a
mensagem “PARABÉNS” e atualizar a quantidade de brindes. Quando não
houver mais brindes para distribuir, o sistema deve finalizar a distribuição e exibir
a mensagem “PROMOÇÃO ENCERRADA”.*/

/*  for (cont = 0; cont <= brindeNum; cont++)
        ;
    if (diaPar % 2 == 0)
        ;
    {
        printf("Parabens");
    }*/

/* do
    {
        printf("Informe o dia do seu aniversario: ");
        scanf("%d", &diaPar);
        cont++;
    }

    while (diaPar % !2);
    if (diaPar % 2 == 0)
        ;
    {
        printf("parabens");
    } */