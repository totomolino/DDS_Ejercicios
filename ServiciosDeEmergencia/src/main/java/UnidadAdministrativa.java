import java.util.ArrayList;
import java.util.List;

public class UnidadAdministrativa extends Base{


    List<Base> bases = new ArrayList<>();


    public int cantAmbulancias(){
        int sum = bases.stream().mapToInt(Base::cantAmbulancias).sum();
        return sum;
    }

    @Override
    public int tiempoMedioAsistencia() {
        int sum = bases.stream().mapToInt(Base::tiempoMedioAsistencia).sum();
        int cantBases = this.cuantasBases();
        return sum/cantBases;
    }
    @Override
    public int cuantasBases() {
        int cuantasBasesHay = bases.stream().mapToInt(Base::cuantasBases).sum();
        return cuantasBasesHay;
    }

}
