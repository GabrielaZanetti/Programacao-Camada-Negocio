package aula2;

/**
 * @author gabriela.zanetti
 */
public class TesteBox {

    public static void main(String[] args) {
//        // testar BoxStr
//        BoxStr str = new BoxStr();
//        
//        str.setValue("teclado");
//        System.out.println("value: "+str.getValue());
//        
//        // testar BoxInteger
//        BoxInteger id = new BoxInteger();
//        
//        id.setValue(5);
//        System.out.println("id: "+id.getValue());
        
        // testar BoxObject
        BoxObj obj = new BoxObj();
        
        obj.setValue("Teclado");
        System.out.println("Objeto string: "+obj.getValue());
//        obj.setValue(5);
//        System.out.println("Objeto inteiro: "+obj.getValue());
        
        if (obj.getValue() instanceof String) {
            String id = (String) obj.getValue();
            System.out.println("Objeto id: "+id);
        } else if (obj.getValue() instanceof Integer) {
            Integer id = (int) obj.getValue();
            System.out.println("Objeto id: "+id);
        }
    }
}
