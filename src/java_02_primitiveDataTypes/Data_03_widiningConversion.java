package java_02_primitiveDataTypes;

public class Data_03_widiningConversion {

    public static void main(String[] args) {

		/*
		 * In Java, we can convert between integer values and floating-point values.
		 * Also, since every character corresponds to a number in the Unicode encoding,
		 * char types can be converted to and from the integer and floating-point types.
		 * boolean is the only primitive datatype that cannot be converted to or from any
		 * other primitive datatype.
		 *
           There are two types of conversions: widening conversion and narrowing conversion.

           A widening conversion is when a value of one datatype is converted to a value of another
           data type that occupies more bits than the former.There is no issue of data loss in this case.

           Correspondingly, A narrowing conversion is when a value of one datatype is converted
           to a value of another datatype that occupies fewer bits than the former.
           Data loss can occur in this case.

           Java performs widening conversions automatically. But if you want to perform
           a narrowing conversion (if you are sure that no data loss will occur),
           then you can force Java to perform the conversion using
           a language construct known as a cast.

           --> İki tür dönüştürme vardır: dönüştürmeyi genişletme ve dönüştürmeyi daraltma.

              Genişleyen dönüştürme, bir veri türünün değerinin başka bir veri türünün değerine dönüştürülmesidir.
           öncekinden daha fazla bit kaplayan veri türü. Bu durumda veri kaybı sorunu yoktur.

              Buna bağlı olarak, daraltma dönüşümü, bir veri türünün değerinin dönüştürülmesidir.
           öncekinden daha az bit kaplayan başka bir veri türünün değerine.
           Bu durumda veri kaybı meydana gelebilir.

              Java, genişletme dönüşümlerini otomatik olarak gerçekleştirir. Ama gerçekleştirmek istersen
           daraltma dönüşümü (veri kaybı olmayacağından eminseniz),
           daha sonra Java'yı kullanarak dönüştürmeyi gerçekleştirmeye zorlayabilirsiniz.
           döküm olarak bilinen bir dil yapısı.

		 */

        //Widening

        int a = 1;
        double d = a; // valid conversion to double, no cast needed (widening)

    }
}
