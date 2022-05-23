package heap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testInheritance() {
        MaxHeap maxheap = new MaxHeap(15);

        assertTrue(maxheap instanceof MaxHeap);
    }

    @Test
    public void testMaxHeap_first() {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        assertEquals(84, maxHeap.extractMax());
    }

    @Test
    public void testMaxHeap_second() {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(94);
        maxHeap.insert(12);
        maxHeap.insert(0);
        maxHeap.insert(22);
        maxHeap.insert(9);
        assertEquals(94, maxHeap.extractMax());
    }
    
    @Test
    public void testMaxHeap_position() {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(94);
        maxHeap.insert(12);
        maxHeap.insert(4);
        maxHeap.insert(22);
        maxHeap.insert(9);
        
        assertEquals(84, maxHeap.Heap[maxHeap.leftChild(0)]);
        assertEquals(19, maxHeap.Heap[maxHeap.rightChild(0)]);
    }

}
