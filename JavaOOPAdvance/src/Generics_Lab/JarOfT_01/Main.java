package Generics_Lab.JarOfT_01;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) {
        Jar<Pickle> pickleJar = new Jar<>();

        pickleJar.add(new Pickle());
        pickleJar.add(new Pickle());

        Pickle pickle = pickleJar.remove();

    }

}
