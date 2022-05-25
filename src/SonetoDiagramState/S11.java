package SonetoDiagramState;

public class S11 extends Estado {
    
    public S11() {
        nombreEstado = "S11";
    }

    @Override
    public void e() {
        nombreEstado = "S12";
    }

    @Override
    public void d() {
        
    }

    @Override
    public void c() {
        nombreEstado = "S15";
    }

    @Override
    public void b() {
        
    }

    @Override
    public void a() {
        
    }

}
