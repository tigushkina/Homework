import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Omar on 14.12.2014.
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "Quainton Road railway station was opened in 1868 near Quainton, Buckinghamshire, " +
                "44 miles (71 km) from London. It was built by the Aylesbury and Buckingham Railway after pressure " +
                "from the 3rd Duke of Buckingham to route the railway near his home. It connected with the Brill Tramway, which carried goods " +
                "from the duke's estates and passengers from Brill, and was heavily used despite its geographical isolation. Both lines were " +
                "absorbed in 1891 by the Metropolitan Railway (MR), which operated from Aylesbury to London. When the Great Central Railway from" +
                " the north of England opened in 1899, Quainton Road became a significant junction. The MR became part of the London Passenger " +
                "Transport Board's London Underground in 1933. The Brill Tramway was closed in 1935, and Underground trains were withdrawn north" +
                " of Aylesbury after 1936. Quainton Road closed to passengers in 1963 and to goods in 1966. In 1969 the Quainton Road Society was" +
                " formed; it restored and reopened the station as the Buckinghamshire Railway Centre. ";
        String[] words = str.split("\\s");
        System.out.println("Найти и поменять местами самое короткое и самое длинное слово ");

        String minWord = words[0];
        String maxWord = words[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < minWord.length()) {
                minIndex = i;
                minWord = words[i];
            }

            if (words[i].length() > maxWord.length()) {
                maxIndex = i;
                maxWord = words[i];
            }
        }
        String temp = words[minIndex];
        words[minIndex] = words[maxIndex];
        words[maxIndex] = temp;
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
        System.out.println(minWord + " " + maxWord);
        System.out.println("Количество слов в тексте " + words.length);

        System.out.println(" Посчитать повторяющиеся слова ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            System.out.println(words[i] + " " + count);
            count = 0;

        }
    }

}
