import Dominio.Sistema;
import Utils.BDUtils;
import spark.Spark;

import javax.persistence.EntityManager;

public class main {

    public static void main(String[] args) {
        Spark.path("/sistema", Sistema::definePaths);
    }

}
