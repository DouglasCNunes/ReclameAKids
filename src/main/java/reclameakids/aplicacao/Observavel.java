package reclameakids.aplicacao;

public abstract class Observavel {

    private List<Observador> monitores = new ArrayList();

    public void addObservador(Observador ob) {
        this.monitores.add(ob);
    }

    public void deleteObservador(Observador ob) {
        monitores.remove(ob);
    }

    public void notificarObservadores() {
        for(Observador ob : monitores) {
            ob.notificar(this);
        }
    }
}