package 力扣LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
有 n 位用户参加活动，他们的 ID 从 0 到 n - 1，每位用户都 恰好 属于某一用户组。给你一个长度为 n 的数组 groupSizes，
其中包含每位用户所处的用户组的大小，请你返回用户分组情况（存在的用户组以及每个组中用户的 ID）。
你可以任何顺序返回解决方案，ID 的顺序也不受限制。此外，题目给出的数据保证至少存在一种解决方案。

示例 1：
输入：groupSizes = [3,3,3,3,3,1,3]
输出：[[5],[0,1,2],[3,4,6]]
解释： 
其他可能的解决方案有 [[2,1,6],[5],[0,4,3]] 和 [[5],[0,6,2],[4,3,1]]。

示例 2：
输入：groupSizes = [2,1,3,3,3,2]
输出：[[1],[0,5],[2,3,4]]

提示：
groupSizes.length == n
1 <= n <= 500
1 <= groupSizes[i] <= n
 */
public class 用户分组 {

	public static void main(String[] args) {
		int[] groupSizes = { 3,3,3,3,3,1,3 };
		System.out.println(groupThePeople(groupSizes));
	}

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < groupSizes.length; i++) {
			if (!map.containsKey(groupSizes[i])) {
				map.put(groupSizes[i], new ArrayList<>());
			}
			List<Integer> sub = map.get(groupSizes[i]);
			sub.add(i);
			map.put(groupSizes[i], sub);
			if (sub.size() == groupSizes[i]) {
				result.add(new ArrayList<>(sub));
				sub.clear();
			}
		}
		return result;
	}

}
