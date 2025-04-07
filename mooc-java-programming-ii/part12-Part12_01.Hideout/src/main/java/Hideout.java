public class Hideout <T> {

    T t;

    public Hideout(){}

    public void putIntoHideout(T toHide){
            t=toHide;
    }

    public T takeFromHideout (){

        T t2 = t;
        t = null;

        return t2;
    }

    public boolean isInHideout(){

        return t != null;
    }

}
