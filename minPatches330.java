public int minPatches(int[] nums, int n) {
	long missing = 1;
	int cnt = 0;
	for (int i = 0; i < nums.length;) {
		if (nums[i] <= missing) {
			missing += nums[i];
			i += 1;
		} else {
			cnt += 1;
			missing *= 2;
		}
	}
	return cnt;
}