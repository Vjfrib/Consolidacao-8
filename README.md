# Implementação de código - Consolidação de aprendizado 8

Implemente um método sobrecarregado de calcular valor total dos rendimentos na classe Cliente da Consolidação 5 que receba, além da quantidade de meses, um percentual de bônus adicional a ser aplicado ao total calculado. Imagine uma forma de se aproveitar a implementação do método novo pelo método já pronto, alterando o mesmo.

---

## Método Sobrecarregado

é um metodo em _**Rendundância**_ para antender diferentes cenários, como no exemplo:
```
public class Calculadora {

// Método para somar dois inteiros
public int somar(int a, int b) {
    return a + b;
}

// Método sobrecarregado para somar dois doubles
public double somar(double a, double b) {
    return a + b;
}
```
Tecnicamente são diferentes versões de um método com o mesmo nome, mas com diferentes tipos ou números de parâmetros. 
  sobrecarga de método é uma forma de polimorfismo (polimorfismo de sobrecarga, overloading). 

Polimorfismo refere-se à capacidade de uma classe fornecer várias <span style="font-size: 15px;">implementações de métodos com o mesmo nome</span>, mas com comportamentos diferentes.

---