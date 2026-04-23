void main() {
    float n1 = Float.parseFloat(IO.readln("Insira o primeiro número: "));
    float n2 = Float.parseFloat(IO.readln("Insira o segundo número: "));
    float n3 = Float.parseFloat(IO.readln("Insira o terceiro número: "));

    float media = (n1 +n2 +n3)/3; 

    IO.println("A média dos números é: " + media);
}