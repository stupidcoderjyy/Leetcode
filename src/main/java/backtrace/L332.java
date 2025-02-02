package backtrace;

import java.util.*;

public class L332 {
    final Map<String, Map<String, Integer>> tickets = new HashMap<>();
    final List<String> path = new ArrayList<>();
    List<String> result;

    public List<String> findItinerary(List<List<String>> tickets) {
        buildMap(tickets);
        path.add("JFK");
        recurse(tickets.size());
        return result;
    }

    private void buildMap(List<List<String>> tickets) {
        for (List<String> t : tickets) {
            this.tickets.computeIfAbsent(t.get(0), key -> new TreeMap<>())
                    .compute(t.get(1), (key, old) -> old == null ? 1 : old + 1);
        }
    }

    private void recurse(int ticketsLeft) {
        if (ticketsLeft == 0) {
            result = new ArrayList<>(path);
            return;
        }
        Map<String,Integer> locs = tickets.get(path.get(path.size() - 1));
        if (locs == null) {
            return;
        }
        for (var e : locs.entrySet()) {
            String to = e.getKey();
            if (e.getValue() == 0) {
                continue;
            }
            locs.computeIfPresent(to, (k, i) -> i - 1);
            path.add(to);
            recurse(ticketsLeft - 1);
            if (result != null) {
                return;
            }
            locs.computeIfPresent(to, (k, i) -> i + 1);
            path.remove(path.size() - 1);
        }
    }
}
