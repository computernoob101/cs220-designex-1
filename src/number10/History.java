package number10;

import java.util.LinkedList;
import java.util.List;

public class History {
    private List<CriminalRecord> list = new LinkedList<>();

    public void addCriminalRecord(CriminalRecord record){
        list.add(record);
    }

    public boolean allExplained(){
        for (CriminalRecord c : list) {
            if (!c.isExplained()) {
                return false;
            }
        }
        return true;
    }
}
