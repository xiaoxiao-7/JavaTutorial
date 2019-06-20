
/**
*  	The queue retrieval operations 
* 	poll, remove, peek, and element access the element 
*	at the head of the queue.
*/
public class PriorityQueue {

	// 包含比较器的优先队列构造函数
	PriorityQueue(Comparator<? super E> comparator)

	PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]> () {
		@Override
		public int compare(int[] o1, int[] o2) {
			return o2[0] - o1[0];
		}
	})

	PriorityQueue<Integer> queue = new PriorityQueue<>();
	boolean flag = queue.add(1);
	queue.clear();
	boolean result = queue.contains(1);

	Iterator<Integer> it = queue.iterator();

}

/**
注意1：该队列是用数组实现，但是数组大小可以动态增加，容量无限。

注意2：队列的实现不是同步的。不是线程安全的。如果多个线程中的任意线程从结构上修改了列表， 则这些线程不应同时访问 PriorityQueue实例。保证线程安全可以使用PriorityBlockingQueue 类。

注意3：不允许使用 null 元素。

注意4：插入方法（offer()、poll()、remove() 、add() 方法）时间复杂度为O(log(n)) ；
remove(Object) 和 contains(Object) 时间复杂度为O(n)；
检索方法（peek、element 和 size）时间复杂度为常量。

注意5：方法iterator()中提供的迭代器并不保证以有序的方式遍历优先级队列中的元素。（原因可参考PriorityQueue的内部实现）
如果需要按顺序遍历，可用Arrays.sort(pq.toArray())。

Java Queue中 add/offer，element/peek，remove/poll区别 @link{https://blog.csdn.net/u012050154/article/details/60572567}

抛异常的：add, remove, element
插入失败返回false：offer
返回null：poll, peek

下面是Java中Queue的一些常用方法：
add         增加一个元索         		如果队列已满，则抛出一个IIIegaISlabEepeplian异常
remove   	移除并返回队列头部的元素    	如果队列为空，则抛出一个NoSuchElementException异常
element  	返回队列头部的元素         	如果队列为空，则抛出一个NoSuchElementException异常
offer       添加一个元素并返回true   	如果队列已满，则返回false
poll        移除并返问队列头部的元素    	如果队列为空，则返回null
peek       	返回队列头部的元素         	如果队列为空，则返回null
put         添加一个元素             	如果队列满，则阻塞
take        移除并返回队列头部的元素    
*/