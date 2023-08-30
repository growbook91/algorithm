//package 달리기_경주;
//
//import java.util.HashMap;
//
//class Solution {
//
//    public void switchPalyers(String a, String b){
//        int temp = playersMap.get(a);
//        playersMap.remove(a);
//        playersMap.put(a, playersMap.get(b));
//        playersMap.remove(b);
//        playersMap.put(b, temp);
//    }
//
//    public void overtaking(){
//
//    }
//
//    public HashMap<String, Integer> getPlayers() {
//        return playersMap;
//    }
//
//    public void setPlayers(String[] players) {
//        int i = 0;
//        for(String player : players){
//            playersMap.put(player, i++);
//        }
//    }
//
//    private HashMap<String, Integer> playersMap = new HashMap<>(50000);
//
//    public String[] solution(String[] players, String[] callings) {
//
//        //callings를 차례대로 읽으면서 누군지를 알아내야 하고 그게 어딨는지도 알아야 한다.
//        for(String call : callings){
//
//        }
//        return getPlayers();
//    }
//
//}
