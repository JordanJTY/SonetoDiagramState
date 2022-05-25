package SonetoDiagramState;

public class S3 extends Estado {
    
    public S3() {
        nombreEstado = "S3";
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
        nombreEstado = "S4";
    }

    @Override
    public void a() {

    }

}
