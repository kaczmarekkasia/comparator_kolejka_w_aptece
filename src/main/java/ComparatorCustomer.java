import java.util.Comparator;

public class ComparatorCustomer implements Comparator<Customer> {
    public int compare(Customer o1, Customer o2) {
        if (!o1.isWCiązy() && (o2.isWCiązy())) {
            return 1;
        }
        if (o1.isWCiązy() && (!o2.isWCiązy())) {
            return -1;
        }
        if ((o1.getWiek() > 60) && (o2.getWiek() < 60)) {
            return -1;
        }
        if ((o1.getWiek() < 60) && (o2.getWiek() > 60)){
                return 1;
        }
        return 0;
    }
}
//
////        if ((!o1.isWCiązy()) && (o2.getWiek() > 60) || (o1.isWCiązy()) && (o2.getWiek() > 60)){//zaprzeczamy isWCiazy bo "z automatu"jest false
////            return 1;
////
////        }if ((o1.isWCiązy()) && (o2.getWiek() < 60)) {
////        return -1;
////    }
////        return 0;}
//return 0;
//    }
