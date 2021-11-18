package dominio;

import java.util.ArrayList;

public class Libreta {
    public ArrayList<Contacto> contactos = new ArrayList<>();
    private String contacto;

    public void annadirContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public String toString() {
        StringBuilder datos = new StringBuilder();
        for (Contacto contacto : contactos) {
            datos.append(contacto.toString() + "\n");
        }
        return datos.toString();
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
