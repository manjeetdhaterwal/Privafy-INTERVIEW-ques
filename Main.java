class help
{
    public static java.util.HashMap<Integer,Integer> h = new java.util.HashMap<>();
    public static void add(int data)
    {
        if(h.containsKey(data))
        {
            h.put(data,h.get(data)+1);
        }
        else
        {
            h.put(data,1);
        }
    }
    public static void remove(int data)
    {
        if(h.get(data)>1)
        {
            h.replace(data,h.get(data)-1);
        }
        else
        {
            h.remove(data);
        }
    }
}
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        next=null;
    }
}
class linkedlist
{
    node head;
    public void add(int data)
    {
        if(head==null)
        {
            head=new node(data);
        }
        else
        {
            int flag=0;
            node curr=head;
            while(curr.next!=null)
            {
                if(curr.data==data)
                {
                    flag=1;
                    break;
                }
                curr=curr.next;
            }
            
            if(flag==1)
            {
                help.add(data);
            }
            else
            {
                node new_node = new node(data);
                curr=head;
                while(curr.next!=null)
                {
                    curr=curr.next;
                }
                curr.next=new_node;
            }
            
        }
        
    }
    
    public void remove(int data)
    {
        int flag=0;
        if(help.h.containsKey(data))
        {
            help.remove(data);
        }
        else
        {
            node curr = head;
            while(curr.next!=null)
            {
                if(curr.next.data==data)
                {
                    flag=1;
                    break;
                }
                curr=curr.next;
            }
            if(flag==1)
            {
                curr=head;
                while(curr.next.data!=data)
                {
                    curr=curr.next;
                }
                curr.next=curr.next.next;
            }
            else
            {
                System.out.println("element dosent exist");
            }
            
        }
    }
    
    public void print()
    {
        node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    linkedlist l = new linkedlist();
	    l.add(1);
	    l.add(2);
	    l.add(3);
	    l.add(4);
	    l.add(5);
	    l.print();
	    System.out.println();
	    l.add(2);
	    l.add(2);
	    l.print();
	    System.out.println();
	    l.remove(5);
	    l.remove(2);
	    l.print();
	    System.out.println();
	    l.remove(2);
	    l.remove(2);
	    l.print();
	    System.out.println();
	    l.remove(2);
	}
}
