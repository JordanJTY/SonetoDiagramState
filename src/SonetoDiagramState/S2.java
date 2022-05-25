package SonetoDiagramState;

public class S2 extends Estado {
    
    public S2() {
        nombreEstado = "S2";
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
        nombreEstado = "S3";
    }

    @Override
    public void a() {

    }

}
