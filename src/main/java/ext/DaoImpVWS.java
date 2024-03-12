package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("VWS")
public class DaoImpVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version web service");
        return 90;
    }
}
