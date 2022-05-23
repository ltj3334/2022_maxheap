package heap;

public class App 
{
    public static void main( String[] args )
    { 
        heap.MaxHeap maxHeap = new heap.MaxHeap(15);
 
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
 
        System.out.println("The max val is "
                           + maxHeap.extractMax());
        

        /**
         * 위의 예시 입력, 출력 결과 
        Parent Node : 84 Left Child Node: 22 Right Child Node: 19
        Parent Node : 22 Left Child Node: 17 Right Child Node: 10
        Parent Node : 19 Left Child Node: 5 Right Child Node: 6
        Parent Node : 17 Left Child Node: 3 Right Child Node: 9
        The max val is 84
         */

    }
}


class MaxHeap {
    public int[] Heap;
    private int size;
    private int maxsize;
 
    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }
 
    public int parent(int pos) { return (pos - 1) / 2; }
 
    public int leftChild(int pos) { return (2 * pos) + 1; }
 
    public int rightChild(int pos){ return (2 * pos) + 2; }
 
    private boolean isLeaf(int pos)
    {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }
 
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    private void maxHeapify(int pos)
    {
        if (isLeaf(pos))
            return;
 
        if (Heap[pos] < Heap[leftChild(pos)]
            || Heap[pos] < Heap[rightChild(pos)]) {
 
            if (Heap[leftChild(pos)]
                > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }
 
    public void insert(int element)
    {
        Heap[size] = element;
 
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            /* 코드 작성 부분, 구현되어 있는 swap합수 활용할 것 */ 
            
            break; // break문은 mvn test 시 무한 loop에 빠지지 않기 위해 인위적으로 선언한 것임.
            // 학생들은 코드 작성하고 반드시 break문을 지울 것.
        }
        size++;
    }
 
    public void print()
    {
       
      for(int i=0;i<size/2;i++){
 
            System.out.print("Parent Node : " + Heap[i] );
             
            if(leftChild(i)<size)
               System.out.print( " Left Child Node: " + Heap[leftChild(i)]);
             
            if(rightChild(i)<size)
                System.out.print(" Right Child Node: "+ Heap[rightChild(i)]);
             
                System.out.println();
             
        }
           
    }
 
    public int extractMax()
    {
        int popped = Heap[0];
        Heap[0] = Heap[size--];
        maxHeapify(0);
        return popped;
    }
 
}