import java.util.ArrayList;
import java.util.List; 

//Veja que temos uma classe de instrumentoMusical contendo um metodo vazio tocar
//dessa forma temos uma classe generica que pode ser utilizada em outras classes e sobreescrever o metodo tocar
//generalizando para uso de qualquer instrumento musical
 abstract class InstrumentoMusical {
    void afinar() {
        System.out.println("afinando");
    }
    void tocar() {
        System.out.println("O instrumento musical está tocando");
    }
}
// aqui temos a classe violão, que é um tipo de instrumento musical, ele extende da classe instrumentoMusical
//ao implementar o método que esta em instrumentoMusical tocar, sobreescrevemos o metodo para que dessa forma
// a classe violão seja uma classe especialista de instrumentoMusical , dessa forma o violão fará ação conforme o seu som
    class Violao extends InstrumentoMusical {
    @Override
    void tocar() {
        System.out.println("O violão está tocando");
    }
}
// perceba que temos outra classe de um tipo de instrumento, como a flauta, dessa forma ela extende de InstrumentoMusical
//e sobreescreve o metodo tocar, sendo assim o som da flauta é diferente do som o violão, mesmo que eles derivam de uma 
//classe generica em comum e possuem metodos iguais elas se comportam diferente
 class Flauta extends InstrumentoMusical {
    @Override
    void tocar() {
        System.out.println("A flauta está tocando");
    }
}
//Assim também ocorre com a bateria, possui o mesmo metodo que as outras duas classes, porem o seu "tocar" é diferente
//das classes "irmãs". 
class Bateria extends InstrumentoMusical {
    @Override
    void tocar() {
        System.out.println("A bateria esta tocando");
    }
}
//ao criar essa classe de instrumentos musicais podemos criar uma lista desses instrumentos para que cada novo instrumento
// que for criado e herdado da classe InstrumentoMusical seja executado com o metodo tocar 

class InstrumentosMusicais {
    public static void fazerInstrumentosTocar(List<InstrumentoMusical> banda)  {
    for (InstrumentoMusical instrumentos : banda) {
        instrumentos.afinar();
        instrumentos.tocar();
    
      }
    }
}
//sendo possivel adicionar cada instrumento na lista e instanciar 
public class TestandoHerança {
    public static void main(String[] args) {
    List<InstrumentoMusical> banda = new ArrayList<>();
    banda.add(new Violao());
    banda.add(new Flauta());
    banda.add(new Bateria());
    InstrumentosMusicais.fazerInstrumentosTocar(banda);

    }
}
   

    

    

