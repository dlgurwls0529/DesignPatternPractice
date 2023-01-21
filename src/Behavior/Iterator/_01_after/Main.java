package Behavior.Iterator._01_after;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.addBoard("aaa");
        board.addBoard("bbbb");
        board.addBoard("cc");
        board.addBoard("ddddd");
        board.addBoard("deeee");
        board.addBoard("ffffff");

        // 최근에 들어간 순서대로 조회, FIFO
        Iterator iterator = board.getIterator();
        while(iterator.hasNext()) {
            System.out.println(((Post)iterator.next()).getTitle());
        }

        /* 가장 최신 글 먼저 순회
        for(int i = posts.size()-1; i >= 0; i--) {
            System.out.println(posts.get(i).getTitle());
        }*/

    }
}
