package SonetoDiagramState;

import static SonetoDiagramState.Estado.nombreEstado;

public class S7 extends Estado {
    
    public S7() {
        nombreEstado = "S7";
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
        nombreEstado = "S8";
    }

    @Override
    public void a() {
        
    }

}
