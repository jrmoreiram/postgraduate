import java.util.Date;
import java.sql.Timestamp;

public class StringComparePerformance {

    public static void main(String[] args) {

        System.out.println("============================ StringBuffer ===================================");
    
        Date sDate = new Date();
        long sTime = sDate.getTime();

        System.out.println("StringBuffer start time: " + new Timestamp(sTime));

        StringBuffer s = new StringBuffer("AA");

        for (int i = 0; i < 10000; i++) {
            s.append(i);
        }

        Date eDate = new Date();

        long eTime = eDate.getTime();

        System.out.println("StringBuffer end time: " + new Timestamp(eTime));

        System.out.println("Time spent to execute StringBuffer process: " + (eTime - sTime) + "ms");

        System.out.println("============================ String =========================================");

        Date strDate = new Date();

        long strTime = strDate.getTime();

        System.out.println("String start time: " + new Timestamp(strTime));

        String str = new String("AA");

        for (int i = 0; i < 10000; i++) {
            str += i;
        }

        Date eStrDate = new Date();

        long eStrTime = eStrDate.getTime();

        System.out.println("String end time: " + new Timestamp(eStrTime));

        System.out.println("Time spent to execute String process: " + (eStrTime - strTime) + "ms");
		
        System.out.println("============================ StringBuilder ==================================");
		
        Date sDateB = new Date();
        long sTimeB = sDateB.getTime();

        System.out.println("StringBuilder start time: " + new Timestamp(sTimeB));

        StringBuilder b = new StringBuilder("BB");

        for (int i = 0; i < 10000; i++) {
            b.append(i);
        }

        Date bDate = new Date();

        long bTime = bDate.getTime();

        System.out.println("StringBuilder end time: " + new Timestamp(bTime));

        System.out.println("Time spent to execute StringBuilder process: " + (bTime - sTimeB) + "ms");

        System.out.println("============================= String ========================================");
		
        Date strDataB = new Date();

        long strTimeB = strDataB.getTime();

        System.out.println("String start time: " + new Timestamp(strTimeB));

        String strB = new String("BB");

        for (int i = 0; i < 10000; i++) {
            strB += i;
        }

        Date eStrDateB = new Date();

        long eStrTimeB = eStrDateB.getTime();

        System.out.println("String end time: " + new Timestamp(eStrTimeB));

        System.out.println("Time spent to execute String process: " + (eStrTimeB - strTimeB) + "ms");
		
        System.out.println("=============================================================================");
		
    }

}