package HomeTask02_1;

@FunctionalInterface
public interface IsLegalAge<T, V> {
    V isLegalAge(T age);

    default void isLegalAgeDef(int age, String name) {
        System.out.println(age > 18 ?
                String.format("%s - совершеннолетний", name) :
                String.format("%s - не совершеннолетний", name));
    }
    static void isLegalAgeStat(int age, String name) {
        System.out.println(age > 18 ?
                String.format("%s - совершеннолетний", name) :
                String.format("%s - не совершеннолетний", name));
    }
}
