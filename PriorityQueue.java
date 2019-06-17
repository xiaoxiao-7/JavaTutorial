public class PriorityQueue {
	PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]> () {
		@Override
		public int compare(int[] o1, int[] o2) {
			return o2[0] - o1[0];
		}
	})
}