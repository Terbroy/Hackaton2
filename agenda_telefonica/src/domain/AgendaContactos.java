package domain;

public class AgendaContactos {
    private Contacto agenda[];
    private int MAX_CONTACTOS = 10;
    private int contadorContactos;


    public AgendaContactos(int maximoDatos){
        this.agenda = new Contacto[MAX_CONTACTOS];
        this.MAX_CONTACTOS = maximoDatos;
    }

    public void agregarContacto(Contacto contacto){
        boolean agendaDisponible = agendaLlena();
        boolean contacteExiste = existeContacto(contacto.getNombre());
        if (!agendaDisponible && !contacteExiste){
            this.agenda[this.contadorContactos] = contacto;
//            System.out.println("Contacto agregado" + agenda[this.contadorContactos]);
            this.contadorContactos++;//1
        }else{
            System.out.println("No fue posible agregar el contacto debido a que la agenda esta llena &/o el contacto ingresado ya existe en la agenda");
        }
    }

    public boolean agendaLlena(){
        if(this.contadorContactos <= this.MAX_CONTACTOS){
            return false;
        } else {
            System.out.println("Se ha excedido el numero de contactos");
            return true;
        }
    }

    public boolean existeContacto(String nombre){
        for (int i = 0; i < MAX_CONTACTOS; i++) {
            if (this.agenda[i] != null ){
                String nombreContactoAgenda = this.agenda[i].getNombre();
                if (nombre.equalsIgnoreCase(nombreContactoAgenda)){
                    System.out.println("Ya existe el contacto");
                    return true;
                }
            }
        }
        System.out.println("El contacto ingresado no existe");
        return false;
    }

    public void listarContactos(){
        System.out.println("La lista de contactos es la siguiente");
        for (int i = 0; i < this.agenda.length; i++) {
            if (this.agenda[i] != null ){
                System.out.println(agenda[i]);
            }
        }
    }

    public int espacioLibres (){
        int contador=0;
        for (int i = 0; i < this.MAX_CONTACTOS; i++) {
            if (this.agenda[i] == null ){
                ++contador;
            }
        }
        System.out.println("el numero de espacios libres son " + contador);
        return contador;
    }

    public void eliminarContacto(String nombre){
        for (int i = 0; i < this.agenda.length; i++) {
            String nombreContacto = this.agenda[i].getNombre();
            if (nombreContacto.equalsIgnoreCase(nombre)) {
                this.agenda[i]=null;
                System.out.println("El contacto " + nombre + " ha sido eliminado. \n");
                listarContactos();
                break;
            }
        }
    }

    public void buscarContacto(String nombre) {
        for (int i = 0; i < this.agenda.length; i++) {
            String nombreContacto = this.agenda[i].getNombre();
            if (nombreContacto.equalsIgnoreCase(nombre)) {
                System.out.println("Nombre: " + nombreContacto+ ", Teléfono: " + this.agenda[i].getTelefono());
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }






}
