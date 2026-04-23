// calcular o aumento de um percentual sobre o salário

void main(){

    float salario = Float.parseFloat(IO.readln("Insira o valor do salário: "));
    float percentual = Float.parseFloat(IO.readln("Insira o percentual de aumento: "));

    float novoSalario = salario + (salario * (percentual/100));

    IO.println(" O novo salário é: "+ novoSalario);
}