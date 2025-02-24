public class LerTabela {
    public static void LerTabela(Class<?> clazz) {
        Tablezin t = clazz.getAnnotation(Tablezin.class);
        System.out.println(t);
    }
}