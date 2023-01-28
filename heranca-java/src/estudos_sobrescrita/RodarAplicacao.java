package estudos_sobrescrita;

class RodarAplicacao {
    public static void main(String[] args) {

        // Criei um vetor, do tipo classe mãe que chamei de classes, tem 3 objetos
        // dentro desse vetor
        ClasseMae[] classes = new ClasseMae[] { new ClasseFilho1(), new ClasseFilho2(), new ClasseMae() };

        // percorri os 3 objetos e chamei o método 1 de cada um deles
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilho2 classeFilho2 = new ClasseFilho2();
        classeFilho2.metodo2();
    }
}
