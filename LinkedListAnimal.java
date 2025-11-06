public class LinkedListAnimal
{
    private static class Node
    {
        public Animal data;
        public Node next;

        public Node(Animal data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public  Node(Animal data)
        {
            this(data, null);
        }

        public   Node(Node next)
        {
            this(null, next);
        }

        public   Node()
        {
            this(null, null);
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public LinkedListAnimal()
    {
        head = new Node();
        tail = head;
        size = 0;
    }

    public int size()
    {
        return size;
    }
}
