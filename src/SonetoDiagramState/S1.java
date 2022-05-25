package SonetoDiagramState;

public class S1 extends Estado {

    public S1() {
        nombreEstado = "S1";
    }

    @Override
    public void e() {

    }

    @Override
    public void d() {

    }

    @Override
    public void c() {

    }

    @Override
    public void b() {

    }

    @Override
    public void a() {
        nombreEstado = "S2";
    }

}
