public class StaticList <T>{
    T data;
    int size;
    T[] lista;

    public void StaticList(int size){
        this.lista = (T[]) new Object[size];
    }
    public void clear(){
        int i = 0;
        while (i < lista.length){
            lista[i] = null;
        }
    }
    public void add(T data){
        int i = 0;
        boolean per = true;
        while (i < lista.length){
            if (lista[i] == null){
                lista[i] = data;
                System.out.println("Valor "+ data + " inserido na posição "+i);
                return;
            }
            System.out.println("A lista está cheia ");
        ~ç}
    }
    public void addPos(T data, int pos){
        int i = 0;


        }
    }

}
