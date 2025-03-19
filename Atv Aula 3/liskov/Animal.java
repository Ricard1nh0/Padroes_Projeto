//Exemplo Correto

package liskov;

public abstract class Animal {
    
    public abstract void emitirSom();

}

class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }
}

class Gato extends Animal{
    
    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }

    /*O principio é respeitado pois a classe animal pode ser substituida
     *  por cachorro ou gato sem que o programa se comporte diferente
     */
}
