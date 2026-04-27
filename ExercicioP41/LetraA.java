//4-a) Ler dois valores numéricos inteiros e apresentar 
// o resultado da diferença do maior pelo menor valor.

void main(){

    float A = Float.parseFloat(IO.readln("Informe o primeiro Numero: "));
    float B = Float.parseFloat(IO.readln("Informe o segundo Numero: "));

    if(A>B)
        float Resultado = A-B;
        IO.println("A diferença dos número é " + Resultado);
    else(B > A)   
        float Resultado = B-A;
        IO.println("A diferença dos número é " + Resultado);

}
