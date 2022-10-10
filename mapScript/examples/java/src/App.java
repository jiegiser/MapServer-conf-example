public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] str = { "../tests/data/iso-subset.shp", "../tests/data/iso-subset.dbf" };
        ShapeInfo.main(str);
    }
}
