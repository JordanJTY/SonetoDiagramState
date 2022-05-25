package SonetoDiagramState;

public class Contexto {

    public Estado estadoActual;

    public Contexto() {
        this.estadoActual = new S1();
    }

    public void a() { //EN FUNCIÓN DEL ESTADO EN EL QUE ESTÉ SE TRANSITARÁ A UNO U OTRO
        asignaEstado(estadoActual.nombreEstado);
        estadoActual.a();
    }

    public void b() { //EN FUNCIÓN DEL ESTADO EN EL QUE ESTÉ SE TRANSITARÁ A UNO U OTRO
        asignaEstado(estadoActual.nombreEstado);
        estadoActual.b();
    }

    public void c() { //EN FUNCIÓN DEL ESTADO EN EL QUE ESTÉ SE TRANSITARÁ A UNO U OTRO
        asignaEstado(estadoActual.nombreEstado);
        estadoActual.c();
    }

    public void d() { //EN FUNCIÓN DEL ESTADO EN EL QUE ESTÉ SE TRANSITARÁ A UNO U OTRO
        asignaEstado(estadoActual.nombreEstado);
        estadoActual.d();
    }

    public void e() { //EN FUNCIÓN DEL ESTADO EN EL QUE ESTÉ SE TRANSITARÁ A UNO U OTRO
        asignaEstado(estadoActual.nombreEstado);
        estadoActual.e();
    }

    public String getNombreEstado() {
        return estadoActual.getNombreEstado();
    }

    public void muestraEstado() {
        System.out.println(estadoActual.getNombreEstado());
    }

    public void asignaEstado(String nombreEstado) {
        switch (nombreEstado) {
            case "S1":
                estadoActual = new S1();
                break;
            case "S2":
                estadoActual = new S2();
                break;
            case "S3":
                estadoActual = new S3();
                break;
            case "S4":
                estadoActual = new S4();
                break;
            case "S5":
                estadoActual = new S5();
                break;
            case "S6":
                estadoActual = new S6();
                break;
            case "S7":
                estadoActual = new S7();
                break;
            case "S8":
                estadoActual = new S8();
                break;
            case "S9":
                estadoActual = new S9();
                break;
            case "S10":
                estadoActual = new S10();
                break;
            case "S11":
                estadoActual = new S11();
                break;
            case "S12":
                estadoActual = new S12();
                break;
            case "S13":
                estadoActual = new S13();
                break;
            case "S14":
                estadoActual = new S14();
                break;
            case "S15":
                estadoActual = new S15();
                break;
            case "S16":
                estadoActual = new S16();
                break;
            case "S17":
                estadoActual = new S17();
                break;
        }
    }
}
