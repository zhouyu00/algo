package main

import "fmt"

//两个数组的二分法
func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	l := len(nums1) + len(nums2)
	if l%2 == 1 {
		midIndex := l / 2
		return float64(getKthElement(nums1, nums2, midIndex+1))
	} else {
		midIdx1, midIdx2 := l/2-1, l/2
		return float64(getKthElement(nums1, nums2, midIdx1+1)+getKthElement(nums1, nums2, midIdx2+1)) / 2.0
	}
	return 0

}

//得到第k个元素
func getKthElement(nums1, nums2 []int, k int) int {
	idx1, idx2 := 0, 0
	for {
		if idx1 == len(nums1) {
			return nums2[idx2+k-1]
		}
		if idx2 == len(nums2) {
			return nums1[idx1+k-1]
		}
		if k == 1 {
			return min(nums1[idx1], nums2[idx2])
		}
		half := k / 2
		newIdx1 := min(idx1+half, len(nums1)) - 1
		newIdx2 := min(idx2+half, len(nums2)) - 1
		p1, p2 := nums1[newIdx1], nums2[newIdx2]
		if p1 <= p2 {
			k -= (newIdx1 - idx1 + 1)
			idx1 = newIdx1 + 1
		} else {
			k -= (newIdx2 - idx2 + 1)
			idx2 = newIdx2 + 1
		}
	}
	return 0
}

func min(x, y int) int {
	if x < y {
		return x
	}
	return y
}

func main() {
	a := []int{1, 3, 4, 9}
	b := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}

	res := findMedianSortedArrays(a, b)
	fmt.Println(res)

}
