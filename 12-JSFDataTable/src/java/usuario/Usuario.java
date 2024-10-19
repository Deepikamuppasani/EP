/**
 *
 * @author jean
 */
package usuario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

@ManagedBean(name = "Usuario")
@RequestScoped
public class Usuario {

    private String nombre;
    private String apellido;
    private String sexo;
    private Date fecnac = new Date();
    private String add1;
    private String pasatiempo;
    private Byte hermanos;
    private Double salario = 1550.25564;
    private Integer testInt = 12900;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String sexo, Date fecnac, String add1, String pasatiempo, Byte hermanos, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fecnac = fecnac;
        this.add1 = add1;
        this.pasatiempo = pasatiempo;
        this.hermanos = hermanos;
        this.salario = salario;
    }

    public String onSubmit() {
        return "success";
    }

    public void validateCCExpiry(FacesContext cntx, UIComponent cmp, Object val) {
        System.out.println("Validando la entrada " + val);
        String messS = null;
        String[] fields = ((String) val).split("/", 3);
        if (fields.length != 2) {
            messS = "Se espera MM/AA!";
        } else {
            int month = 0;
            int year = 0;
            try {
                month = Integer.parseInt(fields[0]);
                year = Integer.parseInt(fields[1]);
            } catch (NumberFormatException e) {
            }
            if (month <= 0 || month > 12) {
                messS = "Mes " + fields[0] + " invalido!";
            } else if (year < 0 || year > 99) {
                messS = "A&ntild:o " + fields[1] + " invalido!";
            } else {
                GregorianCalendar cal = new GregorianCalendar();
                int thisMonth = cal.get(Calendar.MONTH) + 1;
                int thisYear = cal.get(Calendar.YEAR) - 2000;
                if (year < thisYear || year == thisYear && month < thisMonth) {
                    messS = "Tarjeta vencida!";
                }
            }
        }
        if (messS != null) {
            FacesMessage mess = new FacesMessage(messS);
            cntx.addMessage(cmp.getClientId(cntx), mess);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFecnac() {
        return fecnac;
    }

    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(String pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setHermanos(Byte hermanos) {
        this.hermanos = hermanos;
    }

    public Double getSalario() {
        return salario;
    }

    public Byte getHermanos() {
        return hermanos;
    }

    public void setTestInt(Integer testInt) {
        this.testInt = testInt;
    }

    public Integer getTestInt() {
        return testInt;
    }
}