import java.io.File;

public class Main {

    public static void main(String[] args) {

        //Dosya nesnesi oluşturduk
        File file = new File("Dosya1");

        try{
            file.createNewFile();
        }catch(Exception e){
            e.getStackTrace();
            //getStackTrace bir dizi yıgın izleme ögesi döndürür.
            //özel durum atılırken yığın izleme bilgilerini almak için
        }
        //Dosyanın yeni adını içeren nesne oluşturduk.
        File newFile = new File("Dosya2");

        boolean value = file.renameTo(newFile);
        //renameTo kullanarak dosyayı yeniden adlandırdık

        if(value) {
            System.out.println("İsim değiştirilir.");
        }else{
            System.out.println("İsim değiştirilemez.");
        }
    }
}
