package pertemuan11;

public class ContohInnerClass {
    private String nama;
    private Mapper<String,String> defaultTitleMapper = new TitleMapper();

    public ContohInnerClass(String nama) {
        this.nama = nama;
    }

    class TitleMapper implements Mapper<String,String> {
        public String konversi(String input) {
            return "Bapak/Ibu " + input;
        }
    }

    // titleMapper ada dependensi yang kita inject
    // dependency injection
    public void sapa(Mapper<String,String> titleMapper) {
        if (titleMapper == null) {
            System.out.println(
                "Hello " + this.defaultTitleMapper.konversi(nama)
            );
            return;
        }

        System.out.println(
            "Hello " + titleMapper.konversi(nama)
        );
    }

    public static void main(String []args) {
        ContohInnerClass a = new ContohInnerClass("Budi");

        a.sapa(null);
        a.sapa(new SomeMapper());

        // Anonymous class
        a.sapa(new Mapper<String,String>() {

            @Override
            public String konversi(String input) {
                return "Bro/Sis " + input;
            }

        });
    }
}

class SomeMapper implements Mapper<String,String> {

    @Override
    public String konversi(String input) {
        return "Saudara/Saudari " + input;
    }

}
