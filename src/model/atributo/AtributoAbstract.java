package model.atributo;

public abstract class AtributoAbstract implements Atributo {

    private float value;

    public AtributoAbstract(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
