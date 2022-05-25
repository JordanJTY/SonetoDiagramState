package SonetoDiagramState;

public class SonetoDiagramState {

    public static void main(String[] args) {
        Contexto contexto = new Contexto(); //EMPIEZA EN EL ESTADO A
        contexto.muestraEstado();
        contexto.a();//
        contexto.muestraEstado(); //MUESTRA EL NOMBRE DEL ESTADO
        contexto.b();//
        contexto.muestraEstado();
        contexto.b();//
        contexto.muestraEstado();
        contexto.a();//
        contexto.muestraEstado();
        contexto.a();//
        contexto.muestraEstado();
        contexto.b();//
        contexto.muestraEstado();
        contexto.b();//
        contexto.muestraEstado();
        contexto.a();//
        contexto.muestraEstado();

        /*//CDC DCD
        contexto.c();//
        contexto.muestraEstado();
        contexto.d();//
        contexto.muestraEstado();
        contexto.c();//
        contexto.muestraEstado();
        contexto.d();//
        contexto.muestraEstado();
        contexto.c();//
        contexto.muestraEstado();
        contexto.d();//
        contexto.muestraEstado();*/

        //CDE CDE
        contexto.c();//
        contexto.muestraEstado();
        contexto.d();//
        contexto.muestraEstado();
        contexto.e();//
        contexto.muestraEstado();
        contexto.c();//
        contexto.muestraEstado();
        contexto.d();//
        contexto.muestraEstado();
        contexto.e();//
        contexto.muestraEstado();
    }
}