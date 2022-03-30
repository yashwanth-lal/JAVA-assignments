package javaAssignments;
//below class is for Node creation
class Node {
    int data;
    Node next;//here the type is class type itself because it holds the reference of next node
    Node(int d)
    {
        data = d;
        next = null;
    }
}
 class SList {
    Node head;
    SList()
    {
        head=null;//here first the head value is assigned with null because at first no nodes are created, hence head is null.
    }

    public SListIterator iterator()
    {
        return new SListIterator(head);//this is calling the constructor function and passing the head value i.e. null
    }
}

 class SListIterator {

    Node head;
    SListIterator(Node head){
        this.head = head;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;//because the modification of head is not a good practice we are taking temp for travelling through nodes.
            while (temp.next != null) {
                temp = temp.next;//this step is for travelling through nodes and to reach the end node, thats it
            }
            temp.next = newNode;//this step is that ,the temp reaches to end node.
        }
        //return list;
    }

    public void remove()
    {
        if(head.next!=null)
        {
            head= head.next;
        }
        else
        {
            head=null;
        }
    }

    public void printList() {
        Node temp = head;//this step is, the temp again comes to the starting point from end node so as to print the values from the start.
        System.out.print("LinkedList: ");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
class Main {
    public static void main(String[] args)
    {
        SList list = new SList();
        SListIterator listIterator = list.iterator();

        listIterator.insert(10);
        listIterator.insert(20);
        listIterator.insert(30);
        listIterator.insert(40);

        listIterator.remove();
        //listIterator.remove();
        listIterator.printList();
    }
}
