import java.util.ArrayList;
import java.util.List; 

//utilizamos interface contendo varios metodos genericos podendo ser utilizada em muitas classes distintas
interface Comportamento {
  void andar();
  void correr();
  void saltar();
}
//outra interface para mostra que é possivel implementar mais de uma ao mesmo tempo, coisa que na herança não é possive 
interface SerVivo {
  void nascer();
  void crescer();
  void envelheceu();
}
//a classe pessoa implementa a inteface comportamento e serVivo sendo possivel fazer todos os metodos dessas interfaces 
 class Pessoa implements Comportamento,SerVivo {
    private String nome;
    public Pessoa(String nome) {
    this.nome = nome;}
//metodos da interface SerVivo
@Override
  public void nascer() {
    System.out.println("A pessoa " + nome + " nasceu"); }
@Override
  public void crescer() {
    System.out.println("A pessoa " + nome + " cresceu"); }
@Override
  public void envelheceu() {
    System.out.println("A pessoa " + nome + " envelheceu"); }
//////////////////////////////////////////////////////////
//metodos da interface Comportamento 
@Override
     public void andar() {
    System.out.println("A pessoa esta andando"); }
@Override
     public void correr() {
    System.out.println("A pessoa está correndo");}
@Override
     public void saltar() {
    System.out.println("A pessoa está saltando");}
}
 // criei a classe animal implementando as duas interfaces, mas criei apenas para junto ao codigo utilizar herança 
 //aplicando o conceito de polimorfismo por interface mesmo com herança 
class Animal implements Comportamento,SerVivo{
     public void andar(){};
     public void correr() {};
     public void saltar() {};
    
     public void nascer(){};
     public void crescer(){};
     public void envelheceu(){};
}
 // dessa forma a classe cachorro extende de animal que por usa vez possui os metodos da interface 
class Cachorro extends Animal {
    @Override
    public void nascer(){
        System.out.println("O cachorro nasceu"); };
    @Override
    public void correr() {
    System.out.println("O cachorro esta correndo");

  }
}
//da mesma forma eu utilizei com a classe gato, mesclando os metodos das duas interfaces
class gato extends Animal {
    @Override
    public void crescer(){
        System.out.println("O gato cresceu");};
    @Override
    public void andar() {
        System.out.println("O gato esta andando");
  }
}

//da mesma forma eu utilizei com a classe galinha, mesclando os metodos das duas interfaces
class Galinha extends Animal {
    @Override
    public void envelheceu(){
        System.out.println("A galinha envelheceu");
    };
    @Override
  public void saltar() {
    System.out.println("A galinha está saltando");
  }
}
// para o teste criei um arraylist to tipo das duas interfaces
public class TestandoInterface {
    public static void main(String[] args) {
         List<Comportamento> comportamentos = new ArrayList<>();
         List<SerVivo> vivos = new ArrayList<>();
         //
comportamentos.add(new Pessoa("bia"));
comportamentos.add(new Cachorro());
comportamentos.add(new gato());
comportamentos.add(new Galinha());

vivos.add(new Pessoa("bia"));
vivos.add(new Cachorro());
vivos.add(new gato());
vivos.add(new Galinha());

for (Comportamento comportamento : comportamentos) {
  comportamento.andar();
  comportamento.correr();
  comportamento.saltar();
}
  
for (SerVivo serVivo : vivos) {
  serVivo.nascer();
  serVivo.crescer();
  serVivo.envelheceu();
}
}
}
