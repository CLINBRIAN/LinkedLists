public class Main {
    public static void main(String[] args) {
            Nodes head = new Nodes();
            Nodes middle = new Nodes();
            Nodes last = new Nodes();
            //assigning values to nodes
            head.data= 10;
            middle.data = 20;
            last.data = 30;
            //reference to the next nodes
            head.next = middle;
            middle.next = last;
            last.next = null;

            Nodes temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }

    }
}