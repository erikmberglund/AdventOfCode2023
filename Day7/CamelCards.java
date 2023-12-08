import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Day7
 */
public class CamelCards {
    LinkedList<HandWithValue>[] rankingList = new LinkedList[6];

    public static void main(String[] args) {
        CamelCards cc = new CamelCards();
        File input = new File("input.txt");
        try{
            Scanner sc = new Scanner(input);
            while (sc.hasNext()) {
                String hand = sc.next();
                int rank = cc.getRank(hand);
                int bid = sc.nextInt();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error was " + e);
        }
    }
        
    enum Type {
        FIVEOFAKIND,
        FOUROFAKIND,
        FULLHOUSE,
        THREEOFAKIND,
        TWOPAIR,
        ONEPAIR,
        HIGHCARD
    }

    private Type getType(Collection<Integer> numberOfCardsPerValue) {
        List<Integer> list = new ArrayList<>(numberOfCardsPerValue);
        Collections.sort(list, Comparator.reverseOrder()); // 
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer);
        }
        switch (sb.toString()) {
            case "5":
                return Type.FIVEOFAKIND;
            case "41":
                return Type.FOUROFAKIND;
            case "32":
                return Type.FULLHOUSE;
            case "311":
                return Type.THREEOFAKIND;
            case "221":
                return Type.TWOPAIR;
            case "2111":
                return Type.ONEPAIR;
            case "11111":
                return Type.HIGHCARD;
            default:
        }
        return null;
    }


    private int insertHandInList(String hand, int bid) {
        char c;
        HashMap<Character, Integer> cards = new HashMap<Character, Integer>();
        for (int i = 0; i < hand.length(); i++) {
            c = hand.charAt(i);
            Integer cardOccurrences = cards.get(c);
            if(cardOccurrences == null) {
                cardOccurrences = 0;
            }
            cards.put(c, ++cardOccurrences);
        }
        Collection<Integer> numberOfCardsPerValue = cards.values();
        
        Type type = getType(numberOfCardsPerValue);
        System.out.println(type);
        return 0;
    }

    private void insertHandInRankingList(HandWithValue h, Type type){
        switch (type) {
            case value:
                
                break;
        
            default:
                break;
        }
    }

    class HandWithValue{
        String hand;
        int bid;
        public HandWithValue(String hand, int bid) {
            this.hand = hand;
            this.bid = bid;
        }
    }
    
    // Den länkade listan har en hand och ett bud

}