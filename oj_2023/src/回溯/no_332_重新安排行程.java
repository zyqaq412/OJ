package 回溯;

import java.util.*;

/**
 * @title: no_332_重新安排行程
 * @Author zxwyhzy
 * @Date: 2023/11/2 14:23
 * @Version 1.0
 */
public class no_332_重新安排行程 {
    // 能过 会超时
/*    List<String> ans;
    List<String> temp = new ArrayList<>();
    boolean[] bool;

    public List<String> findItinerary(List<List<String>> tickets) {
        bool = new boolean[tickets.size()];
        process(tickets);
        return ans;
    }

    private int compareItineraries(List<String> itinerary1, List<String> itinerary2) {
        for (int i = 0; i < itinerary1.size(); i++) {
            int cmp = itinerary1.get(i).compareTo(itinerary2.get(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        return 0;
    }
    private void process(List<List<String>> tickets) {
        if (temp.size() == tickets.size() + 1) {
            if (ans == null || compareItineraries(temp, ans) < 0) {
                ans = new ArrayList<>(temp);
            }
            return;
        }

        for (int i = 0; i < tickets.size(); i++) {
            if (bool[i]) continue;
            if (temp.size() == 0 && tickets.get(i).get(0).equals("JFK")) {
                bool[i] = true;
                temp.add(tickets.get(i).get(0));
                temp.add(tickets.get(i).get(1));
                process(tickets);
                bool[i] = false;
                temp.remove(temp.size() - 1);
                temp.remove(temp.size() - 1);
            } else {
                if (temp.size() != 0 && temp.get(temp.size() - 1).equals(tickets.get(i).get(0))) {
                    bool[i] = true;
                    temp.add(tickets.get(i).get(1));
                    process(tickets);
                    bool[i] = false;
                    temp.remove(temp.size() - 1);

                }
            }
        }
    }*/


    // 构建一个图，使用优先队列来确保目的地按字典顺序排列
    Map<String, PriorityQueue<String>> graph = new HashMap<>();

    // 存储最终结果的列表
    List<String> ans = new ArrayList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        // 从机票构建图
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.computeIfAbsent(from, k -> new PriorityQueue<>()).offer(to);
        }

        // 从 JFK 开始深度优先搜索
        visit("JFK");
        return ans;
    }

    private void visit(String airport) {
        while (graph.containsKey(airport) && !graph.get(airport).isEmpty()) {
            // 选择目的地中字典序最小的机场并标记为已访问
            String nextAirport = graph.get(airport).poll();
            visit(nextAirport);
        }
        // 将机场按逆序添加到结果中
        ans.add(0, airport);
    }

}
