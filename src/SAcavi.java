public class SAcavi {
    /*
    public class Main {
   static Scanner sc = new Scanner(System.in);
    static char[][] board = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
    };
    public static void main(String[] args) {

       char me ='X';


       while(true){
           printBoard();
           int row = sc.nextInt();
           int col = sc.nextInt();
           board[row][col] = me;

           if(checkWin(me)){
               printBoard();
               System.out.println("player "+me+" won!!");
           }
           if(isBoardFull()){
               printBoard();
               System.out.println("DRAW!!");
           }

           me = (me=='X')?'O':'X';

       }

    }

    public static void printBoard(){
        System.out.println("-------------");
        for(int i=0;i<3;i++){
            System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+ " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }

    }

   static boolean isBoardFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' ')return false;
            }
        }
        return true;
    }

    static boolean checkWin(char me){
        for(int i=0;i<3;i++){
            if((board[i][0]==me && board[i][1]==me && board[i][2]==me)||
                    (board[0][i]==me && board[1][i]==me && board[2][i]==me)){
                return true;
            }
        }
        if ((board[0][0] ==me && board[1][1] == me && board[2][2] ==me) ||
                (board[0][2] == me && board[1][1] == me && board[2][0] == me)) {
            return true;
        }
        return false;

    }

}
     */
    //++++++++++++++++++++++++++++++++++++++++++ MULTY THREAD +++++++++++++++++++++++++++++++++++++++++++++++++

    /*
   class Counter {
    private int count = 0;

    // synchronized ensures only one thread updates at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread implements Runnable {
    private Counter counter;
    private String name;

    public CounterThread(Counter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            System.out.println(name + " incremented count to: " + counter.getCount());
            try {
                Thread.sleep(100); // simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterThread(counter, "Thread-1"));
        Thread t2 = new Thread(new CounterThread(counter, "Thread-2"));
        Thread t3 = new Thread(new CounterThread(counter, "Thread-3"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
     */
}
