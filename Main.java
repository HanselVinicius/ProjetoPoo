public class Main {


    public static void main(String[] args) {
        Video[] v = new Video[3];
        Gafanhoto[] g = new Gafanhoto[2];
        Visualizacao[] visualizacao = new Visualizacao[4];
        v[0] = new Video("Programacao");
        v[1] = new Video("POO");
        v[2] = new Video("Ponteiros");

        g[0] = new Gafanhoto("joberson",20,'M',"joberrssssun");
        g[1] = new Gafanhoto("juvina",19,'M',"juvinA+");
         visualizacao[0] = new Visualizacao(g[0],v[1]);
         visualizacao[1] = new Visualizacao(g[0],v[0]);



        System.out.println((v[0].toString()));
        System.out.println((v[1].toString()));
        System.out.println((v[2].toString()));
        System.out.println("-----------------------------------------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("/n");
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString());
        visualizacao[1].avaliar(3);
        System.out.println(visualizacao[1].toString());
    }
}
