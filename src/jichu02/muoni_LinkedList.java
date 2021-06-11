/*package jichu02;
/*ArrayList与LinkedList:
*
* 相同点：都是List集合常用的实现类；对集合中的元素操作的方法基本一致
*
* 场景：
* 若对集合中的元素，增删操作不频繁，查询频繁，使用ArrayList,反之，用LinkedList 链表增删效率比较高，查询效率较低，与数组相反
*


 * @Auther: Datalong
 * @Date: 2021/2/20 - 02 -20 -17:20
 * @Dscription: 模拟实现LinkedList
 * @version: 1.0

public class muoni_LinkedList<E> {

    private class Node{
        E element;//节点数据类型为E 每个节点
        Node previous;//存放上一个节点
        Node next;

        public Node(E element) {//通过alt+inster 生成Node类的构造方法
            this.element = element;
        }
    }

    private Node first;
    private Node last;
    private int count;//记录双向链表节点的个数

    public void add(E element){//添加元素
        Node node = new Node(element);//创建一个节点
        if(count==0){
            this.first=node;//节点数为0，说明是空链表；新节点作为头结点
        }else
        {
            this.last.next=node;
            node.previous=this.last;//把新节点的上一个节点设置为链表之前的尾节点
        }
        this.last=node;//链表的尾节点设置为新的节点
        count++;
    }

    public void add(int index,E element){
        Node node = new Node(element);//实例化新的节点
        if(index == 0){
            this.first.previous = node;//新的节点要插入到链表的头
            node.next=this.first;//新节点的下一个是当前节点的头结点
            this.first = node;//把新节点设置为头结点
        }else if(index == count){//新节点作为尾节点
            this.last.next = node;//尾节点的下节点是新节点
            node.previous=this.last;//新的前节点就是当前的尾节点
            this.last=node;//新节点就作为尾节点了
        }else{//既不是头结点也不是尾节点
            Node target = getNode(index);//根据下标传入方法得到相应节点
            node.next=target;
            node.previous = target.previous;
            target.previous.next=node;
            target.previous = node;
        }
        count++;
    }


    private Node getNode(int index){//在类内部调用是私有的
        if(index<0 || index>=count)
        {
            throw new IndexOutOfBoundsException("下标越界");//引发一个异常 提示内容
        }
        Node node = this.first;
        for(int i=0;)
    }
}*/


