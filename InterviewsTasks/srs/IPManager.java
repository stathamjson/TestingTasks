import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IPManager {
    private Map<String, Integer> IPStats = new HashMap<>();
    private Set<String> IPBanlist = new HashSet<>();

    public void add(String ip, int count) {
        if (!IPBanlist.contains(ip)) {
            IPStats.merge(ip, count, Integer::sum);
        }
    }

    public String getMostActive() {
        return IPStats.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public void ban(String ip) {
        IPStats.remove(ip);
        IPBanlist.add(ip);
    }
}
