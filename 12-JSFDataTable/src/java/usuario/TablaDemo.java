/**
 *
 * @author jean
 */
package usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "TablaDemo")
@ApplicationScoped
public final class TablaDemo {

    List<Usuario> data = new ArrayList();

    public TablaDemo() {
        populateData();
    }

    public List getData() {
        return data;
    }

    public void setData(Usuario a) {
        data.add(a);
    }

    public void populateData() {
        data.add(new Usuario("Jean", "Duchens", "M", new Date(), "CAR", "Java", (byte) 2, 2500.80));
        data.add(new Usuario("Pierre", "Durám", "M", new Date(), "CAR", "Java", (byte) 2, 25.08));
        data.add(new Usuario("Gissela", "Le-Roy", "F", new Date(), "CAR", "Java", (byte) 2, 1205.05));
        data.add(new Usuario("Hugo", "Castro", "M", new Date(), "CAR", "Java", (byte) 2, 1205.05));
        data.add(new Usuario("Miguel", "Fuenzalida", "M", new Date(), "CAR", "Java", (byte) 2, 1205.05));
        data.add(new Usuario("Carla", "Castro", "F", new Date(), "CAR", "Java", (byte) 2, 1205.05));
    }
}