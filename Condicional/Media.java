void main(){
    float n1 = Float.parseFloat(IO.readln("Insira a nota 1: "));
    float n2 = Float.parseFloat(IO.readln("Insira a nota 2: "));
    float n3 = Float.parseFloat(IO.readln("Insira a nota 3: "));

    float media= (n1 + n2 + n3)/3;

    if (media>=7)
        IO.println("Aprovado com média: "+ media);
    else
        System.out.printf("Reprovado com média: %.2f \n", media);
}